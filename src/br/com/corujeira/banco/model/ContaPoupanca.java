package br.com.corujeira.banco.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
        System.out.println("br.com.corujeira.banco.model.Conta Poupança criada na agência: " + agencia + " e número " + numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
