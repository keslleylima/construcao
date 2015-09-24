package br.ufg.inf.es.construcao.log;

/**
 * Algoritimo que calcula o fatorial de um número.
 */
public class Fatorial {
    public static int fatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}