package model;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
}