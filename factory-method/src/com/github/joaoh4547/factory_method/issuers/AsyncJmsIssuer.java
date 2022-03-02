package com.github.joaoh4547.factory_method.issuers;

public class AsyncJmsIssuer implements Issuer{

    @Override
    public void send(String message) {
        System.out.printf("Enviando mensagem de forma assincrona por JMS: %s%n",message);
    }
}
