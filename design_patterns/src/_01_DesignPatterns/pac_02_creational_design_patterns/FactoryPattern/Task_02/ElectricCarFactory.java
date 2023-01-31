package _01_DesignPatterns.pac_02_creational_design_patterns.FactoryPattern.Task_02;

public class ElectricCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if(type.equals("FORD")) {
            return new ElectricFord();
        } else if(type.equals("TOYOTA")) {
            return new ElectricToyota();
        }
        return null;
    }
}

