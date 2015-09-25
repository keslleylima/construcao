package br.ufg.inf.es.construcao.pi;

import org.junit.Test;
import org.junit.Assert;

public class PiTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Pi.pi(-8);
        Pi.pi(-8810);
    }

    @Test
    public void testPI() {
       Assert.assertEquals(4,Pi.pi(1));
       Assert.assertEquals(3,Pi.pi(2));
       Assert.assertEquals(3,Pi.pi(3));
     }
}
