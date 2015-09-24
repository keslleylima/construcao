package br.ufg.inf.es.construcao.fatorialsoma;

/**
 * Classe que implementa fatorial usando apenas somas.
 */

public class Fatorialsoma {
    public static int fatorialsoma(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = 2;
        int f = 1;
        while (i <= n) {
            f = Produto.produto(f, i);
            i = i + 1;
        }

        return f;
    }
}