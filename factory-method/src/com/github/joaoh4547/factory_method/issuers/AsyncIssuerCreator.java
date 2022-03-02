package com.github.joaoh4547.factory_method.issuers;

public class AsyncIssuerCreator implements IssuerCreator {
    @Override
    public Issuer create(IssuerType type) {
        switch (type) {
            case EMAIL:
                return new AsyncEmailIssuer();
            case SMS:
                return new AsyncSmsIssuer();
            case JMS:
                return new AsyncJmsIssuer();
            default:
                throw new IllegalArgumentException("Tipo de emissor invalido");
        }
    }
}
