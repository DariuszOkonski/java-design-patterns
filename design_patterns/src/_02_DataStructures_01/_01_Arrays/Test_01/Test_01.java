package _02_DataStructures_01._01_Arrays.Test_01;

import java.util.Arrays;

public class Test_01 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ReverseArrayProblem problem = new ReverseArrayProblem();
        System.out.println(Arrays.toString(problem.solve(nums)));

    }
}
