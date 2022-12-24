package br.com.corujeira.banco.util;

import br.com.corujeira.banco.model.Cliente;
import br.com.corujeira.banco.model.Conta;
import br.com.corujeira.banco.model.ContaCorrente;
import br.com.corujeira.banco.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Abimael");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Isa");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        Comparator<Conta> comparator = (c1, c2) -> {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
        };

        lista.sort(comparator);

        lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
    }
}