package com.pactomais.conta_bancaria_api.domain;

import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "dados_contato", nullable = false, unique = true)
    private String dadosContato;

    @OneToMany(mappedBy = "correntista", cascade = CascadeType.ALL)
    private List<Conta> contas = new ArrayList<>();

    public Correntista() {
    }

    public Correntista(String nome, String documento, String dadosContato, List<Conta> contas) {
        this.nome = nome;
        this.documento = documento;
        this.dadosContato = dadosContato;
        this.contas = contas;
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
        return dadosContato;
    }

    public List<Conta> getContas() {
        return contas;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setDadosContato(String dadosContato) {
        this.dadosContato = dadosContato;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}

