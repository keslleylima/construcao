
package br.ufg.inf.es.construcao.fatorial;

import org.junit.Test;
import org.junit.Assert;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fatorial.fatorial(0);
    }

    @Test
    public void testFatorial() {
        Assert.assertEquals(6, Fatorial.fatorial(3));
        Assert.assertEquals(6 * 5 * 4 * 3 * 2, Fatorial.fatorial(6));
    }
}