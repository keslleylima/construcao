package br.ufg.inf.es.construcao.soma;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Teste para verificar a soma dos n naturais.
 */

public class SomaNaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        SomaNaturais.somaNaturais(0);
    }

    @Test
    public void testSoma() {
        Assert.assertEquals(3, SomaNaturais.somaNaturais(2));
        Assert.assertEquals(5050, SomaNaturais.somaNaturais(100));
        Assert.assertEquals(1, SomaNaturais.somaNaturais(1));
    }
}
