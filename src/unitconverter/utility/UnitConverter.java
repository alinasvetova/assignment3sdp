package unitconverter.utility;

import unitconverter.adapters.ImperialToMetricAdapter;
import unitconverter.adapters.MetricToImperialAdapter;
import unitconverter.interfaces.ImperialSystem;
import unitconverter.interfaces.MetricSystem;

public class UnitConverter {
    private UnitConverter() {
        // Private constructor to prevent instantiation
    }

    public static ImperialSystem convertToImperial(MetricSystem metricSystem) {
        return new MetricToImperialAdapter(metricSystem);
    }

    public static MetricSystem convertToMetric(ImperialSystem imperialSystem) {
        return new ImperialToMetricAdapter(imperialSystem);
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}