package pac_01_SOLID.interface_segregation_principle.task_02_01;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary();

        System.out.println("====");
        Manager manager = new Manager();
        manager.salary();
        manager.addBonus();
        manager.hire();
        manager.train();

        System.out.println("====");
        CEO ceo = new CEO();
        ceo.salary();
        ceo.addBonus();
        ceo.addStocks();
        ceo.makeDecisions();
    }
}

