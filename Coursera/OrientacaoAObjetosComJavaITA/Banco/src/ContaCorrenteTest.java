import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {
    @Test
    public void testDepositar() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        assertEquals(cc.saldo, 200);
    }

    @Test
    public void testSacar() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        cc.sacar(100);
        assertEquals(100, cc.saldo);
    }

    @Test
    public void testSacarMaisQueSaldo() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        assertEquals(cc.sacar(300), 0);
        
    }
}
