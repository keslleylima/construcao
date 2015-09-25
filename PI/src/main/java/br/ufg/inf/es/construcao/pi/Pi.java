package br.ufg.inf.es.construcao.pi;

/**
 * um algoritmo para obtenção do valor de pi
 */
public class Pi {
    public  static int pi(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("n inválido");
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
