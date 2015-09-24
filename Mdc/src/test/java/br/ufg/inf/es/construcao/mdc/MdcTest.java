package br.ufg.inf.es.construcao.mdc;

import org.junit.Test;
import org.junit.Assert;

public class MdcTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
       Mdc.mdc(2,5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestSegundoInvalido() throws Exception {
        Mdc.mdc(3,-1);
    }
    @Test
    public void testMdc() {
        Assert.assertEquals(6,Mdc.mdc(12, 6));
        Assert.assertEquals(4,Mdc.mdc(20, 12));
        Assert.assertEquals(4,Mdc.mdc(24, 20));
    }
}

