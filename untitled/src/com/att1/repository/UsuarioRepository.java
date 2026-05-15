package com.att1.repository;

import com.att1.model.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsuarioRepository {
    private HashMap<Long, Usuario> usuarioRepository = new HashMap<>();

    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.put(usuario.getId(),usuario);
    }

    public List<Usuario> listarUsuario(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.addAll(usuarioRepository.values());
        return usuarios;
    }
}
