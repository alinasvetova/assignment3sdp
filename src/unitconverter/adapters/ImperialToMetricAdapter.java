package unitconverter.adapters;

import unitconverter.interfaces.ImperialSystem;
import unitconverter.interfaces.MetricSystem;

public class ImperialToMetricAdapter implements MetricSystem {
    private static final double FEET_TO_METERS = 0.3048;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;

    private final ImperialSystem imperialSystem;

    public ImperialToMetricAdapter(ImperialSystem imperialSystem) {
        this.imperialSystem = imperialSystem;
    }

    @Override
    public double getMeters() {
        return imperialSystem.getFeet() * FEET_TO_METERS;
    }

    @Override
    public double getKilograms() {
        return imperialSystem.getPounds() * POUNDS_TO_KILOGRAMS;
    }

    @Override
    public double getCelsius() {
        return (imperialSystem.getFahrenheit() - 32) * 5 / 9;
    }

    @Override
    public void setMeters(double meters) {
        imperialSystem.setFeet(meters / FEET_TO_METERS);
    }

    @Override
    public void setKilograms(double kilograms) {
        imperialSystem.setPounds(kilograms / POUNDS_TO_KILOGRAMS);
    }

    @Override
    public void setCelsius(double celsius) {
        imperialSystem.setFahrenheit((celsius * 9 / 5) + 32);
    }

    @Override
    public String toString() {
        return String.format("Adapter(Imperial→Metric): %.2f m, %.2f kg, %.2f °C",
                getMeters(), getKilograms(), getCelsius());
    }
}