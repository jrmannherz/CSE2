//
//
//James Mannherz
//CSE 002
//2/14/16
//hw 05
//Get Integers
/*Purpose Ask the user for 5 non-negative integers 
(if an invalid value is entered, then ask again, using 
a loop), and print out the sum of the 5 integers. */ 
import java.util.Scanner;
//import scanner

public class GetIntegers{
    public static void main(String [] args){
         int a = 0,b = 0,c = 0,d = 0,e = 0;
         String t;
        boolean valid = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a five non negative Integers: ");
        while(!valid){
        if(myScanner.hasNextInt()){
        valid = true;  }// end of if statement
        else{ 
            t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
        }//end else statement
        }//end else statement
        while(valid==true){
        a = myScanner.nextInt();
        if(a>0){
        break;
        }//end of if statement
        else{System.out.println("Incorrect Input, try again!");
        continue;
        }//end of else statement
        }//end of while loop
        valid = false;
       while(!valid){
        if(myScanner.hasNextInt()){
        valid = true;  }// end of if statement
        else{ t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
        }//end else statement
        }//end else statement
        while(valid==true){
        b = myScanner.nextInt();
        if(b>0){
        break;
        }//end of if statement
        else{System.out.println("Incorrect Input, try again!");
        continue;
        }//end of else statement
        }//end of while loop
        valid = false;
        while(!valid){
        if(myScanner.hasNextInt()){
        valid = true;  }// end of if statement
        else{ t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
        }//end else statement
        }//end else statement
        while(valid==true){
        c = myScanner.nextInt();
        if(c>0){
        break;
        }//end of if statement
        else{System.out.println("Incorrect Input, try again!");
        continue;
        }//end of else statement
        }//end of while loop
        valid = false;
        while(!valid){
        if(myScanner.hasNextInt()){
        valid = true;  }// end of if statement
        else{ t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
        }//end else statement
        }//end else statement
        while(valid==true){
        d = myScanner.nextInt();
        if(d>0){
        break;
        }//end of if statement
        else{System.out.println("Incorrect Input, try again!");
        continue;
        }//end of else statement
        }//end of while loop
        valid = false;
        while(!valid){
        if(myScanner.hasNextInt()){
        valid = true;  }// end of if statement
        else{ t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
        }//end else statement
        }//end else statement
        while(valid==true){
        e = myScanner.nextInt();
        if(e>0){
        break;
        }//end of if statement
        else{System.out.println("Incorrect Input, try again!");
        continue;
        }//end of else statement
        }//end of while loop
        
        
        System.out.println("The sum is: "+(a+b+c+d+e));
    }//close main method
}//close class