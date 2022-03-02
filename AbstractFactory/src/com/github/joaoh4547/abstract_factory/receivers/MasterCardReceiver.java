package com.github.joaoh4547.abstract_factory.receivers;

public class MasterCardReceiver implements Receiver{

    @Override
    public String receive() {
        System.out.println("Recebendo mensagem mastercard");
        return "Mensagem mastercard";
    }
}
