import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTest {
    @Test
    public void testFToC() {
        double resultado = Conversor.fToC(32.0);
        assertEquals(0.0, resultado, 0.001); // 32°F → 0°C
    }

    @Test
    public void testCToF() {
        double resultado = Conversor.cToF(100.0);
        assertEquals(212.0, resultado, 0.001); // 100°C → 212°F
    }
}
