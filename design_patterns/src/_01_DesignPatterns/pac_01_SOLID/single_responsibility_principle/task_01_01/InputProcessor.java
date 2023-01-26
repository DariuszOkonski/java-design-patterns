package _01_DesignPatterns.pac_01_SOLID.single_responsibility_principle.task_01_01;

import java.util.Scanner;

public class InputProcessor {
    public static Pair process() {

        // ask the user for any input
        Scanner scanner = new Scanner(System.in);

        // get the given values
        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNumber = scanner.nextLine();

        Pair pair = new Pair(firstNumber, secondNumber);

        scanner.close();

        return pair;
    }
}

