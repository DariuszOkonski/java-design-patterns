package _01_DesignPatterns.pac_01_SOLID.liskov_substitution_principle.task_01_01;

public class PetrolCar extends Vehicle {

    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Car is speeding up...");
    }

    @Override
    protected void slowDown() {
        System.out.println("Car is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("We can use petrol without any problem");
    }
}