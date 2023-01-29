package _02_DataStructures_01._01_Arrays;

public class App {
    public static void main(String[] args) {


        int[] nums = new int[10];

        // random indexing: we can use the indexes of the array slots
        // 0(1)
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }

        // we know the index of te item we want to manipulate
        nums[0] = 100;

        // if we do not know the index of the item (search)
        // linear search O(N)
        // we want to find the index of item 6
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 6)
                System.out.println("We have found the item at index: " + i);
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
