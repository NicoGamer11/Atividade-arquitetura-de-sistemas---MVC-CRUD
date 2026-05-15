package com.att1.service;

import com.att1.model.Usuario;
import com.att1.repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void verificacaoCpf(Usuario usuario) throws Exception{

        for(Usuario u : usuarioRepository.listarUsuario()){

            boolean compararCpf = u.getCpf().equals(usuario.getCpf());

            if(compararCpf){
                throw new IllegalArgumentException("Já existe um cadastro com o CPF digitado.");
            }

        }

    }
}
