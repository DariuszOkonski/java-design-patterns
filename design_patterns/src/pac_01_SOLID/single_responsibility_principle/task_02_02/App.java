package pac_01_SOLID.single_responsibility_principle.task_02_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final int THRESHOLD = 5;

    public static void main(String[] args) {
        // TODO - handle only methods, don't create any classes

        DisplayMessage("Welcome to the Application!");
        DisplayMessage("Enter 5 valid integers in the range [0, 10]");

        var numbers = FillListWithNumbers();

        SortNumbers(numbers);

        DisplayList(numbers);
    }
    private static void SortNumbers(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static void DisplayList(List<Integer> nums) {
        for(int num : nums) {
            DisplayMessage(num + " ");
        }
    }

    private static List<Integer> FillListWithNumbers() {
        List<Integer> nums = new ArrayList<>();

        while (nums.size() < THRESHOLD){
            String s = GetInput();

            if(!IsValid(s)) {
                DisplayMessage("Invalid! Try again");
                continue;
            }

            int num = Integer.parseInt(s);

            if(!IsInRange(num)) {
                DisplayMessage("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }

        return nums;
    }
    private static boolean IsInRange(Integer num) {
        if(num < 0|| num > 10) {
            return false;
        }
        return true;
    }

    private static boolean IsValid(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return  false;
        }
        return true;
    }
    private static String GetInput() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        scanner.close();

        return str;
    }
    private static void DisplayMessage(String message) {
        System.out.println(message);
    }
}
