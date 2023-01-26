package _01_DesignPatterns.pac_01_SOLID.interface_segregation_principle.task_02_01;

public class CEO implements ICEO {
    @Override
    public void makeDecisions() {
        System.out.println("CEO: makeDecisions()");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO: addStocks()");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO: addBonus()");
    }

    @Override
    public void salary() {
        System.out.println("CEO: salary()");
    }
}
