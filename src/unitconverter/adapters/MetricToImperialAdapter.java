package unitconverter.adapters;

import unitconverter.interfaces.ImperialSystem;
import unitconverter.interfaces.MetricSystem;

public class MetricToImperialAdapter implements ImperialSystem {
    private static final double METERS_TO_FEET = 3.28084;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;

    private final MetricSystem metricSystem;

    public MetricToImperialAdapter(MetricSystem metricSystem) {
        this.metricSystem = metricSystem;
    }

    @Override
    public double getFeet() {
        return metricSystem.getMeters() * METERS_TO_FEET;
    }

    @Override
    public double getPounds() {
        return metricSystem.getKilograms() * KILOGRAMS_TO_POUNDS;
    }

    @Override
    public double getFahrenheit() {
        return (metricSystem.getCelsius() * 9 / 5) + 32;
    }

    @Override
    public void setFeet(double feet) {
        metricSystem.setMeters(feet / METERS_TO_FEET);
    }

    @Override
    public void setPounds(double pounds) {
        metricSystem.setKilograms(pounds / KILOGRAMS_TO_POUNDS);
    }

    @Override
    public void setFahrenheit(double fahrenheit) {
        metricSystem.setCelsius((fahrenheit - 32) * 5 / 9);
    }

    @Override
    public String toString() {
        return String.format("Adapter(Metric→Imperial): %.2f ft, %.2f lb, %.2f °F",
                getFeet(), getPounds(), getFahrenheit());
    }
}
