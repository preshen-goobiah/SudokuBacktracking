/*

 */
package sudokubacktracking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class SudokuBacktracking 
{

    static int sudokuGrid [][] = new int[9][9];
  
    public static void main(String[] args) throws FileNotFoundException {
       readGrid();
      
       System.out.println(checkRowsCols(0,7,2));
       
    }

    public static void readGrid() throws FileNotFoundException{
        
        File f = new File ("inputgrid.txt");
        Scanner sc= new Scanner (f);
        
        int rowCount =0;
        String [] row;
        while(sc.hasNextLine())
        {
            
            row = sc.nextLine().trim().split("\\s+");
         

            for (int i = 0; i < row.length; i++) 
            {
                sudokuGrid[rowCount][i] = Integer.parseInt(row[i]);
            }
          rowCount++;
        }
        
    }
    
    public static void printGrid(){
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudokuGrid[i][j]);
            }
            System.out.println("");
        }
    }
       
    
    /* Method to check if potential value exists in subgrid */
    public static boolean checkSubgrid(int row, int col, int value )
    {
       int subgridCol = col/3; // 2
       int subgridRow = row/3; // 1
       
       for(int i = 0; i < 3; i++)
       {
           for(int j=0; j <3; j++)
           {
              
                 if(sudokuGrid[(subgridRow*3) +i][(subgridCol*3)+j] == value)
                       {
                           return false;
                       }
            }   
       }
      
        return true;
    }
    
    
    
    /* Method to check if potential value exists in row or column of entire grid */ 
    public static boolean checkRowsCols(int row, int col, int value)
    {
        for(int i =0; i < 9; i++)
        {
            if(sudokuGrid[row][i] == value)
            {
                return false;
            }
            if(sudokuGrid[i][col] == value)
            {
                return false; 
            }
        }
        
        
        return true;
    }
}
