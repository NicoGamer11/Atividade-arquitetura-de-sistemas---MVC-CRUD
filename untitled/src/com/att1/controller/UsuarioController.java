package com.att1.controller;

import com.att1.model.Usuario;

public class UsuarioController {

    public void validarUsuario( Long id,String nome, String cpf ){

        try {
            if (nome == null || nome.trim().isEmpty()) throw new RuntimeException(" O nome não pode ser nulo!");

            if(cpf == null || cpf.trim().isEmpty())  throw new RuntimeException(" O CPF não pode ser nulo!");

            if(!cpf.matches("\\d{11}")) throw new RuntimeException(" O CPF so pode conte numeros!");;

            if( id == null || id <= 0) throw new RuntimeException(" O Id não pode ser nulo!");

           Usuario usuarioCadastrado = new Usuario(id, nome, cpf);

        }catch(RuntimeException a) {
            System.out.println(a.getMessage());
            return;

        }
    }
}
