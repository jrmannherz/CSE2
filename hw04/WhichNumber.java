//
//James Mannherz
//CSE 002
//2/6/16
//Lab 04
//Cookies
/*Purpose Write a program that uses the Scanner class 
to obtain from users how many cookies they want, 
how many people they are buying for, 
and at least how many cookies they want each person 
to get */ 
//import scanner
import java.util.Scanner;
//
//define a class
    public class WhichNumber {
        
        //define a method
        public static void main (String [] args) {
            
        //Define scanner type
        Scanner myScanner;
        
        //assign myScanner
        myScanner = new Scanner( System.in );
        
            //prompt user for number of people
            System.out.print ("Enter the number of People: ");
            //accept user input as 
                if (myScanner.hasNextInt()){
                //define variable for my scanner input
                int nPeople = myScanner.nextInt();
                    //check if int is greater than 0
                    if (nPeople>0){
                    
                        //prompt user for number of cookies
                        System.out.print ("Enter the number of Cookies you are making: ");
                        if (myScanner.hasNextInt()){
                                //define variable for cookies made
                                int nCookies = myScanner.nextInt();
                                    if(nCookies>0) {
                                        //prompt user for number of cookies per person
                                         System.out.print ("Enter the number of Cookies you want each person to have: ");
                                                //define variable for cookies made
                                                int nCookiesperPerson = myScanner.nextInt();
                                                    if(nCookiesperPerson>=0){
                                                        if(nCookies % nPeople == 0){
                                                            System.out.println("You have enough cookies for each person and they will get an even amount");
                                                            
                    
                                                            
                                                        }//end if statement for cookies evenly distrubuted
                                                        else{
                                                            System.out.println("You have enough cookies, but they will not divide evenly");
                                                            return; //leave program
                                                        }//end else statement for even distribution
                                                        
                                                    
                                                    }//end if statement cookies per person
                                                    else{//if the user entered an int that is not greater than zero
                                                    System.out.println("You entered a negative amount of cookies");
                                                    return; //leave program
                                                        
                                                    }//end else statement for number of cookies
                                        
                                            
                                        
                                        
                                    }//close cookies made if statement
                                    else{
                                        //if the user entered an int that is not greater than zero
                                        System.out.println("You entered a negative amount of cookies");
                                        return; //leave program
                                    }//close else statement
                    
                        }//close if statement for cookies made
                        else {
                            //if user did not enter a int
                            System.out.println("You did not enter an int");
                             return; //leave program
                            }// close else statement for cookies made
                        
                        
               
                
                
                
                
                    }                
                    else{ 
                    //if the user entered an int that is not greater than zero
                    System.out.println("You entered a incorrect amount of people");
                    return; //leave program
                    }//close else statement
                    
                } //Close If Statement for non int
                else{ 
                    //if user did not enter a int
                    System.out.println("You did not enter an int");
                    return; //leave program
                }// close else statement for non int
                
                    
                
                
        } // end of method
    } //end of method
    