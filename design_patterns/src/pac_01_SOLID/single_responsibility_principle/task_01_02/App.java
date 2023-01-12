package pac_01_SOLID.single_responsibility_principle.task_01_02;

public class App {
    public static void main(String[] args) {
        // TODO - do it by yourself

        Console.DisplayMessage("Welcome to the Application!");

        StringNumberPair stringNumberPair = new StringNumberPair();
        stringNumberPair.setNumber1(Console.getInput("Enter the first number: "));
        stringNumberPair.setNumber2(Console.getInput("Enter the second number: "));

        if(!Validation.isValid(stringNumberPair)) {
            Console.DisplayMessage("Some input is not valid...");
            return;
        }

        NumberPair numberPair = new NumberPair(stringNumberPair);
        Console.DisplayMessage("The result is: " + numberPair.CountResult());

        Console.DisplayMessage("End or the application!");
    }
}

