package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu
{
    Scanner scanner = new Scanner(System.in);
    UsuarioView usuarioV = new UsuarioView();
    ReservaView reservaV = new ReservaView();
    SalaView salaV = new SalaView();

    public void iniciar()
    {
        System.out.println("=====RESERVAS=====");
        System.out.println("1 - Cadastrar Usuários");
        System.out.println("2 - Cadastrar Salas");
        System.out.println("3 - Criar Reservas");
        System.out.println("4 - Listar Reservas");
        System.out.println("5 - Atualizar Reservas");
        System.out.println("6 - Cancelar/Remover Reservas");
        System.out.println("7 - Encerrar");
        System.out.print("Insira o numero da ação que você deseja tomar: ");

        int opcao = scanner.nextInt();

        switch(opcao)
        {
            case 1:
            {
                cadastrarUsuario();
                break;
            }
            case 2:
            {
                cadastrarSala();
                break;
            }
            case 3:
            {
                criarSala();
                break;
            }
            case 4:
            {
                listarReservas();
                break;
            }
            case 5:
            {
                atualizarReservas();
                break;
            }
            case 6:
            {
                deletarReserva();
                break;
            }
        }
    }

    public void listarReservas()
    {
        //chamar controller
    }

    public void atualizarReservas()
    {
        //chamar controller
    }

    public void cadastrarUsuario()
    {
        String nome = usuarioV.pedirNomeUsuario();
        String cpf = usuarioV.pedirCpfUsuario();
    }
    public void cadastrarSala()
    {
        Integer numeroSala = salaV.pedirNumeroSala();
        Integer capacidadeSala = salaV.pedirCapacidadeSala();
    }

    public void criarSala()
    {
        Long idUsuario = reservaV.reservaPedirUsuario();
        Long idSala = reservaV.reservaPedirSala();
        LocalDate data = reservaV.reservaPedirData();
        LocalTime hora = reservaV.reservaPedirHora();
    }

    public void deletarReserva()
    {
        System.out.println("Insira o id da reserva a ser deletada: ");
        Long id = scanner.nextLong();
        //chamar controller
    }
}
