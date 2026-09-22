package com.pactomais.conta_bancaria_api.domain;

import javax.persistence.*;
import java.math.BigDecimal; 

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_conta", nullable = false, unique = true)
    private Integer numeroConta;

    @Column(nullable = false)
    private BigDecimal saldo; 

    @Column(nullable = false)
    private String tipo;

    
    public Conta() {
    }

    public Conta(Integer numeroConta, BigDecimal saldo, String tipo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    // SETTERS 
    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
} 