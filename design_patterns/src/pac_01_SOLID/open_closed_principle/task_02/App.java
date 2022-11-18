package pac_01_SOLID.open_closed_principle.task_02;

public class App {
    public static void main(String[] args) {
        SortingProcessor.execute(new InsertionSort());
        SortingProcessor.execute(new SelectionSort());
        SortingProcessor.execute(new MergeSort());
    }
}
