package com.pactomais.conta_bancaria_api.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("CORRENTE")
public class ContaCorrente extends Conta {

    @Column(precision = 10, scale = 2)
    private BigDecimal limite;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(Integer numeroConta, BigDecimal saldo, BigDecimal limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}