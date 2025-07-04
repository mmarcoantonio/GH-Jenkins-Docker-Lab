package br.com.gc.conversor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class conversorTemperaturaTest {

    private final conversorTemperatura conversor = new conversorTemperatura();
    private final double margemErro = 0.001; // Margem de erro para comparações de double

    @Test
    void testFahrenheitParaCelsius_PontoDeCongelamento() {
        // 32°F é igual a 0°C
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), margemErro);
    }

    @Test
    void testFahrenheitParaCelsius_PontoDeEbulicao() {
        // 212°F é igual a 100°C
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), margemErro);
    }

    @Test
    void testCelsiusParaFahrenheit_PontoDeCongelamento() {
        // 0°C é igual a 32°F
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), margemErro);
    }

    @Test
    void testCelsiusParaFahrenheit_TemperaturaCorporal() {
        // 37°C é aproximadamente 98.6°F
        assertEquals(98.6, conversor.celsiusParaFahrenheit(37.0), margemErro);
    }
}