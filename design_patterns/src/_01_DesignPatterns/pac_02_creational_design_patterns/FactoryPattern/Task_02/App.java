package _01_DesignPatterns.pac_02_creational_design_patterns.FactoryPattern.Task_02;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
        factory.getCar("FORD").assemble();
        factory.getCar("TOYOTA").assemble();

        factory = FactoryProducer.getFactory("PETROL");
        factory.getCar("FORD").assemble();
        factory.getCar("FORD").assemble();
    }
}

