package pac_01_SOLID.dependency_inversion_principle.task_02_01;

public class Skrill implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Skrill: pay()");
    }
}

