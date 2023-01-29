package _02_DataStructures_01._01_Arrays.Test_02;

public class App {
    public static void main(String[] args) {
        AnagramProblem problem = new AnagramProblem();
        System.out.println(problem.solve("Adam".toCharArray(), "Daniel".toCharArray()));
        System.out.println(problem.solve("restful".toCharArray(), "fluster".toCharArray()));
        System.out.println(problem.solve("apple".toCharArray(), "orange".toCharArray()));
    }
}
