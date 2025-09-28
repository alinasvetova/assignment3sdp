package unitconverter.systems;

import unitconverter.interfaces.ImperialSystem;

public class ConcreteImperialSystem implements ImperialSystem {
    private double feet;
    private double pounds;
    private double fahrenheit;

    public ConcreteImperialSystem(double feet, double pounds, double fahrenheit) {
        this.feet = feet;
        this.pounds = pounds;
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double getFeet() {
        return feet;
    }

    @Override
    public double getPounds() {
        return pounds;
    }

    @Override
    public double getFahrenheit() {
        return fahrenheit;
    }

    @Override
    public void setFeet(double feet) {
        this.feet = feet;
    }

    @Override
    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    @Override
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public String toString() {
        return String.format("Imperial: %.2f ft, %.2f lb, %.2f °F", feet, pounds, fahrenheit);
    }
}
