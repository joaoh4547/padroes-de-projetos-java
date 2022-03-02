package com.github.joaoh4547.factory_method.issuers;

public class AsyncSmsIssuer implements Issuer{
    @Override
    public void send(String message) {
        System.out.printf("Enviando mensagem de forma assincrona por SMS: %s%n",message);
    }
}
