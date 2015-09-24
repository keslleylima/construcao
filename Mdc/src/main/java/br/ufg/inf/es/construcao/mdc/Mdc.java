package br.ufg.inf.es.construcao.mdc;

/**
 * calclulo do minimo multiplo comum
 */
public class Mdc {
    public static  int mdc(int a,int b) {
        if( a < b || b <= 0) {
            throw new IllegalArgumentException("n inválido");
        }
        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
}
