package pac_01_SOLID.dependency_inversion_principle.task_02_01;

public class PaymentController {
    private PaymentMethod paymentMethod;

    public PaymentController() {

    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        this.paymentMethod.pay();
    }
}

