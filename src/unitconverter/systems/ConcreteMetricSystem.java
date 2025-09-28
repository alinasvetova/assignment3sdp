package unitconverter.systems;

import unitconverter.interfaces.MetricSystem;

public class ConcreteMetricSystem implements MetricSystem {
    private double meters;
    private double kilograms;
    private double celsius;

    public ConcreteMetricSystem(double meters, double kilograms, double celsius) {
        this.meters = meters;
        this.kilograms = kilograms;
        this.celsius = celsius;
    }

    @Override
    public double getMeters() {
        return meters;
    }

    @Override
    public double getKilograms() {
        return kilograms;
    }

    @Override
    public double getCelsius() {
        return celsius;
    }

    @Override
    public void setMeters(double meters) {
        this.meters = meters;
    }

    @Override
    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    @Override
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public String toString() {
        return String.format("Metric: %.2f m, %.2f kg, %.2f °C", meters, kilograms, celsius);
    }
}