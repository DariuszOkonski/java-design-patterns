package pac_01_SOLID.single_responsibility_principle.task_01;

import java.util.Scanner;

public class InputProcessor {

    public  static Pair process() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number");
        String secondNumber = scanner.nextLine();

        scanner.close();

        Pair pair = new Pair(firstNumber, secondNumber);

        return pair;
    }
}
