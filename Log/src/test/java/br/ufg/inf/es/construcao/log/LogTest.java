package br.ufg.inf.es.construcao.log;

import org.junit.Test;
import org.junit.Assert;

public class LogTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentoInvalido() throws Exception {
        Log.log(0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentoInvalido() throws Exception {
        Log.log(3, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllParamentoInvalido() throws Exception {
        Log.log(-2, 1);
    }

    @Test
    public void testlog() {
        Assert.assertEquals(6, Log.log(2, 3));
        Assert.assertEquals(64, Log.log(5, 4));
    }


}
