package _01_DesignPatterns.pac_01_SOLID.dependency_inversion_principle.task_02_01;

public class App {
    public static void main(String[] args) {
        WebStore store = new WebStore();
        store.purchaseItem();
    }
}

