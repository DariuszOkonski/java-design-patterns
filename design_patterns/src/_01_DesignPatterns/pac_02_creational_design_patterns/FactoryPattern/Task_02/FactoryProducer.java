package _01_DesignPatterns.pac_02_creational_design_patterns.FactoryPattern.Task_02;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equals("ELECTRIC")) {
            return new ElectricCarFactory();
        } else if (factory.equals("PETROL")) {
            return new PetrolCarFactory();
        }
        return null;
    }
}
