//
//
//James Mannherz
//CSE 002
//2/14/16
//hw 06
//Run Factorial
/*Purpose write yourself a calculator program 
using a while-loop. */ 
import java.util.Scanner;
//import scanner

public class RunFactorial{
    public static void main (String [] args){
        int x = 0,fact=1,c=1;
        String t;
        boolean valid = false;
        boolean feed = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a integer between 9 and 16: ");
        while(!valid){
            if(myScanner.hasNextInt()){
            x = myScanner.nextInt();
                if(x>8 && x<17){
                 valid = true;
                 System.out.println("Input Accepted:");
             }//close if statement
             else {System.out.println("Invalid input, enter again!");
                     x = myScanner.nextInt();
                     if(x>8 && x<17){
                 valid = true;
                         System.out.println("Input Accepted:");
                     }//close if statement
             }//close else statement
            }//close if statement
            else{ t = myScanner.next();
            valid = false;
            System.out.println("Invalid input, enter again!");}//close else statement
        }//close while loop
        
    

                   for(c = 1; c <= x ;c++){
            fact = fact * c;
        }//close for loop
            System.out.println(x+"!="+fact);
                 
             }//close while loop
         }//close while loop
  
       
        
        
