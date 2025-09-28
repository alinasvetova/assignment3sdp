Unit Converter - Adapter Pattern Implementation
A clean Java project that converts between Metric and Imperial units using the Adapter design pattern.

What It Does
This project lets you easily convert measurements between different systems:

Length: Meters ↔ Feet

Weight: Kilograms ↔ Pounds

Temperature: Celsius ↔ Fahrenheit

Project Structure
interfaces - Measurement system contracts
systems - Actual implementations
adapters - Converters between systems
utility - Helper functions
demo - Example usage

How to Run
Compile the code:

javac -d bin src/com/unitconverter/interfaces/*.java \
           src/com/unitconverter/systems/*.java \
           src/com/unitconverter/adapters/*.java \
           src/com/unitconverter/utility/*.java \
           src/com/unitconverter/demo/*.java


Run the demo:
java -cp bin com.unitconverter.demo.UnitConversionDemo

What You'll See
The demo will show:

Original measurements in both systems

Converted values using adapters

Round-trip conversion tests

Direct conversion examples

Example Usage
MetricSystem person = new ConcreteMetricSystem(1.75, 70.0, 20.0);
ImperialSystem imperialPerson = UnitConverter.convertToImperial(person);

System.out.println("Metric: " + person);
System.out.println("Imperial: " + imperialPerson);
Clean Code Features
Clear names: MetricToImperialAdapter, convertToImperial()

Single responsibility: Each class does one thing well

No repetition: Common logic in one place

Easy to test: Simple, focused methods

Design Pattern
Uses the Adapter Pattern to make different measurement systems work together without changing their original code.

Assignment Info
Course: Software Design Patterns
Assignment: #3 - Adapter Pattern Implementation
Topic: Unit conversion (Metric ↔ Imperial)
Principles: Clean Code, Adapter Pattern
