package br.ufg.inf.es.construcao.primo;

/**
 * programa que determina a primoridade de um numero(n)
 */
public class Primo {
    public  static boolean primo(int n) {
        if(n <= 1) {
            throw new IllegalArgumentException("N NÃO É VÁLIDO");
        }
        int i = 2;
        while (i <= (n-1)) {
            if(n % i == 0) {
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
