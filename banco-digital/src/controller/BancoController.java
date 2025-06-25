package controller;

import model.*;
import java.util.*;

public class BancoController {
    private List<Conta> contas = new ArrayList<>();
    private int proximoNumero = 1;

    public Conta criarConta(String tipo, String nomeCliente) {
        Cliente cliente = new Cliente(nomeCliente);
        Conta conta = tipo.equals("corrente") ?
            new ContaCorrente(proximoNumero++, cliente) :
            new ContaPoupanca(proximoNumero++, cliente);
        contas.add(conta);
        return conta;
    }

    public List<Conta> listarContas() {
        return contas;
    }
}