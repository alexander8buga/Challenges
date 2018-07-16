// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class GCD
{
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int generalizedGCD(int arr[])
  {
    // INSERT YOUR CODE HERE
    int min = arr[0];
    int count = 0;
    int gdc = 1;
    //find min element
    for(int i = 1; i < arr.length; i++) {
        if (arr[i] < min) 
            min = arr[i];
    }
    
    // itterate to find the GCD
    for(int j = 2; j <= min; j++){
        for(int m = 0; m < arr.length; m++){
            if (arr[m]%j == 0)
                count++;
        }
        
        if (count == arr.length)
            gdc = j;
    }
    
     
    
    return gdc; 
    

  }
  // METHOD SIGNATURE ENDS
}