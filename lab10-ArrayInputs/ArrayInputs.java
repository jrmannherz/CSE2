//
//
//James Mannherz
//CSE 002
//4/5/16
//lab 010
//ArrayInputs
/*Purpose This lab session will get you familiar with declaring, 
allocating and initializing one-dimensional arrays.

  */


import java.util.Arrays;
import java.util.Scanner;

class ArrayInputs{ //open class
  public static void main(String[] args){ //call method
 
  int x = 0;
  System.out.println("Please Enter The Size You Would Like The Array To Be: ");
  Scanner myScan = new Scanner(System.in);
      x= myScan.nextInt();
      int[] first = new int[x];

        int y = 0;
        boolean valid = true;
        boolean green = false;
        int r = 0;
        String f = "";
  
            
            while(!green){
                if(valid){
            System.out.print("Please enter a positive integer: ");
          while(r < x){
                    if(myScan.hasNextInt()){ //check for integer
                      y = myScan.nextInt();
                                    if(y>=0){  //check for positive
                                        first[r]= y;
                                         r++;
                                         valid = false;
                                        }
                                    else{
                                        System.out.println("Incorrect Input");
                                        valid = true;                                    
                                    }//close else statement
                    }
                    else{
                         f=myScan.next();
                        System.out.println("Incorrect input");
                        valid = true;
                    }//close else statement
            }//close while loop
                }//close valid while loop
            
                            System.out.println("The array is");
                            int i=0;
                              while(i<x) { //counter for array
                                System.out.println(first[i]);
                                i++;
                                }//close while loop
                                green = true;


            }//close green while loop    

  }//Close Main Method
}//Close Class

