/*Output Format
Print Yes if he can use the magazine to create an untraceable replica of his ransom note. Otherwise, print No.
Sample Input 0
6 4
give me one grand today night
give one grand today
Sample Output 0
Yes
Sample Input 1
6 5
two times three is not four
two times two is four
Sample Output 1
No
Explanation 1
'two' only occurs once in the magazine.*/

____________________________________________________________

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        
        Hashtable<String, Integer> tableMagazine = new Hashtable<String, Integer>();
        Boolean flag = true;
        
        for (String magazineString : magazine) {
            tableMagazine.compute(magazineString, (key, value) -> (value == null ? 1 : value + 1));
        }
        
        
        for(int i = 0; i< note.length; i++) {
            if (!tableMagazine.containsKey(note[i])) {
                flag = false;
                break;
            } else {
                tableMagazine.compute(note[i], (key, value) -> (value - 1));
            }
        }
        
        for(int i = 0; i< note.length; i++) {
            if (tableMagazine.containsKey(note[i]))
                if (tableMagazine.get(note[i]).intValue() < 0 ) {
                    flag = false;
                    break;
            }
        }
        
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

