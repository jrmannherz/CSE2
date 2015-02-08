//
//James Mannherz
//CSE 002
//2/6/16
//homework 3
//Bicycle
//Purpose write a program that prompts user for two digits and then prints out avg mph, distance traveled.
//Known facts to refer to D=27 inches
//import scanner
import java.util.Scanner;
//
//define a class
    public class Bicycle {
        
        //define a method
        public static void main (String [] args) {
            
        //Define scanner type
        Scanner myScanner;
        
        //assign myScanner
        myScanner = new Scanner( System.in );
        
            //prompt user for number of counts on the cyclometer
            System.out.print ("Enter the number of counts: ");
            //accept user input as 
                int nCounts = myScanner.nextInt();
            //prompt user for number of seconds when the counts occured
            System.out.print ("Enter the number of seconds: ");
                int nSeconds = myScanner.nextInt();
                
                //defining variables
                int Diameter = 27;
                double distanceTraveled;
                double average;
                double time;
                //computations
                distanceTraveled = (((nCounts*Diameter*3.1415)/12)/5280);
                time = (nSeconds)/60;
                average = distanceTraveled /(time/60);
               
//print out results
System.out.printf("The distance traveled was %.2f miles and it took %.2f\n minutes", distanceTraveled,time);
System.out.println(" ");
System.out.printf("The average mph was %.2f ", average);
                
        } // end of method
    } //end of method