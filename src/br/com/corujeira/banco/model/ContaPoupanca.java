package br.com.corujeira.banco.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
        //System.out.println("Conta Poupança criada na agência: " + agencia + " e número " + numero);
    }
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Poupanca " + super.toString();
    }
}
