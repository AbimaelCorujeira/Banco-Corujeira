package br.com.corujeira.banco.util;

import br.com.corujeira.banco.model.Conta;
import br.com.corujeira.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TestArrayListEquals {
    public static void main(String[] args) {

/*      Conta contaCorrente = new ContaCorrente(22, 11);
        Conta contaCorrente2 = new ContaCorrente(22, 11);

        System.out.println(contaCorrente.ehIgual(contaCorrente2)); */

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta contaCorrente = new ContaCorrente(22, 11);
        lista.add(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(22, 15);
        lista.add(contaCorrente2);

        Conta contaCorrente3 = new ContaCorrente(22, 15);
        //lista.add(contaCorrente3);

        System.out.println("Já existe? " + lista.contains(contaCorrente3));

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
