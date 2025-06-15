package exercicios;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite sua altura (em metros, por exemplo 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibição do resultado
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Classificação
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else if (imc < 34.9) {
            System.out.println("Classificação: Obesidade Grau I.");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade Grau II.");
        } else {
            System.out.println("Classificação: Obesidade Grau III (obesidade mórbida).");
        }

        scanner.close();
    }
}
