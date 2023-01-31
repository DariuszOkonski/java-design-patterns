package _02_DataStructures_01._01_Arrays.Test_05;

import java.util.Arrays;

public class DutchNationalFlagProblem {
    // this will contain the values 0,1,2
    private int[] nums;

    public DutchNationalFlagProblem(int[] nums) {
        this.nums = nums;
    }

    public void solve() {
        int i = 0;
        int j = 0;
        int pivot = 1;
        int k = nums.length - 1;

        // it has 0(N) linear running time
        while (j <= k) {
            // when item with index j = 0
            if(nums[j] < pivot) {
                swap(i, j);
                i++;
                j++;
                // item is 2
            } else if(nums[j] > pivot) {
                swap(j, k);
                k--;
                // the item is 1
            } else {
                j++;
            }
        }
    }

    private void swap(int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void showResult() {
        System.out.println(Arrays.toString(this.nums));
    }
}
