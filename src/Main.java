import br.com.atividades.converso.requisão.API;
import br.com.atividades.converso.requisão.Converso;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        try{
            API api = new API();
            System.out.println("====Converso do moedas=====");
            int i =0;
            int escolha = 0 ;
            double saldo;
            double convertido;
            Converso converso = new Converso(api.getResponseBody());
            do {

                System.out.println("Digite 1 para converte de real para dolar ou Dolar para real:");
                System.out.println("Digite 2 para converte de Real para yuan ou yuan para Real");
                System.out.println("Digite 3 para converte de Dolar par yuan ou de yuan para Dolar");
                System.out.println("Digite 4 para converte de Real para euro ou de euro para Real");
                System.out.println("Digite 5 Para converte de Dolar para Euro ou Euro para Dolar");
                System.out.println("Digite 6 Para converte De Real para Libra ou Libra para Real");
                System.out.println("Digite 0 para sair");
                i = leitura.nextInt();
                switch (i){
                    case 1:
                        System.out.println("Digite 1 para converte de R$ para US$:");
                        System.out.println("Digite 2 para converte de US$ para R$:");
                        escolha= leitura.nextInt();
                                System.out.println("Digite o valor que deseja converte:");
                                saldo = leitura.nextDouble();
                                convertido=0;
                                if (escolha==1){
                                  convertido = converso.converter(saldo ,"BRL","USD" );
                                    System.out.printf("O valor convertido em US$:%.2f\n " , convertido);

                                } else if (escolha==2) {
                                    convertido = converso.converter(saldo ,"USD","BRL" );
                                    System.out.printf("O valor convertido em R$:%.2f\n " , convertido);

                                }
                                leitura.nextLine();
                                break;
                    case 2:
                        System.out.println("Digite 1 para converte de R$ para ¥:");
                        System.out.println("Digite 2 para converte de ¥ para R$:");
                        escolha= leitura.nextInt();
                        System.out.println("Digite o valor que deseja converte:");
                        saldo = leitura.nextDouble();
                        convertido = 0;
                        if (escolha==1){
                            convertido = converso.converter(saldo ,"BRL","CNY" );
                            System.out.printf("O valor convertido em  ¥:%.2f\n " , convertido);

                        } else if (escolha==2) {
                            convertido = converso.converter(saldo ,"CNY","BRL" );
                            System.out.printf("O valor convertido em R$:%.2f\n " , convertido);

                        }
                        leitura.nextLine();
                        break;
                    case 3:
                        System.out.println("Digite 1 para converte de US$ para ¥:");
                        System.out.println("Digite 2 para converte de ¥ para US$:");
                        escolha= leitura.nextInt();
                        System.out.println("Digite o valor que deseja converte:");
                        saldo = leitura.nextDouble();
                        convertido=0;
                        if (escolha==1){
                            convertido = converso.converter(saldo ,"USD","CNY" );
                            System.out.printf("O valor convertido em US$:%.2f\n " , convertido);

                        } else if (escolha==2) {
                            convertido = converso.converter(saldo ,"CNY","USD" );
                            System.out.printf("O valor convertido em R$:%.2f\n " , convertido);

                        }
                        leitura.nextLine();
                        break;
                    case 4:
                        System.out.println("Digite 1 para converte de R$ para EUR:");
                        System.out.println("Digite 2 para converte de EUR para R$:");
                        escolha= leitura.nextInt();
                        System.out.println("Digite o valor que deseja converte:");
                        saldo = leitura.nextDouble();
                        convertido=0;
                        if (escolha==1){
                            convertido = converso.converter(saldo ,"BRL","EUR" );
                            System.out.printf("O valor convertido em EUR:%.2f\n " , convertido);

                        } else if (escolha==2) {
                            convertido = converso.converter(saldo ,"EUR","BRL" );
                            System.out.printf("O valor convertido em R$:%.2f\n " , convertido);

                        }
                        leitura.nextLine();
                        break;
                    case 5:
                        System.out.println("Digite 1 para converte de US$ para EUR:");
                        System.out.println("Digite 2 para converte de EUR para US$:");
                        escolha= leitura.nextInt();
                        System.out.println("Digite o valor que deseja converte:");
                        saldo = leitura.nextDouble();
                        convertido=0;
                        if (escolha==1){
                            convertido = converso.converter(saldo ,"USD","EUR" );
                            System.out.printf("O valor convertido em US$:%.2f\n " , convertido);

                        } else if (escolha==2) {
                            convertido = converso.converter(saldo ,"EUR", "EUR" );
                            System.out.printf("O valor convertido em R$:%.2f\n " , convertido);

                        }
                        leitura.nextLine();
                        break;
                    case 6:
                        System.out.println("Digite 1 para converte de R$ para US$:");
                        System.out.println("Digite 2 para converte de US$ para R$:");
                        escolha= leitura.nextInt();
                        System.out.println("Digite o valor que deseja converte:");
                        saldo = leitura.nextDouble();
                        convertido=0;
                        if (escolha==1){
                            convertido = converso.converter(saldo ,"BRL","GBP" );
                            System.out.printf("O valor convertido em GBP:%.2f\n " , convertido);

                        } else if (escolha==2) {
                            convertido = converso.converter(saldo ,"GBP","BRL" );
                            System.out.printf("O valor convertido em R$:%.2f\n " , convertido);

                        }
                        leitura.nextLine();
                        break;
                }
            }while(i!=0);
        }catch(IOException| InterruptedException e){
            System.out.println(e.getMessage());
            System.out.println("Erro ao passa a API");
        }
        System.out.println("====Fim Do Programa====");

    }
}