package br.ufg.inf.es.construcao.propriedade153;

import org.junit.Assert;
import org.junit.Test;

/**
 * teste para verificar a validade do algoritmo que implementa a propriedade 153
 */
public class Propriedade153Test {
    @Test(expected = IllegalArgumentException.class)
    public void test1ParametroInvalido() throws Exception {
        Propriedade153.pro153(-56545454);
        Propriedade153.pro153(1000);
    }

    @Test
    public void testPro153()  {
        Assert.assertTrue(Propriedade153.pro153(153));
    }

    @Test
    public void testNaoPro153()  {
        Assert.assertFalse(Propriedade153.pro153(200));

    }
}
