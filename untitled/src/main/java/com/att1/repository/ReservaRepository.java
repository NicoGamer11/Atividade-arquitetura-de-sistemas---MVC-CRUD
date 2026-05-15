package com.att1.repository;

import com.att1.model.Reserva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReservaRepository {
    private HashMap<Long, Reserva> reservaRepository = new HashMap<>();

    public Reserva criarReserva(Reserva reserva){
        return reservaRepository.put(reserva.getId(),reserva);
    }

    public List<Reserva> listarReservas(){
        List<Reserva> reservasList = new ArrayList<>();
        reservasList.addAll(reservaRepository.values());
        return reservasList;
    }

    public Reserva atualizarReserva(Reserva reserva){
        reservaRepository.replace(reserva.getId(), reserva);
        return reserva;
    }

    public Reserva deletarReserva(Long id){
        return reservaRepository.remove(id);
    }
}
