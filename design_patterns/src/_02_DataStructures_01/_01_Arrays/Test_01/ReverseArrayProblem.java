package _02_DataStructures_01._01_Arrays.Test_01;

public class ReverseArrayProblem {
    // no need for extra memory
    // 0(N/2) = 0(N) linear running time
    public int[] solve(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }

        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
