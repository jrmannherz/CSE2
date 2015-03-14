//
//
//James Mannherz
//CSE 002
//3/14/16
//lab 07
//ZigZag
/*Purpose program that forces the user to enter an integer between 1 and 30,
inclusive, and then prints out displays that depend on the value entered 
and look like the following:
  */

import java.util.Scanner;

public class zigzag {
    public static void main (String[] args){
     
      Scanner myScanner = new Scanner(System.in); //initialize scanner variable 
        int a = 0; //initialize variable a
        int b = 0; //initialize variable b
        int x = 1;//initialize variable x
        int T = 0; //initialize throw away variable
        int nStars=0;
        String t;//initialize throw away variable t
        boolean valid = false;//initialize boolean valid
        
        
        System.out.print("Please enter a number between 3 and 33: ");//prompt user for number
        while(!valid){
        if(myScanner.hasNextInt()){
            T = myScanner.nextInt();
            if(T < 33  && T > 3){
                valid = true;  
                nStars = T;    
            }// end of if statement
            else{
               b = T;
                System.out.println("Incorrect input, try again:");
            }//end else statement
        }//close if statement
        else{
            t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
            }//end else statement
        }//close while loop
     
     
     int l = 0;
     int d = 1;    
     String temp = "*";
     String tempted = "*";
     
        
        for(l=1; l < nStars; l++){
            System.out.print(temp);
        }
        for(d=1;d < nStars;d++){
            System.out.println(tempted);
            tempted = " " + tempted; 
            }
      for(l=0; l < nStars; l++){
            System.out.print(temp);
        }
     
     
 
        
        
        
    }//Close Main Method
}//Close Class
     