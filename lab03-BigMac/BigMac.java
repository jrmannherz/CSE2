//
//
//James Mannherz
//CSE 002
// 2/6/15
// Lab03 Big Mac
//Purpose: To get get input from the user and use that data to perform basic computations
//
//
//import scanner
import java.util.Scanner;
//
//define a class
    public class BigMac {
        
        //define a method
        public static void main (String [] args) {
            //define scanner type
            Scanner myScanner;
            
            //assign scanner variable
            myScanner = new Scanner( System.in );
            
            // promt user for number of big macs
            System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
            
                //accept user input as 
                int nBigMacs = myScanner.nextInt();
                
                    //prompt user for cost and sales tax 
                    System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx):");
                    double bigMac$ = myScanner.nextDouble();
	                System.out.print(
                    "Enter the percent tax as a whole number (xx): ");
                    double taxRate = myScanner.nextDouble();
                    taxRate/=100; //user enters percent, but I want
                     //proportion
                     
                     double cost$;
                     int dollars,   //whole dollar amount of cost 
                     dimes, pennies; //for storing digits
                     //to the right of the decimal point 
                     //for the cost$ 
                     cost$ = nBigMacs*bigMac$*(1+taxRate);
                     //get the whole amount, dropping decimal fraction
                     dollars=(int)cost$;
                     //get dimes amount, e.g., 
                    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                    //  where the % (mod) operator returns the remainder
                    //  after the division:   583%100 -> 83, 27%5 -> 2 
                    dimes=(int)(cost$*10)%10;
                    pennies=(int)(cost$*100)%10;
                    System.out.println("The total cost of " +nBigMacs+ "BigMacs, at $"+bigMac$+" per bigMac, with a sales tax of "+(int)(taxRate*100) + "%, is $" +dollars+'.'+dimes+pennies);
                    
                        
                        
                     



            
        }//close method
        
    }//close class