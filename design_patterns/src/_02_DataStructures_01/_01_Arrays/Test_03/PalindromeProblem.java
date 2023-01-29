package _02_DataStructures_01._01_Arrays.Test_03;

public class PalindromeProblem {
    public boolean solve(String s) {
        int forward = 0;
        int backward = s.length() - 1;

        while (forward < backward) {
            if(s.charAt(forward) != s.charAt(backward))
                return false;

            forward++;
            backward--;
        }

        return true;
    }
}
