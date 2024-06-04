package main.java.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.producao.*;

public class ProdutoTest {
    Produto p1;
    Produto p2;
    Produto p3;
    Produto p4;
    ProdutoComTamanho p5;

    @Before
    public void setUp() {
        p1 = new Produto();
        p2 = new Produto();
        p3 = new Produto();
        p4 = new Produto();
        p5 = new ProdutoComTamanho();

        p1.setCodigo(1);
        p1.setNome("Arroz");

        p2.setCodigo(1);
        p2.setNome("Arroz Parborizado");

        p3.setCodigo(2);
        p3.setNome("Feijão");

    }

    @Test
    public void testEqualsTrue() {
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEqualsFalse() {
        assertFalse(p1.equals(p3));
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
        assertFalse(p1.equals(p5));
    }

    @Test
    public void testGetCodigo() {
        assertEquals(p1.getCodigo(), 1);
    }

    @Test
    public void testGetNome() {
        assertEquals(p3.getNome(), "Feijão");
    }

    @Test
    public void testGetPreco() {
        p4.setPreco(8.50);
        assertEquals(p4.getPreco(), 8.50, 0.01);
    }

    @Test
    public void testHashCode() {
        assertEquals(p1.hashCode(), p2.hashCode());
}
}
