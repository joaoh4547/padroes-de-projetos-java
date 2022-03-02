package com.github.joaoh4547.abstract_factory;

import com.github.joaoh4547.abstract_factory.factories.CommunicatorFactory;
import com.github.joaoh4547.abstract_factory.factories.MastercardCommunicatorFactory;
import com.github.joaoh4547.abstract_factory.factories.VisaCommunicatorFactory;
import com.github.joaoh4547.abstract_factory.issuers.Issuer;
import com.github.joaoh4547.abstract_factory.receivers.Receiver;

public class Application {

    public static void main(String[] args) {
        System.out.println("\n---------VISA--------------\n");
        String transaction1 = "Valor=500;Senha=123";

        CommunicatorFactory visaCommunicator = new VisaCommunicatorFactory();
        Issuer visaIssuer = visaCommunicator.createIssuer();
        Receiver visaReceiver = visaCommunicator.createReceiver();

        visaIssuer.send(transaction1);
        String result1 = visaReceiver.receive();
        System.out.println(result1);

        System.out.println("\n---------Mastercard--------------\n");
        String transaction2 = "Valor=8500;Senha=dsdsd";

        CommunicatorFactory mastercardCommunicator = new MastercardCommunicatorFactory();
        Issuer mastercardIssuer = mastercardCommunicator.createIssuer();
        Receiver mastercardReceiver = mastercardCommunicator.createReceiver();

        mastercardIssuer.send(transaction2);
        String result2 = mastercardReceiver.receive();
        System.out.println(result2);

    }
}
