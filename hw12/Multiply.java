//
//
//James Mannherz
//CSE 002
//4/19/16
//hw 12
//Multiply
/*Purpose This homework gives you practice in 
manipulating multidimensional arrays, and in writing methods 
that have array parameters.

  */
import java.util.Random;
import java.util.Scanner;

public class Multiply{
  public static void main(String[] args){
  
    
    Scanner myScanner = new Scanner(System.in);
    boolean valid = false;
    boolean green = false;
    boolean yellow = false;
    boolean blue = false;
    boolean red = false;
    
    int w = 0,x = 0, y= 0, z = 0;
    int a = 0;
    
    
    while(!red){
    
    while(!valid){
        System.out.println("Please enter the width of the first matrix: ");
            if(myScanner.hasNextInt()){
                a = myScanner.nextInt();
                    if (a > 0){
                        w = a;
                    valid = true;
                    }
                    else{ System.out.println("Please enter only positive integers");
                        
                    }     
                    
            }
            else { String l = myScanner.next();
                System.out.println("Please enter integers");
                
            }
    }
    
    while(!green){
        System.out.println("Please enter the height of the first matrix: ");
            if(myScanner.hasNextInt()){
                a = myScanner.nextInt();
                    if (a > 0){
                        x = a;
                    green = true;
                    }
                    else{ System.out.println("Please enter only positive integers");
                        
                    }     
                    
            }
            else { String l = myScanner.next();
                System.out.println("Please enter integers");
                
            }
    }
     while(!yellow){
        System.out.println("Please enter the width of the second matrix: ");
            if(myScanner.hasNextInt()){
                a = myScanner.nextInt();
                    if (a > 0){
                        y = a;
                    yellow = true;
                    }
                    else{ System.out.println("Please enter only positive integers");
                        
                    }     
                    
            }
            else { String l = myScanner.next();
                System.out.println("Please enter integers");
                
            }
    }
    
    while(!blue){
        System.out.println("Please enter the height of the second matrix: ");
            if(myScanner.hasNextInt()){
                a = myScanner.nextInt();
                    if (a > 0){
                        z = a;
                    blue = true;
                    }
                    else{ System.out.println("Please enter only positive integers");
                        
                    }     
                    
            }
            else { String l = myScanner.next();
                System.out.println("Please enter integers");
                
            }
    }
            
    
    
    
    if(x == y){
    red = true; 
    }
    else {
        System.out.println("Uncompatible Matricies:");
        
        yellow = false;
        green = false;
    }
    
    
    }    
        randomMatrix(w,x,y,z);
        
        
        
  }
  
  
    
    
public static int[][] randomMatrix(int width, int height, int widthOne, int heightOne ){
     Random x = new Random();
     int [][] array = new int [width][];  
      int j = 0;
      
          for (int i = 0; i<width;i++){
             array[i] = new int [height];
            for (j= 0; j<height;j++){
                 int z = x.nextInt(2);
                if(z== 1){
            int y = x.nextInt(11);
              array[i][j] = y;
            }
            else{
                int w = -(x.nextInt(11));
                array[i][j]= w;
            }
          }
          }
          int [][] matrix = new int [widthOne][];
            for (int s = 0; s<widthOne;s++){
             matrix[s] = new int [heightOne];
            for (j= 0; j<heightOne;j++){
                 int z = x.nextInt(2);
                if(z== 1){
            int y = x.nextInt(11);
              matrix[s][j] = y;
            }
            else{
                int w = -(x.nextInt(11));
                matrix[s][j]= w;
            }
          }
          }
          
          
          
          
        printMatrix(array);
        printMatrix(matrix);
        matrixMultiply(array,matrix);
        return array;
    
}    



public static void printMatrix( int [][] array){
    
    System.out.println("The Array is");
    for(int i = 0; i < array.length; i++ ){
        for(int j = 0; j< array[0].length; j++){
            System.out.print(" "+array[i][j]);
        }
        System.out.println();
    }
    
}


public static int [][] matrixMultiply(int[][] array, int [][] matrix){
    int [][] multiple = new int [array.length][matrix[0].length];
    
    if (array[0].length == matrix.length){
    
    for(int i = 0; i < array.length; i++ ){
        for(int j = 0; j <multiple[0].length; j++){
            for (int k = 0; k < multiple.length; k++){
                multiple[i][j] += array[i][k] * matrix[k][j];
            }
        }
    }
    
    
 printMatrix(multiple);
  return multiple;
    
 
}  
else{
    return null;
    
}
}
    
    
    
}