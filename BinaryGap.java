// Description 
/*
Find max "zeros" binary gap within a positive integer N 
*/
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        
        String s = Integer.toString(N,2);
        
        long num = Long.parseLong(s);
        
        
        int countTemp = 0;
        int countFinal = 0;
        

        while ( num > 1) {
            if (num%10 == 1) {
                num /=10;
                while(num %10 == 0) {
                    countTemp++;
                    num = num/10;
                }
                if (countTemp > countFinal) {
                    countFinal = countTemp;
                    countTemp = 0;
                }
            } else {
                num /=10;
            }
        }
        return countFinal;
    }
}

