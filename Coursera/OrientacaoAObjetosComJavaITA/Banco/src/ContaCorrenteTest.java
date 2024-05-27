import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class ContaCorrenteTest {
    
    ContaCorrente cc;

    @Before
    public void setUp() {
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    public void testDepositar() {
        assertEquals(cc.saldo, 200);
    }

    @Test
    public void testSacar() {
        cc.sacar(100);
        assertEquals(100, cc.saldo);
    }

    @Test
    public void testSacarMaisQueSaldo() {
        assertEquals(cc.sacar(300), 0);
    }
}
