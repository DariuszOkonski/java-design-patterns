package _02_DataStructures_01._01_Arrays.Test_03;

public class App {
    public static void main(String[] args) {
        PalindromeProblem problem = new PalindromeProblem();
        System.out.println(problem.solve("adam"));
        System.out.println(problem.solve("racecar"));
        System.out.println(problem.solve("radar"));
        System.out.println(problem.solve("orange"));
    }
}
