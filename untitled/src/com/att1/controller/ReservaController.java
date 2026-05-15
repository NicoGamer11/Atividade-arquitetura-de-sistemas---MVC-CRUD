package com.att1.controller;

import com.att1.model.Sala;
import com.att1.model.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaController {

    public void validaçãoReserva(Long id, Usuario usuario, Sala sala, LocalDate data, LocalTime horario, Boolean status) {

        LocalTime abertura =  LocalTime.of(8,0);
        LocalTime fechamento =  LocalTime.of(22,0);

        try{

            if(id == null || id < 0 ) throw new RuntimeException("O id não pode ser vazio!");

            if(status != true ) throw new RuntimeException(" A reserva não esta disponivel no momento!");

            if(horario == null)throw new RuntimeException(" O horario da reserva não pode ser nulo!");

            if(horario.isBefore(abertura)|| horario.isAfter(fechamento))
                throw new RuntimeException("Este horario esta indisponinel, voce pode escolher entre as 08:00 e 22:00");;

            if(data == null) throw new RuntimeException(" A data da reserva não pode ser nula!");

            if(data.isBefore(LocalDate.now())) throw new RuntimeException(" Não é permitido reservar datas antigas!");

        }catch(RuntimeException p){
            System.out.println(p.getMessage());

        }

    }
}
