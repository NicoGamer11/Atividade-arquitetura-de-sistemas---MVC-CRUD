package main.java.com.att1.controller;

import com.att1.model.Sala;

public class SalaController {

    public void validarSala(Boolean disponivel, Integer capacidade, Integer numero, Long id){

        try {
            if (disponivel != true) throw new RuntimeException("A sala precisa estar dispoivel!");

            if(capacidade == null || capacidade <= 0) throw new RuntimeException("A capacidade da sala precisa ser definida! ");

            if(numero == null || numero <= 0 ) throw new RuntimeException("O numero da sala não pode ser nulo! ");

            if(id == null || id < 0 ) throw new RuntimeException("O id não pode ser vazio!");

            Sala salaCadastrada = new Sala(disponivel,capacidade,numero,id);

        }catch(RuntimeException b){
            System.out.println(b.getMessage());
        }
    }
}
