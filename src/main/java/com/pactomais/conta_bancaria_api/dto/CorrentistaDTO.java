package com.pactomais.conta_bancaria_api.dto;

public class CorrentistaDTO {

    private String nome;
    private String documento;
    private String dadosContato;

    public CorrentistaDTO() {
    }

    public CorrentistaDTO(String nome, String documento, String dadosContato) {
        this.nome = nome;
        this.documento = documento;
        this.dadosContato = dadosContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDadosContato() {
        return dadosContato;
    }

    public void setDadosContato(String dadosContato) {
        this.dadosContato = dadosContato;
    }
}