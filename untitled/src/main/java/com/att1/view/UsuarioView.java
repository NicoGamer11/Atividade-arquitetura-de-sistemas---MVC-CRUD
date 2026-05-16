package view;

import com.att1.model.Usuario;

import java.util.Scanner;

public class UsuarioView
{
    Scanner scanner = new Scanner(System.in);
    Usuario usuario = new Usuario();

    public String pedirNomeUsuario()
    {
        System.out.println("Insira o nome do usuário: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public String pedirCpfUsuario()
    {
        System.out.println("Insira o CPF do usuário: ");
        String cpf = scanner.nextLine();
        return cpf;
    }

}
