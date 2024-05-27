import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContaEspecialTest extends ContaCorrenteTest {


    @Before
    public void setUp() {
        cc = new ContaEspecial(150);
        cc.depositar(200);
    }

    @Test
    public void testSacarMaisQueSaldo() {
        assertEquals(cc.sacar(400), 0);
    }

    @Test
    public void testSacarMaisQueSaldoDentroDoLimite() {
        assertEquals(cc.sacar(350), 350);
    }
}
