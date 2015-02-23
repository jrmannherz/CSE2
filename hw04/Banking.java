//
//James Mannherz
//CSE 002
//2/14/16
//hw 04
//Banking
/*Purpose Write a program using switch statements 
that allows users to process banking transactions. */ 
//import scanner
import java.util.Scanner;
import java.lang.Math;
//
//define a class
    public class Banking {
        
        //define a method
        public static void main (String [] args) {
                //initial Starting amount in Bank Account        
            int iAccount = (int) (Math.random() *(5000-1000))+ 1000;
            
                //Define scanner type
                Scanner myScanner;
        
                //assign myScanner
                myScanner = new Scanner( System.in );
                
                System.out.println("Would You like to deposit money, withdraw money, or view your balance?(Please enter 1 for deposit, 2 for withdraw, and 3 for view: ");
                
                
            if(myScanner.hasNextInt()){
                
                int b = myScanner.nextInt(); // Read Input for keyboard
            
                if(b == 1 || b == 2 || b == 3){ 
                
                switch (b) {
                    case 1:
                        System.out.println("How much would you like to deposit?: ");
                        
                        b = myScanner.nextInt(); // Read Input for keyboard
                        if (b>=0){
                            int balance = b + iAccount;
                            
                            System.out.println("Your balance is now $" +balance);
                        }
                        else {
                            System.out.println("You cannot deposit a negative amount");
                        }
                        
                        
                        break;
                    case 2:
                        System.out.println("How much would you like to withdraw?: ");
                        
                        b = myScanner.nextInt(); // Read Input for keyboard
                    
                        if (b > iAccount || b < 0){
                            System.out.println("You cannot withdraw that amount.");
                        }
                        else if(b <= iAccount && b >= 0){
                            int c = iAccount - b;
                            
                            System.out.println("Your remaining balance is $" +c);
                        }
                        
                        break;
                        
                    case 3:
                        System.out.println("Your balance is $" +iAccount);
                        break;
                        }// close switch  
                }        
                else{ System.out.println("You did not enter an acceptible value.");
                }
            }
            else{ System.out.println("Please enter an integer");}
            
            
            System.out.println("The decimal numbers are R:"+u+v+", G:"+w+x+", B:"+y+z);
                
                            
                        }//close class
                
                }//close method
        
           