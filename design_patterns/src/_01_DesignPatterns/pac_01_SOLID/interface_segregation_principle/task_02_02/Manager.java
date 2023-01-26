package _01_DesignPatterns.pac_01_SOLID.interface_segregation_principle.task_02_02;

public class Manager implements Employee, ManagersAndCEOs {
    void hire() {
        System.out.println("Manager: hire()");
    }

    void train() {
        System.out.println("Manager: train()");
    }

    @Override
    public void salary() {
        System.out.println("Manager: salary()");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager: addBonus()");
    }
}
