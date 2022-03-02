package com.github.joaoh4547.abstract_factory.issuers;

public class MasterCarIssuer implements Issuer{

    @Override
    public void send(String message) {
        System.out.printf("Enviando a seguinte mensagem para a master card: %s%n",message);
    }

}
