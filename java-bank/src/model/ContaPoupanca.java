package model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

   private static final BigDecimal RENDIMENTO_MENSAL = new BigDecimal("0.005"); // 0,5%

    public ContaPoupanca(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            historico.add(new Transacao("Saque Poupança", valor));
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
        historico.add(new Transacao("Depósito Poupança", valor));
    }

    @Override
    public void transferir(Conta destino, BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            destino.depositar(valor);
            historico.add(new Transacao("Transferência para " + destino.numero, valor));
        }
    }

    public void aplicarRendimentoMensal() {
        BigDecimal rendimento = saldo.multiply(RENDIMENTO_MENSAL);
        saldo = saldo.add(rendimento);
        historico.add(new Transacao("Rendimento Poupança", rendimento));
    }

}
