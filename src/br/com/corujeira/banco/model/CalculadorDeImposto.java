package br.com.corujeira.banco.model;

public class CalculadorDeImposto {

    private double totalImposto;

    public void regista(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
