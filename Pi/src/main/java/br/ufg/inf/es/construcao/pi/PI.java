package br.ufg.inf.es.construcao.pi;

/**
 * Algoritmo para obten��o do valor de pi envolvendo um total de n termos do
 * somat�rio.
 */
public class PI {
    public static int pi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }
}
