package com.att1.model;

public class Sala {
    private Long id;
    private Integer numero;
    private Integer capacidade;
    private Boolean disponivel;

    public Sala(Boolean disponivel, Integer capacidade, Integer numero, Long id) {
        this.disponivel = disponivel;
        this.capacidade = capacidade;
        this.numero = numero;
        this.id = id;
    }

    public Sala() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
