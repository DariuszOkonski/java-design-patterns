package _01_DesignPatterns.pac_01_SOLID.single_responsibility_principle.task_01_01;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        // we can get the values
        Pair pair = InputProcessor.process();

        // check whether the inputs are fine or not
        if(!ViolationChecker.isValid(pair)){
            System.out.println("One of the input is invalid...");
            return;
        }

        // maybe we can create a distinct class for this operation (!!!!)
        int firstInteger = Integer.parseInt(pair.getFirst());
        int secondInteger = Integer.parseInt(pair.getSecond());

        // do the mathematical operation
        int result = Operation.execute(firstInteger, secondInteger);

        System.out.println("The result is: " + result);
        System.out.println("End or the application!");
    }
}















