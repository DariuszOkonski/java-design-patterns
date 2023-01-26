package pac_01_SOLID.dependency_inversion_principle.task_02_01;

public class WebStore {
    private PaymentController controller;

    public  WebStore() {
        this.controller = new PaymentController();
        this.controller.setPaymentMethod(new Payoneer());
    }

    public void purchaseItem() {
        this.controller.pay();
    }
}



