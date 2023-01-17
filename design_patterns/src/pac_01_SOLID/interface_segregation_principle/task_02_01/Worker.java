package pac_01_SOLID.interface_segregation_principle.task_02_01;

public class Worker implements Employee {
    @Override
    public void salary() {
        System.out.println("Worker: salary()");
    }
}
