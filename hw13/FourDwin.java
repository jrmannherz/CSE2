//
//
//James Mannherz
//CSE 002
//4/19/16
//hw 13
//FourDwin
/*Purpose This homework gives you practice in manipulating 
multidimensional arrays, in writing methods that have array 
parameters, and in searching and sorting arrays.

  */
import java.util.Random;
import java.util.Scanner;

public class FourDwin{
  
  public static void main (String [] args){
    boolean valid = false;
    boolean green = false;
    boolean red = false;
    Scanner myScanner = new Scanner(System.in);
    int a = 0;
    int w = 0;
    int x = 0;
    
  while(!red){  
  
    while(!valid){
        System.out.println("Please enter the lower boundary of the size of any given subarray in the matrix: ");
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
        System.out.println("Please enter the upper boundary of the size of any given subarray in the matrix:");
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
    
    if(w < x){
      red = true;
    }
    
    else {
        System.out.println("Uncompatible Integers");
        
        valid = false;
        green = false;
    }
    
    
    
  }//close while loop for 2 integer check
  
  
  
   
   double [][][][] array;
   array = new double [3][x][x][(int)getrandom(w,x)];
   
  for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            for(int k = 0; k < array[i][j].length; k++){
                  for(int g = 0; g < array[i][j][k].length; g++){
                      array[i][j][k][g] = (Math.random()*30);                      
                      
                      
                      }  
              } 
        }
    
    
    
  }
    
  int tree = 0;
  printArray(array,tree);
  sort4DArray(array);
  stat(array);

    
    
    
    
  /*

	Prints out the initial array, the sorted array, and its statistics.*/
  
    
  }
  
  public static void stat(double [][][][] array){
      int count = 0;     
      
      for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            for(int k = 0; k < array[i][j].length; k++){
                  for(int g = 0; g < array[i][j][k].length; g++){
                      count++;
                  }
            }
            
        }
        
     }
     
     System.out.println("The number of elements is: "+count);
    
    
    
     double sum = 0;
     double temp = 0;
     for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            for(int k = 0; k < array[i][j].length; k++){
                  for(int g = 0; g < array[i][j][k].length; g++){
                      temp = array[i][j][k][g];
                      sum = temp + sum;
                      
                  }
            }
            
        }
        
     }
     System.out.printf("The sum of elements is: %2.1f\n", sum);
     
     System.out.printf("The mean of elements is: %2.3f\n", (sum/count));
     
     
     
     
     
     
     
     
     
     
  }
  
  public static double [][][][] sort4DArray(double [][][][] array){
    
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            for(int k = 1; k < array[i][j].length; k++){
                  double currentElement[] = array[i][j][k];
                  int r;
                  for(r= k-1;r>=0 && array[i][j][r].length > currentElement.length; r-- ){
                    array[i][j][r+1] = array[i][j][r];
                  }
                  array[i][j][r+1] = currentElement;
                 
            }  
        }
    }
    
    
    
    
    
    /*that sorts the array from its smallest to largest 3D arrays.
The 4D array should be sorted using insertion sort.
The size of the 3D arrays is given by how many elements are in each 3D array.
If two 3D arrays have the same size, rank based on lowest value in 3D array. */
    
    
    sort3DArray(array);
    return array;
  }
  
  public static double [][][][] sort3DArray(double [][][][] array){
   double lowOfZero = array[0][0][0][0];;
   double lowOfOne = array[1][0][0][0];;
   double lowOfTwo = array[2][0][0][0];;
  
      for (int j = 0; j < array[0].length; j++){
        for(int k = 0; k < array[0][j].length; k++){
          for(int l = 0; l < array[0][j][k].length; l++){
              if(lowOfZero > array[0][j][k][l]){
                  lowOfZero = array[0][j][k][l];                 
              }
            
          }
        }
      }
       for (int j = 0; j < array[1].length; j++){
        for(int k = 0; k < array[1][j].length; k++){
          for(int l = 0; l < array[1][j][k].length; l++){
              if(lowOfOne > array[1][j][k][l]){
                  lowOfOne = array[1][j][k][l];                 
              }
            
          }
        }
      }
      for (int j = 0; j < array[2].length; j++){
        for(int k = 0; k < array[2][j].length; k++){
          for(int l = 0; l < array[2][j][k].length; l++){
              if(lowOfTwo > array[2][j][k][l]){
                  lowOfTwo = array[2][j][k][l];                 
              }
            
          }
        }
      }
   
   
   double [] lows = {lowOfZero, lowOfOne , lowOfTwo};
   
   
   
   for (int i = 0; i < lows.length-1; i++){
     
              double currentMin = lowOfZero;
              int currentMinIndex = i;
              double [][][] temp = array[i];
              
                 for(int j = i + 1; j <lows.length; j++ ){  
                   if(currentMin > lows[j]){
                     currentMin = lows[j];
                     currentMinIndex = j;
                     temp = array[j];
                   }
                 }
                if(currentMinIndex != i){
                  lows[currentMinIndex] = lows[i];
                  lows[i]= currentMin;
                  
                  array[currentMinIndex] = array[i];
                  array[i]= temp;
                } 
              
              
            
   }
   int x = 1;
   
   printArray(array,x);
    return array;
  }
  
  public static void printArray(double [][][][] array, int x){
  //prints the array out in nested parenthetical format.
  if(x == 1){
    System.out.println("The sorted array is: ");
  }
  
  for (int i = 0; i < array.length; i++){
    System.out.print("{");
      for(int j = 0; j < array[i].length; j++ ){
        System.out.print("{");
          for(int k = 0; k < array[i][j].length; k++){
            System.out.print("{");
              for(int l = 0;l< array[i][j][k].length; l++){
                System.out.printf(" %2.1f"+",",array[i][j][k][l]);
              }
              System.out.print("}");
          }
          System.out.print("}");
      }
    
    System.out.print("}");
  }
  
  System.out.println();
  
  
  
  
  
  
    
  }

  public static double getrandom(int w, int x){
  double z = 0;
   z = Math.random()*(x-w) + w;
  
  return  z;

}


}