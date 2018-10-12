/*

 */
package sudokubacktracking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBacktracking 
{

    static int sudokuGrid [][] = new int[9][9];
  
    public static void main(String[] args) throws FileNotFoundException {
       readGrid();
       printGrid();
       
    }

    public static void readGrid() throws FileNotFoundException{
        
        File f = new File ("inputgrid.txt");
        Scanner sc= new Scanner (f);
        
        int rowCount =0;
        String [] row;
        while(sc.hasNextLine())
        {
            
            row = sc.nextLine().trim().split("\\s+");

            for (int i = 0; i < row.length-1; i++) 
            {
                sudokuGrid[rowCount][i] = Integer.parseInt(row[i]);
            }
          rowCount++;
        }
        
    }
    
    public static void printGrid(){
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(sudokuGrid[i][j]);
            }
            System.out.println("");
        }
    }
        
    
}
