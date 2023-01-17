package pac_01_SOLID.liskov_substitution_principle.task_01_01;

//strategy pattern and template pattern, quarantee not violate this rule

public class App {
    public static void main(String[] args) {
        Vehicle v = new PetrolCar("Ford", 5);
        v.speedUp();
        v.slowDown();
        v.fuel();

        System.out.println("=========");
        v = new ElectricCar("Tesla", 12);
        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}

