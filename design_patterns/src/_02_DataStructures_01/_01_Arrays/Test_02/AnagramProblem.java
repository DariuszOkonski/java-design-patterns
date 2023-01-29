package _02_DataStructures_01._01_Arrays.Test_02;

import java.util.Arrays;

public class AnagramProblem {
    public boolean solve(char[] s1, char[] s2) {
        if(s1.length != s2.length)
            return false;

        //sort the letters of the strings
        // 0(NlogN) this is the bottleneck of the algorithm
        Arrays.sort(s1);
        Arrays.sort(s2);

        // consider all the letters one by one and we have to
        // compare the letters
        // 0(N) but the overall running time is 0(NlogN) + 0(N) = 0(NlogN)
        for(int i = 0; i<s1.length; i++) {
            if(s1[i] != s2[i])
                return false;
        }

        return true;
    }
}
