import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AutoridadeTest {
    public FormatadorNome formatador;
    public Autoridade autoridade;

    @Test
    public void testInformal() {
        formatador = new Informal();
        autoridade = new Autoridade("Lucas", "Damasceno", formatador);
        assertEquals("Lucas", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoHomem() {
        formatador = new Respeitoso(true);
        autoridade = new Autoridade("Lucas", "Damasceno", formatador);
        assertEquals("Sr. Damasceno", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoMulher() {
        formatador = new Respeitoso(false);
        autoridade = new Autoridade("Ana Raquel", "Damasceno", formatador);
        assertEquals("Sra. Damasceno", autoridade.getTratamento());
    }

    @Test
    public void testComTitulo() {
        formatador = new ComTitulo("Enfermeira");
        autoridade = new Autoridade("Ana Raquel", "Damasceno", formatador);
        assertEquals("Enfermeira Ana Raquel Damasceno", autoridade.getTratamento());
    }
}
