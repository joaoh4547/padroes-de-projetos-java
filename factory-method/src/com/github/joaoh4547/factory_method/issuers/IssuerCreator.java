package com.github.joaoh4547.factory_method.issuers;

public interface IssuerCreator {
    Issuer create(IssuerType type);
}
