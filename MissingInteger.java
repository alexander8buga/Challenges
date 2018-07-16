/*Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Assume that:
	•	N is an integer within the range [1..100,000];
	•	each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:
	•	expected worst-case time complexity is O(N);
	•	expected worst-case space complexity is O(N) (not counting the storage required for input arguments).


*/




class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        /// find the max
        int max = A[0];
        for(int m = 0; m < A.length; m++) {
            if (A[m] > max) {
                max = A[m];
                
            }
        }
        // search the firt missing positive int
        int count = 0;
        int match = 1;
        if (max > 0) {
            for(int i = 1; i < max; i++) {
                for(int j = 0; j < A.length; j++) {
                    if( A[j] == i){
                        // break if found a match and jump to the previous loop to seach next match
                        break;
                        
                    } else {
                        count++;
                    }
                    
                }
                
                // check if count equals to lenght of array and so we found the match
                if (count == A.length) {
                    match = i;
                    // break out of parent loop;
                    break;
                } else 
                    count = 0;
                
            }
            if (count == 0) {
                match = A.length + 1;
            }
        }  
        
        return match;
    }
}
