package com.att1.service;


import com.att1.model.Reserva;
import com.att1.model.Sala;
import com.att1.model.Usuario;
import com.att1.repository.ReservaRepository;
import com.att1.repository.SalaRepository;

public class ReservaService {

    private SalaService salaService;
    private ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository, SalaRepository salaRepository, SalaService salaService){
        this.reservaRepository = reservaRepository;
        this.salaService = salaService;
    }

    public void verificaStatusSala(Sala sala) throws Exception{
        if(!sala.getDisponivel()){
            throw new IllegalArgumentException("Erro a " + sala + " está indisponivel.");
        }
    }

    public void verificarUsuario(Usuario usuario) throws Exception{
        if(usuario.getCpf() == null){
            throw new IllegalArgumentException("Usuario não existe.");
        }
    }

    public void verificaSalaExiste(Sala sala) throws Exception{
        if(sala.getId() == null){
            throw new IllegalArgumentException("Sala inexistente.");
        }
    }

    public void criarReserva(Reserva reserva) throws Exception{

        verificaSalaExiste(reserva.getSala());
        verificarUsuario(reserva.getUsuario());
        verificaStatusSala(reserva.getSala());

        verificarReserva(reserva);

        reserva.setStatus(true);

        reservaRepository.criarReserva(reserva);

       salaService.marcarSalaComoIndisponivel(reserva.getSala());
    }

    public void reservaFicarDisponivel(Reserva reserva) throws Exception{


            verificaSalaExiste(reserva.getSala());
            verificarUsuario(reserva.getUsuario());



            if(!reserva.getStatus()){
                throw new IllegalArgumentException("Cancelou a reserva.");
            }

        reserva.setStatus(false);

            reservaRepository.atualizarReserva(reserva);

            salaService.marcarSalaComoDisponivel(reserva.getSala());

    }

    public void verificarReserva(Reserva reserva) throws Exception{
        for(Reserva r : reservaRepository.listarReservas()){

            boolean compararSala =  r.getSala().equals(reserva.getSala());
            boolean compararData = r.getData().equals(reserva.getData());
            boolean compararHorario = r.getHorario().equals(reserva.getHorario());

            if(compararSala && compararData && compararHorario){
                throw new IllegalArgumentException("Não pode realizar reserva da mesma sala na mesma hora e data.");
            }
        }
    }
}