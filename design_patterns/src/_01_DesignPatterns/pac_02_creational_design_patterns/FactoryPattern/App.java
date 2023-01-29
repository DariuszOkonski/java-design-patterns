package _01_DesignPatterns.pac_02_creational_design_patterns.FactoryPattern;

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();

        animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();
    }
}

