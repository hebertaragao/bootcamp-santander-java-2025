package exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número (menor): ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número (maior): ");
        int fim = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (fim <= inicio) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
            scanner.close();
            return;
        }

        // Escolha entre par ou ímpar
        System.out.print("Você quer ver números 'par' ou 'impar'? ");
        String opcao = scanner.nextLine().trim().toLowerCase();

        if (!opcao.equals("par") && !opcao.equals("impar")) {
            System.out.println("Opção inválida. Digite apenas 'par' ou 'impar'.");
            scanner.close();
            return;
        }

        System.out.printf("\nExibindo números %s entre %d e %d em ordem decrescente:\n",
                opcao, inicio, fim);

        for (int i = fim; i >= inicio; i--) {
            if (opcao.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
