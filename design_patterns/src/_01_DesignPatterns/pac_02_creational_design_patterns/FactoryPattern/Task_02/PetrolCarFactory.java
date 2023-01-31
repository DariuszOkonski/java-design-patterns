package _01_DesignPatterns.pac_02_creational_design_patterns.FactoryPattern.Task_02;

public class PetrolCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if(type.equals("FORD")) {
            return new PetrolFord();
        } else if(type.equals("TOYOTA")) {
            return new PetrolToyota();
        }
        return null;
    }
}

