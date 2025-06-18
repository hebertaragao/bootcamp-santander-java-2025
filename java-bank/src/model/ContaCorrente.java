package model;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            historico.add(new Transacao("Saque", valor));
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
        historico.add(new Transacao("Depósito", valor));
    }

    @Override
    public void transferir(Conta destino, BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            destino.depositar(valor);
            historico.add(new Transacao("Transferência para " + destino.numero, valor));
        }
    }


}
