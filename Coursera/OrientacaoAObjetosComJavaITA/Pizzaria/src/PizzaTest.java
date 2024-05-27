import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaTest {
    private Pizza pizza;

    @Before
    public void setUp() {
        pizza = new Pizza();
        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Queijo");
        assertTrue(pizza.temIngredientes());
    }

    @Test
    public void testAdicionaIngrediente() {
        assertTrue(pizza.temIngredientes());
    }

    @Test
    public void testGetPreco() {
        assertEquals(15.0, pizza.getPreco(), 0.01);
        pizza.adicionaIngrediente("Catupiry");
        pizza.adicionaIngrediente("Azeitona");
        pizza.adicionaIngrediente("Bacon");
        assertEquals(20.0, pizza.getPreco(), 0.01);
        pizza.adicionaIngrediente("Calabresa");
        assertEquals(23.0, pizza.getPreco(), 0.01);
    }

    @After
    public void tearDown() {
        Pizza.zerarIgredientes(pizza);
        assertFalse(pizza.temIngredientes());
    }
}