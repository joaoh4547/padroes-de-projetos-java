package com.github.joaoh4547.abstract_factory.factories;

import com.github.joaoh4547.abstract_factory.issuers.Issuer;
import com.github.joaoh4547.abstract_factory.receivers.Receiver;

public interface CommunicatorFactory {
    Issuer createIssuer();
    Receiver createReceiver();
}
