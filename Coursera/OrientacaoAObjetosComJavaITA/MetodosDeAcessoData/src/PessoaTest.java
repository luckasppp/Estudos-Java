import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
    Calendario data;

    @Before
    public void setUp(){
        data = new Calendario();
        data.setData("07/06/2024");
    }

    @Test
    public void testPessoa1() {
        Pessoa p1 = new Pessoa("30/03/1997", data);
        assertEquals("30/03/1997", p1.getNascimento());
        assertEquals(p1.getIdade(), 27);
        assertEquals(p1.getSigno(), "Áries");
    }
        
    @Test
    public void testPessoa2() {
        Pessoa p1 = new Pessoa("09/05/2000", data);
        assertEquals("09/05/2000", p1.getNascimento());
        assertEquals(p1.getIdade(), 24);
        assertEquals(p1.getSigno(), "Touro");
        }
        
    @Test
    public void testPessoa3() {
        Pessoa p1 = new Pessoa("16/08/1995", data);
        assertEquals("16/08/1995", p1.getNascimento());
        assertEquals(p1.getIdade(), 28);
        assertEquals(p1.getSigno(), "Leão");
    }
}
