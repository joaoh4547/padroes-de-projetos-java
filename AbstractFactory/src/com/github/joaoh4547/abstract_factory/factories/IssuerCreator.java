package com.github.joaoh4547.abstract_factory.factories;

import com.github.joaoh4547.abstract_factory.enums.CardType;
import com.github.joaoh4547.abstract_factory.issuers.Issuer;
import com.github.joaoh4547.abstract_factory.issuers.MasterCarIssuer;
import com.github.joaoh4547.abstract_factory.issuers.VisaIssuer;

public class IssuerCreator {

    public Issuer create(CardType issuerType){
        switch (issuerType){
            case VISA:
                return new VisaIssuer();
            case MASTERCARD:
                return new MasterCarIssuer();
            default:
                throw new IllegalArgumentException("Emissor não suportado");
        }
    }

}
