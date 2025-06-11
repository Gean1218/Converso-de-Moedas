# Converso-de-Moedas
# 💱 Conversor de Moedas com API e GSON

Este projeto em Java é um conversor de moedas que utiliza uma API externa para obter as taxas de câmbio atualizadas em tempo real. O objetivo é permitir que o usuário converta valores entre moedas como Real, Dólar, Yuan, Euro, entre outras.

---

## 🚀 Tecnologias utilizadas

- **Java (JDK 11 ou superior)**
- **[ExchangeRate API](https://v6.exchangerate-api.com)**
- **Gson (Google)** – para manipulação de JSON
- **HttpClient (java.net.http)** – para requisições HTTP

---

## 📦 Funcionalidades

- Conversão de:
  - Real (BRL) para Dólar (USD) e vice-versa
  - Real (BRL) para Yuan (CNY) e vice-versa
  - Outras combinações podem ser adicionadas facilmente
- Interface interativa via terminal
- Exibição de valores convertidos com 2 casas decimais

---

## 🧠 Lógica Principal

### 🧩 Classe `Converso`

Essa foi a parte mais desafiadora do projeto. A classe `Converso` é responsável por:

1. Receber o JSON da API.
2. Utilizar o Gson para converter esse JSON em um `Map`.
3. Extrair as taxas de câmbio da chave `"conversion_rates"` de forma segura.
4. Armazenar essas taxas em um `Map<String, Double>` para uso posterior.
5. Permitir a conversão entre moedas com base nessas taxas.
