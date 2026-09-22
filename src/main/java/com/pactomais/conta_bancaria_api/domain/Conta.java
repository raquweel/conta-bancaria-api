package com.pactomais.conta_bancaria_api.domain;

import javax.persistence.*;
import java.math.BigDecimal; 

@Entity
@Table(name = "conta")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_conta", discriminatorType = DiscriminatorType.STRING)

public abstract class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_conta", nullable = false, unique = true)
    private Integer numeroConta;

    @Column(nullable = false)
    private BigDecimal saldo; 

    public Conta() {
    }

    public Conta(Integer numeroConta, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // GETTERS
    public Long getId() {
        return id;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    // SETTERS 
    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
} 