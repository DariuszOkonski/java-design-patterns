package pac_01_SOLID.single_responsibility_principle.task_01_02;

import java.util.Scanner;

public class Console {
    public static void DisplayMessage(String message) {
        System.out.println(message);
    }
    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    public static String getInput(String message) {
        System.out.println(message);
        return getInput();
    }
}
