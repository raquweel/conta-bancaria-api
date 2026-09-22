package com.pactomais.conta_bancaria_api.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("POUPANCA")
public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numeroConta, BigDecimal saldo) {
        super(numeroConta, saldo);
    }
}