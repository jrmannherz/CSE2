//
//James Mannherz
//CSE 002
//2/6/16
//hw 04
//Which Number
/*Purpose: prompts the user to think of an int 
between 1 and 10 inclusive. Then the program proceeds 
to ask the user questions in an attempt to guess what 
number the user is thinking of.  */ 
//import scanner
import java.util.Scanner;
//
//define a class
    public class WhichNumber {
        
        //define a method
        public static void main (String [] args) {
        
            //prompt user to think of a number
            System.out.println ("Think of a number between 1 and 10 inclusive");
            
                //Define scanner type
                Scanner myScanner;
                //assign myScanner
                myScanner = new Scanner( System.in );
                    //First Guess
                    System.out.println("Is the number even?(Please enter y/Y or n/N): ");
                    
                        String a = myScanner.next(); // Read Input for keyboard
                        
                        if(a.equals ("y") || a.equals ("Y")){
                            System.out.println("Is it divisible by 3?: ");
                                a= myScanner.next(); // Read Input for keyboard
                                    if(a.equals ("y") || a.equals ("Y")){
                                        System.out.println("Your number is 6!");
                                    }    
                                    else if(a.equals ("n") || a.equals ("N")){
                                        System.out.println("Is it divisible by 4?: ");
                                        a= myScanner.next(); // Read Input for keyboard
                                            if(a.equals ("y") || a.equals ("Y")){
                                             System.out.println("Is the number divisible by 4 greater than 1?:");
                                             a= myScanner.next(); // Read Input for keyboard
                                                if(a.equals ("y") || a.equals ("Y")){
                                                System.out.println("Your number is 8!");
                                                }
                                                else if(a.equals ("n") || a.equals ("N")){
                                                System.out.println("Your number is 4!");
                                                }
                                                else{
                                                System.out.println("Incorrect Input Program Terminated");
                                                return; }     
                                                }
                                        
                                                        
                                                
                                            else if(a.equals ("n") || a.equals ("N")){
                                                    System.out.println("Is it divisible by 5?: ");
                                                     a= myScanner.next(); // Read Input for keyboard
                                                    if(a.equals ("y") || a.equals ("Y")){
                                                        System.out.println("Your number is 10!");
                                                        }
                                                    else if(a.equals ("n") || a.equals ("N")){
                                                        System.out.println("Your number is 2!");
                                                        }
                                                    else{
                                                        System.out.println("Incorrect Input Program Terminated");
                                                        return; }     
                                            }
                                            else{ System.out.println("Incorrect Input Program Terminated");
                                            return; }          
                                    }                    
                                                        
                                    else{
                                        System.out.println("Incorrect Input Program Terminated");
                                        return; }        
                                                        
                                                    
                                                    
                                    
                                             
                                             
                                 
                                
                            
                            
                        }
                        
                        else if(a.equals ("n") || a.equals ("N")){
                            System.out.println("Is it divisible by 3?: ");
                            a= myScanner.next(); // Read Input for keyboard
                            if(a.equals ("y") || a.equals ("Y")){
                                System.out.println("When divided by 3 is the result greater than 1?: ");
                                a= myScanner.next(); // Read Input for keyboard
                                    if(a.equals ("y") || a.equals ("Y")){
                                     System.out.println("Your Number is 9");
                                    }
                                    else if(a.equals ("n") || a.equals ("N")){
                                        System.out.println("Your Number is 3");
                                    }
                                    else{
                                        System.out.println("Incorrect Input Program Terminated");
                                    return;}
                            }
                            else if(a.equals ("n") || a.equals ("N")){
                                System.out.println("is it greater than 6?: ");
                                a= myScanner.next(); // Read Input for keyboard
                                    if (a.equals ("y") || a.equals ("Y")){
                                        System.out.println("Your number is 7!");
                                    }
                                    else if(a.equals ("n") || a.equals ("N")){
                                        System.out.println("Is it less than 3?: ");
                                        a= myScanner.next(); // Read Input for keyboard
                                        if (a.equals ("y") || a.equals ("Y")){
                                            System.out.println("Your number is 1!");}
                                        else if(a.equals ("n") || a.equals ("N")){
                                            System.out.println("Your number is 5!");}
                                        else { System.out.println("Incorrect Input Program Terminated");
                                        return;}   
                                            
                                    }
                            
                                    else {System.out.println("Incorrect Input Program Terminated");
                                         return;}  
                                         
                            }
                            else{System.out.println("Incorrect Input Program Terminated");
                                        return;}
                        }
                                        
                                    
                            
                        
                        
                        else{
                            System.out.println("Incorrect Input Program Terminated");
                            return;
                        }
        }//close class
    }//close method
                    
                    
                    