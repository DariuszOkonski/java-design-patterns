package pac_01_SOLID.single_responsibility_principle.task_02;

import java.util.*;

public class App {
    public static final int TRESHOLD = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        // we get the inputs
        List<Integer> nums = getInputFromUser();

        // sort
        sort(nums);

        show(nums);
    }

    private static void show(List<Integer> nums) {
        for(int num: nums) {
            System.out.println(num + " ");
        }
    }

    private static void sort(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static List<Integer> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers int the range [0, 10]:");

        while (nums.size() < TRESHOLD) {
            String s = scanner.nextLine();

            if(!isValid(s))
                continue;

            nums.add(Integer.parseInt(s));
        }

        scanner.close();

        return nums;
    }

    private static boolean isValid(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }

        int num = Integer.parseInt(input);

        if(num < 0 || num > 10) {
            return false;
        }

        return true;
    }
}





























