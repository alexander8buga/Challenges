// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int unpaired = 0;
        
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
                if (A[i] == A[j])
                    count++;
            }
            if (count%2 == 1) {
                unpaired =  A[i];
                break;
            } else {
                count = 0;
            }
        }
        
        
        return unpaired;
        
    }
}