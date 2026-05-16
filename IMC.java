package Exercicious;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        String classificacao = "";

        if (IMC <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if (IMC < 25) {
            classificacao = "Peso ideal";
        } else if (IMC < 30) {
            classificacao = "Sobrepeso";
        } else if (IMC < 35) {
            classificacao = "Obesidade grau 1";
        } else if (IMC < 40) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade mórbida";
        }

        System.out.println("Exercicious.IMC:" + IMC);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}