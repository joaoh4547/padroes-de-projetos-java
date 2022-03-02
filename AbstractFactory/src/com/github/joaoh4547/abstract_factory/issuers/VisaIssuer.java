package com.github.joaoh4547.abstract_factory.issuers;

public class VisaIssuer implements Issuer {

    @Override
    public void send(String message) {
        System.out.printf("Enviando a seguinte mensagem para a visa: %s %n",message);
    }
}
