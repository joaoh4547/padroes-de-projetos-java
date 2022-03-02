package com.github.joaoh4547.factory_method.issuers;

public class SyncEmailIssuer implements Issuer {

    @Override
    public void send(String message) {
        System.out.printf("Enviando de forma sincrona mensagem por email: %s%n",message);
    }
}
