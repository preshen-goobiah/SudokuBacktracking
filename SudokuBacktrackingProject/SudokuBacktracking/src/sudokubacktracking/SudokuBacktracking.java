/*

 */
package sudokubacktracking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**

 */
public class SudokuBacktracking 
{

    int sudokuGrid [][] = new int[9][9];
  
    public static void main(String[] args) {
       
    }

    public void readGrid() throws FileNotFoundException{
        
        File f = new File ("inputfile.txt");
        Scanner sc= new Scanner (f);
        
        int rowCount =0;
        String [] row = null;
        while(sc.hasNext())
        {
            row = sc.next().split(" ");
            
            for (int i = 0; i < row.length; i++) 
            {
                sudokuGrid[rowCount][i] = Integer.parseInt(row[i]);
            }
          rowCount++;
        }
        
    }
        
    
}
