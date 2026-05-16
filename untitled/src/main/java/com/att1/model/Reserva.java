package com.att1.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private Long id;
    private Usuario usuario;
    private Sala sala;
    private LocalDate data;
    private LocalTime horario;
    private Boolean status;

    public Reserva(Long id, Usuario usuario, Sala sala, LocalDate data, LocalTime horario, Boolean status)
    {
        this.id = id;
        this.usuario = usuario;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    public Reserva() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
