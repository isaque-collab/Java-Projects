package Exercicious;

import java.util.Scanner;

public class SimuladorDeCaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: ");
        int valor = scanner.nextInt();

        if (valor <= 0 || valor % 10 != 0) {
            System.out.println("Valor inválido. O saque deve ser múltiplo de 10.");
            scanner.close();
            return;
        }

        int quantidade200 = valor / 200;
        int resto = valor % 200;

        int quantidade100 = resto / 100;
        resto %= 100;

        int quantidade50 = resto / 50;
        resto %= 50;

        int quantidade20 = resto / 20;
        resto %= 20;

        int quantidade10 = resto / 10;

        if (quantidade200 > 0)
            System.out.println("Cédulas de 200: " + quantidade200);

        if (quantidade100 > 0)
            System.out.println("Cédulas de 100: " + quantidade100);

        if (quantidade50 > 0)
            System.out.println("Cédulas de 50: " + quantidade50);

        if (quantidade20 > 0)
            System.out.println("Cédulas de 20: " + quantidade20);

        if (quantidade10 > 0)
            System.out.println("Cédulas de 10: " + quantidade10);

        scanner.close();
    }
}