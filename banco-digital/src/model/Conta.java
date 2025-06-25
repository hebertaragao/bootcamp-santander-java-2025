package model;

public abstract class Conta {
    protected int numero;
    protected Cliente cliente;
    protected double saldo;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) saldo -= valor;
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public abstract String getTipo();

    public String getResumo() {
        return getTipo() + " - Nº " + numero + " | Cliente: " + cliente.getNome() + " | Saldo: R$ " + saldo;
    }
}