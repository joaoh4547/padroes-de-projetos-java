package com.github.joaoh4547.abstract_factory.factories;

import com.github.joaoh4547.abstract_factory.enums.CardType;
import com.github.joaoh4547.abstract_factory.receivers.MasterCardReceiver;
import com.github.joaoh4547.abstract_factory.receivers.Receiver;
import com.github.joaoh4547.abstract_factory.receivers.VisaReceiver;

public class ReceiverCreator {
    public Receiver create(CardType type) {
        switch (type) {
            case VISA:
                return new VisaReceiver();
            case MASTERCARD:
                return new MasterCardReceiver();
            default:
                throw new IllegalArgumentException("Meio de recebimento invalido");
        }
    }
}
