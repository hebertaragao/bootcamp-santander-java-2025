import java.util.Scanner;

public class ContaTerminal {
        /*
        TODO: Conhecer e importar as classes Scanner

        Exibir as mensagens para o nosso usuário

        Obter pelo scanner os valores digitados no terminal

        Exibir a mensagem final
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação de dados ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente + 
                          ", obrigado por criar uma conta em nosso banco, sua agência é " +
                          agencia + ", conta " + numeroConta +
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}