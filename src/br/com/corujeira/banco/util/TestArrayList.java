package br.com.corujeira.banco.util;

import br.com.corujeira.banco.model.Conta;
import br.com.corujeira.banco.model.ContaCorrente;
import br.com.corujeira.banco.model.ContaPoupanca;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta contaCorrente = new ContaCorrente(22, 11);
        lista.add(contaCorrente);

        Conta contaCorrente1 = new ContaPoupanca(22, 12);
        lista.add(contaCorrente1);
        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println(lista.size());

        Conta contaCorrente3 = new ContaCorrente(55, 113);
        lista.add(contaCorrente3);
        Conta contaCorrente4 = new ContaCorrente(55, 114);
        lista.add(contaCorrente4);

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("-----------------------");

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
