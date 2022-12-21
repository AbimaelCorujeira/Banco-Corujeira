package br.com.corujeira.banco.test;

import br.com.corujeira.banco.model.Conta;
import br.com.corujeira.banco.model.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(123, 456);

        contaCorrente.deposita(200);

        try {
            contaCorrente.saca(500);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(contaCorrente.getSaldo());

        System.out.println(contaCorrente);
    }
}
