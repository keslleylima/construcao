package br.ufg.inf.es.construcao.fatorialsoma;

import org.junit.Assert;
import org.junit.Test;

public class FatorialsomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Fatorialsoma.fatorialsoma(0);
    }

    @Test
    public void testCasoDeFroteira() {
        Assert.assertEquals(1, Fatorialsoma.fatorialsoma(1));
    }

    @Test
    public void testFatorialSoma() {
        Assert.assertEquals(6, Fatorialsoma.fatorialsoma(3));
        Assert.assertEquals(2, Fatorialsoma.fatorialsoma(2));
    }
}