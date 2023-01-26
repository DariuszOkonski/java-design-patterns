package _01_DesignPatterns.pac_01_SOLID.open_closed_principle.task_02_01;

public class App {
    public static void main(String[] args) {
        SortingProcessor.execute(new MergeSort());
        SortingProcessor.execute(new InsertionSort());
        SortingProcessor.execute(new SelectionSort());
    }
}

//    In the previous lecture we have seen how to eliminate else-if statements and type casting with abstraction
//    (interfaces). In this example we have to solve the problem of dealing with multiple sorting algorithms.
//    So there are multiple sorting algorithms we have to deal with:
//    InsertionSort
//    SelectionSort
//    MergeSort
//    We have to make sure the SorterProcessor can handle any of these types.
//    So let's use abstraction to solve this problem without violating the SOLID principles.