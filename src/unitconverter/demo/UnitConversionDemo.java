package unitconverter.demo;

import unitconverter.interfaces.ImperialSystem;
import unitconverter.interfaces.MetricSystem;
import unitconverter.systems.ConcreteImperialSystem;
import unitconverter.systems.ConcreteMetricSystem;
import unitconverter.utility.UnitConverter;

public class UnitConversionDemo {
    public static void main(String[] args) {
        demonstrateAdapterPattern();
        demonstrateDirectConversions();
    }

    private static void demonstrateAdapterPattern() {
        System.out.println("=== DEMONSTRATING ADAPTER PATTERN ===\n");

        // Create original systems
        MetricSystem metricPerson = new ConcreteMetricSystem(1.75, 70.0, 20.0);
        ImperialSystem imperialPerson = new ConcreteImperialSystem(5.9, 154.0, 68.0);

        System.out.println("Original measurements:");
        System.out.println("• " + metricPerson);
        System.out.println("• " + imperialPerson);

        // Use adapters
        ImperialSystem metricAsImperial = UnitConverter.convertToImperial(metricPerson);
        MetricSystem imperialAsMetric = UnitConverter.convertToMetric(imperialPerson);

        System.out.println("\nUsing adapters:");
        System.out.println("• " + metricAsImperial);
        System.out.println("• " + imperialAsMetric);

        // Demonstrate bidirectional conversion
        System.out.println("\n=== BIDIRECTIONAL CONVERSION TEST ===");
        testBidirectionalConversion();
    }

    private static void testBidirectionalConversion() {
        MetricSystem originalMetric = new ConcreteMetricSystem(2.0, 100.0, 0.0);

        System.out.println("Original Metric: " + originalMetric);

        // Convert to Imperial and back
        ImperialSystem imperial = UnitConverter.convertToImperial(originalMetric);
        System.out.println("As Imperial: " + imperial);

        MetricSystem backToMetric = UnitConverter.convertToMetric(imperial);
        System.out.println("Back to Metric: " + backToMetric);

        // Verify round-trip conversion
        boolean heightMatch = Math.abs(originalMetric.getMeters() - backToMetric.getMeters()) < 0.01;
        boolean weightMatch = Math.abs(originalMetric.getKilograms() - backToMetric.getKilograms()) < 0.01;
        boolean tempMatch = Math.abs(originalMetric.getCelsius() - backToMetric.getCelsius()) < 0.01;

        System.out.println("\nRound-trip verification:");
        System.out.println("• Height matches: " + heightMatch);
        System.out.println("• Weight matches: " + weightMatch);
        System.out.println("• Temperature matches: " + tempMatch);
    }

    private static void demonstrateDirectConversions() {
        System.out.println("\n=== DIRECT CONVERSIONS ===");

        double[] testTemperatures = {-40, 0, 20, 37, 100};
        System.out.println("\nTemperature conversions:");
        for (double celsius : testTemperatures) {
            double fahrenheit = UnitConverter.celsiusToFahrenheit(celsius);
            System.out.printf("• %.1f°C = %.1f°F\n", celsius, fahrenheit);
        }

        double[] testLengths = {0.5, 1.0, 2.0, 5.0};
        System.out.println("\nLength conversions:");
        for (double meters : testLengths) {
            double feet = UnitConverter.metersToFeet(meters);
            System.out.printf("• %.1f m = %.1f ft\n", meters, feet);
        }

        double[] testWeights = {50, 75, 100, 150};
        System.out.println("\nWeight conversions:");
        for (double kg : testWeights) {
            double pounds = UnitConverter.kilogramsToPounds(kg);
            System.out.printf("• %.1f kg = %.1f lb\n", kg, pounds);
        }
    }
}