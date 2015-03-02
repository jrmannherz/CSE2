//James Mannherz
//CSE 002
//2/14/16
//hw 06
//Make Symbol
/*Purpose you need to use do-while loops and the 
random number generator to generate an integer 
between 0 and 100. You will first need to print out 
the number. If the number is even, you will then 
print out that number of “*” characters; if the 
number is odd, then you will print out that 
number of “&” characters.   
Save your code in MakeSymbols.java
 */ 
import java.lang.Math;
//import random generator

public class MakeSymbols {
    public static void main(String[] args){
        
        int x = 0;
        int c = 1;
        x= (int) (Math.random()*99+1); 
        
        if(x%2 == 0){
        do {
            System.out.println("Random Number Generated is:"+x);
            for(c=1;c<=x;c++){
            System.out.print("*");
            }
            
        }while(c <= x);}
        
        else{
        do {
            System.out.println("Random Number Generated is:"+x);
            for(c=1;c<=x;c++){
            System.out.print("&");
            }
            
        }while(c <= x);}
        
        
        
    }//close method
}//close class