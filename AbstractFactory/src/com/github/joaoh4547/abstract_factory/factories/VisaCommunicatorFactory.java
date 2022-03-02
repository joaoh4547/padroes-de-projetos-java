package com.github.joaoh4547.abstract_factory.factories;

import com.github.joaoh4547.abstract_factory.enums.CardType;
import com.github.joaoh4547.abstract_factory.issuers.Issuer;
import com.github.joaoh4547.abstract_factory.receivers.Receiver;

public class VisaCommunicatorFactory implements CommunicatorFactory {

    private final  IssuerCreator issuerCreator = new IssuerCreator();
    private final ReceiverCreator receiverCreator = new ReceiverCreator();

    @Override
    public Issuer createIssuer() {
        return issuerCreator.create(CardType.VISA) ;
    }

    @Override
    public Receiver createReceiver() {
        return receiverCreator.create(CardType.VISA);
    }
}
