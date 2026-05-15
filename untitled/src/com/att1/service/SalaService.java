package com.att1.service;

import com.att1.model.Reserva;
import com.att1.model.Sala;
import com.att1.repository.ReservaRepository;
import com.att1.repository.SalaRepository;

public class SalaService {

    private SalaRepository salaRepository;
    private ReservaRepository reservaRepository;

    public SalaService(SalaRepository salaRepository, ReservaRepository reservaRepository){
        this.salaRepository = salaRepository;
        this.reservaRepository = reservaRepository;
    }

    public void verificarCapacidadeSala(Sala sala) throws Exception{
        if(sala.getCapacidade() > 0){
            throw new IllegalAccessException("Capacidade deve ser maior que zero.");
        }
    }

    public void marcarSalaComoIndisponivel(Sala sala){

        sala.setDisponivel(false);

        salaRepository.criarSala(sala);

    }

    public void marcarSalaComoDisponivel(Sala sala){

        sala.setDisponivel(true);

        salaRepository.criarSala(sala);

    }

}
