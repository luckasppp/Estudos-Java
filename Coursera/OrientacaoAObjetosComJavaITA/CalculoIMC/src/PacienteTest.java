import static org.junit.Assert.*;

import org.junit.Test;

public class PacienteTest {

    // Case 1:
    @Test
    public void testCalcularIMC1() {
        Paciente p = new Paciente(40, 1.75);
        assertEquals(13, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico1() {
        Paciente p = new Paciente(40, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Baixo peso muito grave", p.diagnostico());
    }

    // Case 2:
    @Test
    public void testCalcularIMC2() {
        Paciente p = new Paciente(50, 1.75);
        assertEquals(16.3, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico2() {
        Paciente p = new Paciente(50, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Baixo peso grave", p.diagnostico());
    }

    // Case 3:
    @Test
    public void testCalcularIMC3() {
        Paciente p = new Paciente(55, 1.75);
        assertEquals(18, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico3() {
        Paciente p = new Paciente(55, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Baixo peso", p.diagnostico());
    }

    // Case 4:
    @Test
    public void testCalcularIMC4() {
        Paciente p = new Paciente(70, 1.75);
        assertEquals(22.9, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico4() {
        Paciente p = new Paciente(70, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Peso normal", p.diagnostico());
    }

    // Case 5:
    @Test
    public void testCalcularIMC5() {
        Paciente p = new Paciente(80, 1.75);
        assertEquals(26.1, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico5() {
        Paciente p = new Paciente(80, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Sobrepeso", p.diagnostico());
    }

    // Case 6:
    @Test
    public void testCalcularIMC6() {
        Paciente p = new Paciente(95, 1.75);
        assertEquals(31, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico6() {
        Paciente p = new Paciente(95, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Obesidade grau I", p.diagnostico());
    }

    // Case 7:
    @Test
    public void testCalcularIMC7() {
        Paciente p = new Paciente(120, 1.75);
        assertEquals(39.1, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico7() {
        Paciente p = new Paciente(120, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Obesidade grau II", p.diagnostico());
    }

    // Case 8:
    @Test
    public void testCalcularIMC8() {
        Paciente p = new Paciente(140, 1.75);
        assertEquals(45.7, p.calcularIMC(), 0.1);
    }

    @Test
    public void testDiagnostico8() {
        Paciente p = new Paciente(140, 1.75);
        System.out.println(p.calcularIMC());
        assertSame("Obesidade grau III (obesidade mórbida)", p.diagnostico());
    }
}
