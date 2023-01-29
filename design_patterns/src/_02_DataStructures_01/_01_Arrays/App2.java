package _02_DataStructures_01._01_Arrays;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        //ArrayLists use standard arrays under the hood

        List<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Daniel");
        names.add("Adam");
        names.add("Ana");

        // O(N)
//        System.out.println(names.get(0));
        names.remove(0);
        System.out.println(names.get(0));

        System.out.println(names.size());
        for(String name: names) {
            System.out.println(name);
        }



    }
}
