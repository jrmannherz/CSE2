//
//James Mannherz
//CSE 002
//2/6/16
//homework 3
//Four Digits
//Purpose: prompt the user to enter a double and  then prints out the first four digits to the right of the decimal point.
//
//
//import scanner
import java.util.Scanner;
//
    //define a class
    public class FourDigits {
        
        //define a method
        public static void main (String [] args) {
        
            //Define scanner type
            Scanner myScanner;
        
                //assign myScanner
                myScanner = new Scanner( System.in );
                
                    //prompt user for number
                    System.out.print("Enter a double: ");
                    //Define Variables            
                    double nInput = myScanner.nextDouble();
                    double nConvert;
                    int convert1;
                    int convert2;
                    int result;
                  
                    //Computations
                    
                    convert1 = (int) nInput;//convert original entry to int to truncate
                    convert2 = (int) (nInput*10000);//Multiple input by 10000, then convert to int to get rid of any decimal points
                    result = convert2 - (convert1*10000);//Subtract two ints to get four digits
                  
                    //Print the 4 digits with leading zeros
                    System.out.format("The four digits are %04d%n", result);
    
                    
        }//end method
    }//end class
                
                    
                    