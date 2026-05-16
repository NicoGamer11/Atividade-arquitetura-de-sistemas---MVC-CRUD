package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservaView
{//usuario sala data horario
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Long reservaPedirUsuario()
    {
        System.out.println("Insira o id do usuário");
        Long id = scanner.nextLong();

        if (id <= 0)
        {
            do {
                System.out.println("O id da sala não é valido, Insira-o novamente: ");
                id = scanner.nextLong();
            } while (id <= 0);
        }

        return id;
    }

    public Long reservaPedirSala()
    {
        System.out.println("Insira o id da sala que você deseja fazer a reserva: ");
        Long id = scanner.nextLong();

        if (id <= 0)
        {
            do {
                System.out.println("O id da sala não é valido, Insira-o novamente: ");
                id = scanner.nextLong();
            } while (id <= 0);
        }

        return id;
    }

    public LocalDate reservaPedirData()
    {
        System.out.println("Insira a data da reserva (dd/MM/yyyy): ");
        String dataString = scanner.nextLine();

        if(dataString.isBlank())
        {
            do {
               System.out.println("O campo data deve ser preenchido: insira a data da reserva (dd/MM/yyyy): ");
               dataString = scanner.nextLine();
            } while(dataString.isBlank());
        }

        LocalDate data = LocalDate.parse(dataString, formatador);

        return data;
    }

    public LocalTime reservaPedirHora()
    {
        System.out.println("Insira a hora da reserva (HH:mm): ");
        String horaString = scanner.nextLine();

        if(horaString.isBlank())
        {
            do {
                System.out.println("O campo data deve ser preenchido: insira a data da reserva (dd/MM/yyyy): ");
                horaString = scanner.nextLine();
            } while(horaString.isBlank());
        }

        LocalTime hora = LocalTime.parse(horaString, formatador);

        return hora;
    }
}