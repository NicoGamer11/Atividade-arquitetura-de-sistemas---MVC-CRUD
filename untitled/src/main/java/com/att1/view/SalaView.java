package view;

import java.util.Scanner;

public class SalaView
{
    Scanner scanner = new Scanner(System.in);

    public Integer pedirNumeroSala()
    {
        System.out.println("Insira o número da sala: ");
        Integer numeroSala = scanner.nextInt();
        return numeroSala;
    }

    public Integer pedirCapacidadeSala()
    {
        System.out.println("Insira a capacidade máxima da sala");
        Integer capacidadeSala = scanner.nextInt();
        return capacidadeSala;
    }

}
