package unitconverter.interfaces;

public interface MetricSystem {
    double getMeters();
    double getKilograms();
    double getCelsius();
    void setMeters(double meters);
    void setKilograms(double kilograms);
    void setCelsius(double celsius);
}