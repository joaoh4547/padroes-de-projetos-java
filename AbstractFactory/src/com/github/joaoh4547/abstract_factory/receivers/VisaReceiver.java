package com.github.joaoh4547.abstract_factory.receivers;

public class VisaReceiver implements  Receiver{

    @Override
    public String receive() {
        System.out.println("Recebendo mensagem da VISA");
        return "Mensagem da visa";
    }
}
