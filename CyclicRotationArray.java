// you can use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        int tempFirst = 0;
        int tempLast = 0;
        for (int j = 0; j < K; j++){
            tempLast = A[A.length-1];
            for(int i = 0; i < A.length; i++) {
                tempFirst = A[i];
                A[i] = tempLast;
                tempLast = tempFirst;
            }
        }
        return A;
    }
}