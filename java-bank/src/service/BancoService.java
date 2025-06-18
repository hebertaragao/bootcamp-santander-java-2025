package service;

import model.*;
import repository.ContaRepository;
import java.math.BigDecimal;

public class BancoService {

    private ContaRepository contaRepo = new ContaRepository();

    public void criarContaCorrente(String numero, Cliente cliente) {
        ContaCorrente cc = new ContaCorrente(numero, cliente);
        contaRepo.salvar(cc);
    }

    public void depositar(String numero, BigDecimal valor) {
        Conta conta = contaRepo.buscarPorNumero(numero);
        if (conta != null) {
            conta.depositar(valor);
        }
    }

    public void sacar(String numero, BigDecimal valor) {
        Conta conta = contaRepo.buscarPorNumero(numero);
        if (conta != null) {
            conta.sacar(valor);
        }
    }

    public void transferir(String origem, String destino, BigDecimal valor) {
        Conta contaOrigem = contaRepo.buscarPorNumero(origem);
        Conta contaDestino = contaRepo.buscarPorNumero(destino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
        }
    }

    public void exibirExtrato(String numero) {
        Conta conta = contaRepo.buscarPorNumero(numero);
        if (conta != null) {
            System.out.println("=== Extrato da conta " + numero + " ===");
            for (Transacao t : conta.getHistorico()) {
                System.out.println(t.dataHora() + " - " + t.tipo() + " - R$" + t.valor());
            }
            System.out.println("Saldo atual: R$" + conta.getSaldo());
        }
    }

}
