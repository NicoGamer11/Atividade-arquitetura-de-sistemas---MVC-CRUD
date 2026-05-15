package main.java.com.att1.view;

import java.util.Scanner;

public class ReservaView
{
    private Scanner scanner;

    public ReservaView()
    {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar()
    {
        System.out.println("Insira o nome do Usuário:");
        String nome = scanner.nextLine();

        do {
            System.out.println("Você não pode deixar o campo em branco, insira o nome do usuário: ");
            nome = scanner.nextLine();
        } while (nome.isBlank());

        System.out.println("Insira o CPF do usuário: ");
        String cpf = scanner.nextLine();

        if(cpf.matches("[^a-zA-Z]+"))
        {
            do {
                System.out.println("O CPF inserido não é válido.");
            } while (cpf.matches("[^a-zA-Z]+"));
        }
    }
}
