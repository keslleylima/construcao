package br.ufg.inf.es.construcao.log;

/**
 * servi�os para implementa��o do log -natural-simples
 */
public class Log {
    public static int log(int n,int k) {
        if(n < 1 || k < 2){
            throw new IllegalArgumentException("n ou k inv�lido");
        }
        int i = 2;
        int e = n + 1;
        while(i <= k){
            int x = 1;
            int p = 1;
            while ( x <= i) {
                p = p * n;
                x = x + 1;
            }
            int c= 2;
            int f = 1;
            while( c <= i){
                f = f *c;
                c = c + 1;
            }
            e = e + p / f;
            i = i + 1;
        }
        return e;
    }
}
