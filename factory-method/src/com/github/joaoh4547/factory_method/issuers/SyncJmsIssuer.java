package com.github.joaoh4547.factory_method.issuers;

public class SyncJmsIssuer implements Issuer {
    @Override
    public void send(String message) {
        System.out.printf("Enviando de forma sincrona a mensagem por JMS %s",message);
    }
}
