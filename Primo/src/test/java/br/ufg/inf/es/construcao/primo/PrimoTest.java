package br.ufg.inf.es.construcao.primo;

import org.junit.Test;
import org.junit.Assert;

public class PrimoTest {

    @Test
    public void testPrimo() throws Exception {
        Assert.assertTrue(Primo.primo(2));
        Assert.assertTrue(Primo.primo(3));
        Assert.assertTrue(Primo.primo(5));
        Assert.assertTrue(Primo.primo(7));
    }
    @Test
    public void TestNaoPrimo() throws Exception {
        Assert.assertFalse(Primo.primo(10));
        Assert.assertFalse(Primo.primo(100));
        Assert.assertFalse(Primo.primo(12));
        Assert.assertFalse(Primo.primo(18));
        Assert.assertFalse(Primo.primo(36));
        Assert.assertFalse(Primo.primo(1000));
        }
    }

