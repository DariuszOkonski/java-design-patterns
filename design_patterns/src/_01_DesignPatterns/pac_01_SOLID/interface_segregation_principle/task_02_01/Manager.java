package _01_DesignPatterns.pac_01_SOLID.interface_segregation_principle.task_02_01;

public class Manager implements IManager {
    @Override
    public void salary() {
        System.out.println("Manager: salary()");
    }

    @Override
    public void hire() {
        System.out.println("Manager: hire()");
    }

    @Override
    public void train() {
        System.out.println("Manager: train()");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager: addBonus()");
    }
}
