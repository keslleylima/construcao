package br.ufg.inf.es.construcao.fatorial;

/**
 * programa para implementa��o do fatorial-soma(n)
 */
public class Fatorial {
    public static int Fatorial(int n){
        if(n < 1){
            throw new IllegalArgumentException("n nao � v�lido");
        }
        int i = 2;
        int f = 1;
        int p = 0;
        while (i <= n){
           int x = 1;
           while (x <= i){
                p = p + f;
                x = x + 1;
            }
            i = i + 1;
        }
        f = p;
        return f;
    }

}