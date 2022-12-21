package br.com.corujeira.banco.model;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
        System.out.println("br.com.corujeira.banco.model.Conta Corrente criada na agência: " + agencia + " e número " + numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Conta Corrente " + super.toString();
    }
}
