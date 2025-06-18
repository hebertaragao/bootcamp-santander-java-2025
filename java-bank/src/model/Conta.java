package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

    protected String numero;
    protected BigDecimal saldo;
    protected Cliente cliente;
    protected List<Transacao> historico = new ArrayList<>();

    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = BigDecimal.ZERO;
    }

    public abstract void sacar(BigDecimal valor);
    public abstract void depositar(BigDecimal valor);
    public abstract void transferir(Conta destino, BigDecimal valor);

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Transacao> getHistorico() {
        return historico;
    }
    public String getNumero() {
        return numero;
    }
}
