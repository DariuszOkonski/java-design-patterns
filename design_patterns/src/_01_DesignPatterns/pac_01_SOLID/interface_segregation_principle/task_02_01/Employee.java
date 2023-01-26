package _01_DesignPatterns.pac_01_SOLID.interface_segregation_principle.task_02_01;

public class Employee implements IEmployee {
    @Override
    public void salary() {
        System.out.println("Employee: salary()");
    }
}
