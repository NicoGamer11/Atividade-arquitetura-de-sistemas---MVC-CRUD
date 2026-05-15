package com.att1.repository;

import com.att1.model.Sala;
import com.att1.model.Usuario;

import java.util.HashMap;

public class UsuarioRepository {
    private HashMap<Long, Usuario> usuarioRepository = new HashMap<>();

    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.put(usuario.getId(),usuario);
    }
}
