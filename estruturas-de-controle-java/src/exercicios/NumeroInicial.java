package exercicios;

import java.util.Scanner;

public class NumeroInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numeroBase = scanner.nextInt();

        while (true) {
            System.out.print("Digite um número (ou um não-múltiplo para encerrar): ");
            int numero = scanner.nextInt();

            if (numero < numeroBase) {
                System.out.println("Número ignorado (menor que o número inicial).");
                continue;
            }

            if (numero % numeroBase != 0) {
                System.out.println("Número não divisível por " + numeroBase + ". Encerrando.");
                break;
            }

            System.out.println("Número aceito: " + numero);
        }

        scanner.close();
    }

}
