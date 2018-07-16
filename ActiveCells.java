// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Colony
{
  //METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int[] cellCompete(int[] cells, int days)
  {
    // INSERT YOUR CODE HERE
    int[] tempCells = new int[cells.length];
    
    
    for (int i = 0; i < days; i++) {
        for (int j = 1; j < cells.length-1; j++) {
            if (cells[j-1] == 0 && cells[j+1]==0 || cells[j-1] == 1 && cells[j+1]==1)
                tempCells[j] = 0;
            else 
                tempCells[j] = 1;
        }
        
        // check the edges
        if (cells[1] == 0)
            tempCells[0] = 0;
        else 
            tempCells[0] = 1;
            
        if (cells[cells.length-2] == 0) 
            tempCells[cells.length-1] = 0;
        else 
            tempCells[cells.length-1] = 1;
        //copy content of array tempCells to cells 
        
        for (int m = 0; m < cells.length; m++)  
            cells[m] = tempCells[m];
            
            
            
    }
    
    
    return tempCells;

  }
  // METHOD SIGNATURE ENDS
}