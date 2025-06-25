package view;

import model.Conta;
import controller.BancoController;
import java.util.Scanner;

public class BancoView {
    private Scanner scanner = new Scanner(System.in);
    private BancoController controller = new BancoController();

    public void iniciar() {
        while (true) {
            System.out.println("\n1 - Criar Conta | 2 - Listar Contas | 0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> listarContas();
                case 0 -> System.exit(0);
            }
        }
    }

    private void criarConta() {
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo (corrente/poupanca): ");
        String tipo = scanner.nextLine();
        Conta conta = controller.criarConta(tipo, nome);
        System.out.println("Conta criada: " + conta.getResumo());
    }

    private void listarContas() {
        for (Conta conta : controller.listarContas()) {
            System.out.println(conta.getResumo());
        }
    }
}