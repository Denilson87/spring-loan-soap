# 🧾 Spring Loan SOAP Web Service (Contract First)

Este projeto é uma aplicação **SOAP Web Service** desenvolvida com **Spring Boot** seguindo a abordagem **Contract First**, onde o contrato (XSD) é definido antes da implementação do serviço.

O serviço expõe um endpoint SOAP para verificar a **elegibilidade de empréstimo (Loan Eligibility)** com base nos dados do cliente.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 2.7.18**
- **Spring Web Services (SOAP)**
- **JAXB (Jakarta XML Bind)**
- **Maven**
- **XSD (Contract First)**
- **WSDL**
- **wsdl4j**

---

## 🧠 Abordagem: Contract First

Neste projeto foi utilizada a abordagem **Contract First**, onde:

1. O contrato SOAP é definido usando um arquivo **XSD**
2. As classes Java são geradas automaticamente via **JAXB**
3. O WSDL é gerado dinamicamente a partir do XSD
4. O endpoint SOAP implementa a lógica de negócio

### ✅ Vantagens
- Contrato bem definido
- Melhor interoperabilidade
- Ideal para ambientes corporativos e integrações entre sistemas

---

## 📂 Estrutura do Projeto

```text
spring-loan-soap
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.springloansoap
│   │   │   │   ├── config        # Configuração SOAP
│   │   │   │   ├── endpoint      # Endpoints SOAP
│   │   │   │   └── service       # Lógica de negócio
│   │   └── resources
│   │       ├── xsd               # Contratos XSD
│   │       │   └── loaneligibility.xsd
│   │       └── application.properties
├── target
│   └── generated-sources
│       └── jaxb                  # Classes geradas automaticamente
├── pom.xml
└── README.md
