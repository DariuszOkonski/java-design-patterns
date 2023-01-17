package pac_01_SOLID.interface_segregation_principle.task_02_01;

public class App {
    public static void main(String[] args) {
        Worker workers = new Worker();
        Manager managers = new Manager();
        CEO ceos = new CEO();

        workers.salary();
        managers.salary();
        workers.salary();

        managers.hire();
        managers.train();

        ceos.addBonus();
        managers.addBonus();

        ceos.makeDecisions();
        ceos.addStocks();

        System.out.println("==========");
        workers.salary();

        managers.salary();
        managers.hire();
        managers.train();
        managers.addBonus();

        ceos.salary();
        ceos.addBonus();
        ceos.makeDecisions();
        ceos.addStocks();
    }
}