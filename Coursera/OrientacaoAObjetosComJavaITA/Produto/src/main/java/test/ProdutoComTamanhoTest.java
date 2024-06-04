package main.java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.producao.*;

public class ProdutoComTamanhoTest {
    ProdutoComTamanho p1;
    ProdutoComTamanho p2;
    ProdutoComTamanho p3;
    ProdutoComTamanho p4;
    ProdutoComTamanho p5;
    Produto p6;

    @Before
    public void setUp() {
        p1 = new ProdutoComTamanho();
        p2 = new ProdutoComTamanho();
        p3 = new ProdutoComTamanho();
        p4 = new ProdutoComTamanho();
        p6 = new Produto();

        p1.setCodigo(1);
        p1.setTamanho(10);
        p1.setNome("Carro de Brinquedo");

        p2.setCodigo(1);
        p2.setTamanho(10);
        p2.setNome("Carro");


        p3.setCodigo(1);
        p3.setTamanho(5);
        p3.setNome("Carrinho de Mão");

        p4.setCodigo(2);
        p4.setTamanho(10);
        p4.setNome("Carro de Brinquedo");
    }

    @Test
    public void testEqualsTrue() {
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEqualsTamanhoDiferente() {
        assertFalse(p1.equals(p3));
    }

    @Test
    public void testEqualsCodigoDiferente() {
        assertFalse(p1.equals(p4));
    }

    @Test
    public void testEqualsMesmoObjeto() {
        assertTrue(p1.equals(p1));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(p1.equals(null));
    }

    @Test
    public void testEqualsClasseDiferente() {
        assertFalse(p1.equals(p6));
    }

    @Test
    public void testHashCode() {
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
