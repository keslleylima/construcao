package br.ufg.inf.es.construcao.soma;

/**
 * Algoritmo que realiza a soma de n numeros naturais.
 */
public class SomaNaturais {
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}
