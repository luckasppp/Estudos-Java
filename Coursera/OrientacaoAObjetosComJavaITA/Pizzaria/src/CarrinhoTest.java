import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {
    Carrinho carrinho;
    Pizza p1;
    Pizza p2;
    Pizza p3;

    @Before
    public void setUp() {
        carrinho = new Carrinho();

        p1 = new Pizza();
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("Tomate");
        
        p2 = new Pizza();
        p2.adicionaIngrediente("Catupiry");
        p2.adicionaIngrediente("Calabresa");
        p2.adicionaIngrediente("Requeijão");
        p2.adicionaIngrediente("Frango");
        p2.adicionaIngrediente("Ovo");
        p2.adicionaIngrediente("Salame");

        p3 = new Pizza();
    }


    @Test
    public void testPizzaVazia() {
        carrinho.adicionaPizza(p1);
        carrinho.adicionaPizza(p2);
        assertEquals(38, carrinho.getPrecoTotal(), 0.01);
    }

    @Test
    public void testGetPrecoTotal() {
        Carrinho carrinho2 = new Carrinho();
        carrinho2.adicionaPizza(p3);
        assertEquals(0.0, carrinho2.getPrecoTotal(), 0.01);
    }
}
