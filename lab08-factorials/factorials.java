//
//
//James Mannherz
//CSE 002
//3/20/16
//lab 08
//factorials
/*Purpose Below is a Java class whose main program calls 
three different methods. Under the class is a comment that 
shows the expected output when the program is run. 
Provide the code for the three methods.
  */

import java.util.Scanner;

public class factorials{

public static void main (String [] args){
             
    Scanner myScanner = new Scanner(System.in); //initialize scanner variable 
    System.out.print("Please enter an positive interger: ");
    int input = 0;
    input = myScanner.nextInt();
    int sum = 0;
    int x = 0;
    for(x=1; x <= input; x++){
    sum += factorial(x);}
    
    print(sum);
    

    }//close main method       
    
    
     
    public static int factorial(int input){
    int fact = 1;
    int c;
    for(c = 1; c <= input ; c++){
        fact = fact * c;
    }
    
   
    return fact;
    }//close factorial method 
    
        public static void print(int sum){
            
            System.out.println("The super factorial is equal to "+sum);
        
        }//close second method
    
    
         
}//close class
     