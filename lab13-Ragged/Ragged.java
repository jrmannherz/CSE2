import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Ragged{
  public static void main(String[] args){
   int [][] array = new int [5][];
  Random x = new Random();
    
   
   
   for(int j = 0; j< array.length; j++){
     array[j]= new int [j*3+5];
   }
  
  
  
  for (int i = 0; i <array.length; i++){
      for (int k = 0; k < array[i].length; k++){
        int y = x.nextInt(40);
        array[i][k] = y; 
      }
  }
  
  
  System.out.print("row 1:"); 
  for (int m = 0; m < array[0].length; m++){
  System.out.print(" "+array[0][m]);}
  System.out.println();
  System.out.print("row 2:"); 
  for (int n = 0; n < array[1].length; n++){
  System.out.print(" "+array[1][n]);}
  System.out.println();
  System.out.print("row 3:"); 
  for (int o = 0; o < array[2].length; o++){
  System.out.print(" "+array[2][o]);}
  System.out.println();
  System.out.print("row 4:"); 
  for (int p = 0; p < array[3].length; p++){
  System.out.print(" "+array[3][p]);}
  System.out.println();
  System.out.print("row 5:"); 
  for (int q = 0; q < array[4].length; q++){
  System.out.print(" "+array[4][q]);}
  System.out.println();
  
  
  sort(array);
  
  
  }



public static int[][] sort(int [][] array){
  
  for(int j = 0; j < array.length; j++){
    
    
    for(int i = 0; i < array[j].length -1 ; i++){
        int currentMin = array[j][i];
        int currentMinIndex = i;    
        
        for(int k = i + 1; k < array[j].length; k++){
            if (currentMin > array[j][k]){
              currentMin = array[j][k];
              currentMinIndex = k;
            }
          
        }
      
      
      if(currentMinIndex != i){
        array[j][currentMinIndex] = array[j][i];
        array[j][i] = currentMin;
      }
    
    
    }
  }
  System.out.println();
  System.out.println("The Array Sorted is: ");
  
  System.out.print("row 1:"); 
  for (int m = 0; m < array[0].length; m++){
  System.out.print(" "+array[0][m]);}
  System.out.println();
  System.out.print("row 2:"); 
  for (int n = 0; n < array[1].length; n++){
  System.out.print(" "+array[1][n]);}
  System.out.println();
  System.out.print("row 3:"); 
  for (int o = 0; o < array[2].length; o++){
  System.out.print(" "+array[2][o]);}
  System.out.println();
  System.out.print("row 4:"); 
  for (int p = 0; p < array[3].length; p++){
  System.out.print(" "+array[3][p]);}
  System.out.println();
  System.out.print("row 5:"); 
  for (int q = 0; q < array[4].length; q++){
  System.out.print(" "+array[4][q]);}
  System.out.println();
  
  
  
  copy(array);
  return array;
}    
    
    
public static int [][] copy(int [][] array){

int [][] nuArray = new int [5][];  
  
  
for(int i = 0; i<array.length; i++){  

nuArray[i]= Arrays.copyOf(array[i], array[4].length); 

  
} 


  
  System.out.println();
  System.out.println("The Array copied is: ");  
   System.out.print("row 1:"); 
  for (int m = 0; m < nuArray[0].length; m++){
  System.out.print(" "+nuArray[0][m]);}
  System.out.println();
  System.out.print("row 2:"); 
  for (int n = 0; n < nuArray[1].length; n++){
  System.out.print(" "+nuArray[1][n]);}
  System.out.println();
  System.out.print("row 3:"); 
  for (int o = 0; o < nuArray[2].length; o++){
  System.out.print(" "+nuArray[2][o]);}
  System.out.println();
  System.out.print("row 4:"); 
  for (int p = 0; p < nuArray[3].length; p++){
  System.out.print(" "+nuArray[3][p]);}
  System.out.println();
  System.out.print("row 5:"); 
  for (int q = 0; q < nuArray[4].length; q++){
  System.out.print(" "+nuArray[4][q]);}
  System.out.println();
  
  
  return nuArray;
}    
    
    
    
    
    
    
    
    
    
    
  }
  
  
  
  





 