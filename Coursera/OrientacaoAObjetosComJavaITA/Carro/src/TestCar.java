import static org.junit.Assert.*;
import org.junit.Test;

public class TestCar {
    @Test
    public void testAcelerar() {
        Car c = new  Car();
        c.setPotencia(10);
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testCarroParado() {
        Car c = new  Car();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testFrearAteZero() {
        Car c = new  Car();
        c.setPotencia(10);
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }
}