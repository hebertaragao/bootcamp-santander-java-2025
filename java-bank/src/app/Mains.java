package app;

import model.Cliente;
import service.BancoService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Mains {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoService banco = new BancoService();

        while (true) {
            System.out.println("\n=== Menu Banco Digital ===");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Ver Extrato");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    banco.criarContaCorrente(numero, new Cliente(nome, cpf));
                    System.out.println("Conta criada com sucesso!");
                }
                case 2 -> {
                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    System.out.print("Valor do depósito: ");
                    BigDecimal valor = scanner.nextBigDecimal();
                    banco.depositar(numero, valor);
                }
                case 3 -> {
                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    System.out.print("Valor do saque: ");
                    BigDecimal valor = scanner.nextBigDecimal();
                    banco.sacar(numero, valor);
                }
                case 4 -> {
                    System.out.print("Conta origem: ");
                    String origem = scanner.nextLine();
                    System.out.print("Conta destino: ");
                    String destino = scanner.nextLine();
                    System.out.print("Valor da transferência: ");
                    BigDecimal valor = scanner.nextBigDecimal();
                    banco.transferir(origem, destino, valor);
                }
                case 5 -> {
                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    banco.exibirExtrato(numero);
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida");
            }
        }
    }

}
