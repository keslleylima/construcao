package br.ufg.inf.es.construcao.log;

import org.junit.Test;
import org.junit.Assert;

public class LogTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Log.log(-8, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Log.log(1, 0);
    }

    @Test
    public void testLog() {
        Assert.assertEquals(2, Log.log(1, 2));
        Assert.assertEquals(5, Log.log(2, 2));
        Assert.assertEquals(126, Log.log(8, 3));

    }
}