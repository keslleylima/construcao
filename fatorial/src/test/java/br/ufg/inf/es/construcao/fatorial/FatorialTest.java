package br.ufg.inf.es.construcao.fatorial;

import org.junit.Test;
import org.junit.Assert;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalido() throws Exception {
       Fatorial.Fatorial(0);
    }

    @Test
    public void testfatorialsoma() throws Exception {
        Assert.assertEquals(2,Fatorial.Fatorial(2));
        Assert.assertEquals(5,Fatorial.Fatorial(3));
    }
    @Test
    public void testFronteira() throws Exception {
        Assert.assertEquals(0,Fatorial.Fatorial(1));
    }
}