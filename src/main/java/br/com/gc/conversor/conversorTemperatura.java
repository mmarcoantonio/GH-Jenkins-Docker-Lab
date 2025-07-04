package br.com.gc.conversor;

public class conversorTemperatura {

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}