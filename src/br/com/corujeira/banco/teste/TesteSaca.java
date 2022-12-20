package br.com.corujeira.banco.teste;

import br.com.corujeira.banco.model.Conta;
import br.com.corujeira.banco.model.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 456);

        conta.deposita(200);

        try {
            conta.saca(500);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
