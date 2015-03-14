//
//
//James Mannherz
//CSE 002
//3/14/16
//hw 07
//Waves
/*Purpose program that forces the user to enter an integer between 1 and 30,
inclusive, and then prints out displays that depend on the value entered 
and look like the following:
  */

import java.util.Scanner;

public class Waves {
    public static void main (String[] args){
        
        Scanner myScanner = new Scanner(System.in); //initialize scanner variable 
        int a = 0; //initialize variable a
        int b = 0; //initialize variable b
        int x = 1;//initialize variable x
        int T = 0; //initialize throw away variable
        String t;//initialize throw away variable t
        boolean valid = false;//initialize boolean valid
        
        
        System.out.print("Please enter a number between 1 and 30: ");//prompt user for number
        while(!valid){
        if(myScanner.hasNextInt()){
            T = myScanner.nextInt();
            if(T < 30  && T > 1){
                valid = true;  
                a = T;    
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
      
       
        
        int c; //initialize variable c
        String temp = "";//initiate temp string
        for(x=0;x<a;x++){
            for(c=0;c<=x;c++){
                
            }//close for loop
        }//close for loop
        
       
      
        
        
        
    }//Close Main Method
}//Close Class
     