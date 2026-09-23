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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "correntista_id", nullable = false)
    private Correntista correntista;

    public Conta() {
    }

    public Conta(Integer numeroConta, BigDecimal saldo, Correntista correntista) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.correntista = correntista;
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

    public Correntista getCorrentista() {
        return correntista;
    }

    // SETTERS 
    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
} 