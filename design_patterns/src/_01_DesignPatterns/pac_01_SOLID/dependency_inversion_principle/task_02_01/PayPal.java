package _01_DesignPatterns.pac_01_SOLID.dependency_inversion_principle.task_02_01;

public class PayPal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("PayPal: pay()");
    }
}

