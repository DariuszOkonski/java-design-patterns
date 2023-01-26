package _01_DesignPatterns.pac_01_SOLID.liskov_substitution_principle.task_01_01;

public abstract class Vehicle implements Fuel{
    private String type;
    protected int age;

    public Vehicle(String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }

    protected void slowDown() {
        System.out.println("Vehicle is slowing down...");
    }
}

