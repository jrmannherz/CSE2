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

class factorials{

public static void main (String [] args){
             
    Scanner myScanner = new Scanner(System.in); //initialize scanner variable 
    System.out.print("Please enter an positive interger: ");
    int input = 0;
    input = myScanner.nextInt();
    factorial(input); 

    }//close main method       
    
     
    public int factorial(int input){
    int fact = 1;
    int c;
    for(c = 1; c <= input ; c++){
        fact = fact * c;
    }
    
    return fact;
    }//close factorial method 
    
        public int print(int input,int sum){
        
        }//close second method
    
    
         
}//close class
     