//
//James Mannherz
//CSE 002
//2/6/16
//homework 3
//Root
// The purpose is to prompt the user to enter a double and then prints out a crude estimate of the cube root of the number and the value of this crude guess when cubed.
//
//import scanner
import java.util.Scanner;
//
//define a class
    public class Root {
        
        //define a method
        public static void main (String [] args) {
            //Define scanner type
        Scanner myScanner;
        
        //assign myScanner
        myScanner = new Scanner( System.in );
        
        //prompt user for number
        System.out.print("Enter a double: ");
            //Define all variables 
            double nGuess = myScanner.nextDouble(); 
            double guess1;
            double guess2;
            double guess3;
            double guess4;
            double guess5;
            double guess6;
            double guess7;
            double cube1;
            //sample guess to get square root
            guess1 = nGuess/3;
            //each consequetive step increases accuracy
            guess2 = (guess1*guess1*guess1+nGuess)/(3*guess1*guess1);
            guess3 = (guess2*guess2*guess2+nGuess)/(3*guess2*guess2);
            guess4 = (guess3*guess3*guess3+nGuess)/(3*guess3*guess3);
            guess5 = (guess4*guess4*guess4+nGuess)/(3*guess4*guess4);
            guess6 = (2*guess5*guess5*guess5+nGuess)/(3*guess5*guess5);
            guess7 = (2*guess6*guess6*guess6+nGuess)/(3*guess6*guess6);
            cube1 = (guess7*guess7*guess7);
            //Print out the answers
            System.out.println("The cube root is " +guess7);
            System.out.println("The value of the cube is " +cube1);
            
        
        }//end the method
        
    }//end the class