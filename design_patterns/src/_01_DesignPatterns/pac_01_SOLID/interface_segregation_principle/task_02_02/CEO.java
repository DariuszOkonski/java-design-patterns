package _01_DesignPatterns.pac_01_SOLID.interface_segregation_principle.task_02_02;

public class CEO implements Employee, ManagersAndCEOs {
    void makeDecisions() {
        System.out.println("CEO: makeDecisions()");
    }

    void addStocks() {
        System.out.println("CEO: addStocks()");
    }

    @Override
    public void salary() {
        System.out.println("CEO: salary()");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO: addBonus()");
    }
}
