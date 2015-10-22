package br.ufg.inf.es.construcao.propriedade153;

/**
 *algoritmo que implementa a propriedade 153
 */
public class Propriedade153 {
    public static boolean pro153(int n){
        if(n < 0 || n > 999){
            throw new IllegalArgumentException("n é inválido");
        }

        int i = n / 100;
        int j = (n - 100*i) / 10;
        int k = n % 10;

        return ((i*i*i)+(j*j*j)+(k*k*k) == n);
    }
}
