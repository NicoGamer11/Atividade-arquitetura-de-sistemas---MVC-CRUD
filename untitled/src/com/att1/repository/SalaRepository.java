package com.att1.repository;

import com.att1.model.Sala;

import java.util.HashMap;

public class SalaRepository {
    private HashMap<Long, Sala> salaRepository = new HashMap<>();

    public Sala criarSala(Sala sala){
        return salaRepository.put(sala.getId(),sala);
    }
}
