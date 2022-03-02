package com.github.joaoh4547.factory_method.issuers;

public class SyncIssuerCreator implements  IssuerCreator{

    @Override
    public Issuer create(IssuerType type) {
        switch (type){
            case EMAIL:
                return new SyncEmailIssuer();
            case SMS:
                return new SyncSmsIssuer();
            case JMS:
                return new SyncJmsIssuer();
            default:
                throw new IllegalArgumentException("Tipo de emissor não suportado");
        }
    }
}
