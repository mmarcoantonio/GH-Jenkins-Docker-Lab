public class conversorTemperatura {

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {

        double tempFahrenheit = 68;
        double novoTempCelsius = fahrenheitParaCelsius(tempFahrenheit);
        System.out.println(tempFahrenheit + " graus Fahrenheit equivalem a " + String.format("%.2f", novoTempCelsius) + " graus Celsius.");

        double tempCelsius = 25;
        double novoTempFahrenheit = celsiusParaFahrenheit(tempCelsius);
        System.out.println(tempCelsius + " graus Celsius equivalem a " + String.format("%.2f", novoTempFahrenheit) + " graus Fahrenheit.");
    }
}