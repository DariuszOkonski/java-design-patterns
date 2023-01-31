package _02_DataStructures_01._01_Arrays.Test_05;

public class App {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,0,0,1,1};
        DutchNationalFlagProblem problem = new DutchNationalFlagProblem(nums);
        problem.solve();
        problem.showResult();

        int[] nums2 = {2,1,0,0};
        problem = new DutchNationalFlagProblem(nums2);
        problem.solve();
        problem.showResult();
    }
}

