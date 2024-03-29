package _01_DesignPatterns.pac_02_creational_design_patterns.FactoryPattern.Task_01;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType type) {
        if(type == AnimalType.CAT) {
            return new Cat();
        } else if(type == AnimalType.DOG) {
            return new Dog();
        } else if(type == AnimalType.LION) {
            return new Lion();
        } else if(type == AnimalType.TIGER) {
            return new Tiger();
        }
        return null;
    }
}

