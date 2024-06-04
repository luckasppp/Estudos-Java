package main.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.producao.CarrinhoDeCompras;
import main.java.producao.Produto;
import main.java.producao.ProdutoComTamanho;

public class CarrinhoDeComprasTest {

    Produto p1;
    Produto p2;
    Produto p3;
    ProdutoComTamanho p4;
    ProdutoComTamanho p5;
    ProdutoComTamanho p6;

    @Before
    public void setUp() {
        p1 = new Produto();
        p2 = new Produto();
        p3 = new Produto();
        p4 = new ProdutoComTamanho();
        p5 = new ProdutoComTamanho();
        p6 = new ProdutoComTamanho();
    }

    @Test
    public void testAdicionaProduto() {
        p1.setCodigo(1);
        p1.setNome("Arroz");
        p1.setPreco(2.57);
        p2.setCodigo(2);
        p2.setNome("Feijão");
        p2.setPreco(5.69);

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p2, 1);

        assertEquals(c1.getItens().size(), 2);
    }

    @Test
    public void testAdicionaProdutoMesmoProduto() {
        p1.setCodigo(1);
        p1.setNome("Arroz");
        p1.setPreco(2.57);
        p2.setCodigo(2);
        p2.setNome("Feijão");
        p2.setPreco(5.69);

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p2, 1);

        assertEquals(c1.getItens().size(), 2);
    }

    @Test
    public void testCalcularValorTotal() {
        p1.setCodigo(1);
        p1.setNome("Arroz");
        p1.setPreco(2.57);
        p2.setCodigo(2);
        p2.setNome("Feijão");
        p2.setPreco(5.69);

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionaProduto(p1, 3);
        c1.adicionaProduto(p2, 5);

        assertEquals(36.16, c1.calcularValorTotal(), 0.01);
    }

    @Test
    public void testRemoveProdutoTotalmente() {
        p1.setCodigo(1);
        p1.setNome("Arroz");
        p1.setPreco(2.57);
        p2.setCodigo(2);
        p2.setNome("Feijão");
        p2.setPreco(5.69);

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p2, 1);

        c1.removeProduto(p1, 2);

        assertEquals(c1.getItens().size(), 1);
    }

    @Test
    public void testRemoveProdutoParcialmente() {
        p1.setCodigo(1);
        p1.setNome("Arroz");
        p1.setPreco(2.57);
        p2.setCodigo(2);
        p2.setNome("Feijão");
        p2.setPreco(5.69);

        p3.setCodigo(3);
        p3.setNome("Fubá");

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p1, 1);
        c1.adicionaProduto(p2, 1);

        c1.removeProduto(p3, 1);

        assertEquals(c1.getItens().size(), 2);
    }
}
