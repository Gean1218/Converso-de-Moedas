package br.com.atividades.converso.requisão;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Converso {
    private Map<String, Double> taxas;
    public Converso(String json){
        Gson gson = new Gson();
        var conv = gson.fromJson(json,Map.class);
        var conversionRates = (Map<String, Object>) conv.get("conversion_rates"); // extrai do Json os conversores
        this.taxas = new HashMap<>();
        //para ter certeza que os valores vai ser convertido em double
        for (Map.Entry<String, Object> entry : conversionRates.entrySet()){
            if(entry.getValue() instanceof Number){
                this.taxas.put(entry.getKey(), ((Number) entry.getValue()).doubleValue());
            }
        }
    }
    public double ObterTaxa(String moeda){
        return  taxas.getOrDefault(moeda,0.0);

    }
    public double converter(double valor, String de, String para) {
        double taxaDe = ObterTaxa(de);
        double taxaPara = ObterTaxa(para);
        return valor / taxaDe * taxaPara;
    }
}
