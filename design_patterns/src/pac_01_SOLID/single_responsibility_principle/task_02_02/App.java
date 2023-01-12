package pac_01_SOLID.single_responsibility_principle.task_02_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final int THRESHOLD = 5;

    public static void main(String[] args) {
        // TODO - handle only methods, don't create any classes

        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < THRESHOLD){
            String s = scanner.nextLine();

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again");
                continue;
            }

            int num = Integer.parseInt(s);

            if(num < 0|| num > 10) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }

        scanner.close();

        Collections.sort(nums);

        for(int num : nums) {
            System.out.println(num + " ");
        }
    }
}