package br.com.corujeira.banco.util;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int idade = 30;

        Integer idadeReferencia = Integer.valueOf(25);
        int valor = idadeReferencia.intValue();

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(idade);
        numeros.add(10);
        numeros.add(20);

        System.out.println(numeros);

    }
}
