//
//
//James Mannherz
//CSE 002
//4/18/16
//lab 12
//Matricies
/*Purpose  For this lab, you will print out 
and operate on row- and column- major matrices 
represented by two dimensional arrays.

  */
import java.util.Random;
import java.util.Scanner;

class Matricies{
  public static void main(String[] args){
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Please Enter two integers and True or False: ");
    
    int a = myScanner.nextInt();
    int b = myScanner.nextInt();
    boolean c = myScanner.nextBoolean();
    
    increasingMatrix(a,b,c);
    
    
    
    
    
    
    
  }
  
  public static int[][] increasingMatrix(int width, int height, boolean format){
      Random x = new Random();
      int y = x.nextInt(5);
      int [][] array = new int [width][];  
      int j = 0;
      int b = 0;
      
      if(format == true){  //row-major
          for (int i = 0; i<width;i++){
             array[i] = new int [height];
            for (j= 0; j<height;j++){
              array[i][j] = y+b;
              b++;
            }
          }
          
          
          

      }
      else{
         for (int i = 0; i<width;i++){
             array[i] = new int [height];
            for ( j= 0; j<height;j++){
              array[j][i] = y+b;
              b++;
            }
          }
        
      }
  
   printMatrix(array,format,height);
   translate(array,height);
  
  return array;
      
  }
  
  
  public static void printMatrix( int[][] array, boolean format,int height){
    
    
    if(format == true){
    System.out.println("The array in row-major is: ");  
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(" "+array[i][j]);
          if((j+1)%height==0){
            System.out.println();
          }
        
      }
    }
    
 
  }
  else{
    System.out.println("The array in column-major is: ");  
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(" "+array[i][j]);
        if((j+1)%height==0){
            System.out.println();
          }
  }
    }
 }
  }





  
  public static int[][] translate(int[][] array,int b){
    int [][] transpose = new int [array.length][array[1].length];
    boolean format = true;
    int height = b;
  
    
    for(int i = 0; i<array.length;i++){
      for(int j = 0; j<array[i].length-1; j++){
        transpose[i][j]= array[j][i];
      }
    }
    printMatrix(transpose,format,height);
    return transpose;
  
    
    
    
  }
  
  public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
    
  int height1, height2, width1, width2;
  int [][] ab = a;
  int [][] ba = b;
  if(formata == true){
    height1 = a.length;
    width1 = a[0].length;
  }
  else{
    height1=a[0].length;
    width1=a.length;
    ab = translate(a,a[0].length);
  }
  
  if(formatb == true){
    height2 = b.length;
    width2 = b[0].length;
  }
  else{
    height2=b[0].length;
    width2=b.length;
    ba = translate(b,b[0].length);
  }
    
  if(height1 != height2 || width1 != width2){
    System.out.println("The arrays cannot be added");
    return null;
  }  
  
  int [][] array = new int [height1][width1];
  for(int i = 0; i< a.length; i++){
    for(int j =0; j< a[i].length;j++){
      array[i][j]=ab[i][j]+ba[i][j];
    }
  }
    
    
  printMatrix1(array);  
   return array; 
  }
  
  
  
  
 public static void printMatrix1( int[][] array){
   
   System.out.println("The added Matrix is: ");
   for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(" "+array[i][j]);
      }
            System.out.println();
          }
   
  
      }
  
 
  
  
  
}