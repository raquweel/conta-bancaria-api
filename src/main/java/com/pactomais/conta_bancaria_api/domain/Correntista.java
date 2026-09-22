package com.pactomais.conta_bancaria_api.domain;

import javax.persistence.*;

@Entity
@Table(name = "correntista")
public class Correntista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String documento;

    @Column(nullable = false, unique = true)
    private String dados_contato;
}

public Correntista() {
    public Correntista(String nome, String documento, String dados_contato) {
        this.nome = nome;
        this.documento = documento;
        this.dados_contato = dados_contato;
    }

    //GETTERS
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getDadosContato() {
        return dados_contato;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setDadosContado(String dados_contato) {
        this.dados_contato = dados_contato;
    }
}


