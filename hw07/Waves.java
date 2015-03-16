//
//
//James Mannherz
//CSE 002
//3/14/16
//hw 07
//Waves
/*Purpose program that forces the user to enter an integer between 1 and 30,
inclusive, and then prints out displays that depend on the value entered 
and look like the following:
  */

import java.util.Scanner;

public class Waves {
    public static void main (String[] args){
        
        Scanner myScanner = new Scanner(System.in); //initialize scanner variable 
        int a = 0;//initialize variable a
        int b = 0;//initialize variable b
        int x = 1;//initialize variable x
        int d = 0;//initialize variable d
        int c = 0;//initialize variable c
        int T = 0;//initialize throw away variable
        String f = "";//initialize string f
        String t;//initialize throw away variable t
        boolean valid = false;//initialize boolean valid
        
        
        System.out.print("Please enter a number between 1 and 30: ");//prompt user for number
         while(!valid){
            if(myScanner.hasNextInt()){
            T = myScanner.nextInt();
                if(T < 30  && T > 1){
                    valid = true;  
                    a = T;    
                }// end of if statement
                else{
                    b = T;
                    System.out.println("Incorrect input, try again:");
                    }//end else statement
            }//close if statement
            else{
            t = myScanner.next();
            valid = false;
            System.out.println("Incorrect input, try again:");
            }//end else statement
            }//close while loop
            
        System.out.println("For Loop");
                   for(x=1; x<=a;x++){
                        if(x%2==0){
                            for (c = 1; c <= x; c++){        
                                for(d = 1; d <= c; d ++)
                                System.out.print (x + " ");
                                System.out.println();
                            }//close for loop
                        }//close if statement
                        else{
                            for(c=1; c<= x;c++){
                                for(d=1;d<=(x+1)-c; d++)
                                System.out.print(x +" ");
                                System.out.println();
                            }//close for loop
                        }//close else statement
                   }//close the big for loop 
                   
                   
        System.out.println("While Loop");
                    x=1;
                    while(x<=a){
                        c=1;
                            while(c<=x){
                                d=1;
                                if(x%2==0){
                                    while(d<=c){
                                        System.out.print(x+" ");
                                        d++;
                                    }//close d while loop
                                }
                                else{
                                    while(d<=(x+1-c)){
                                        System.out.print(x+" ");
                                        d++;
                                    }
                                }                        
                        
                        
                        c++;            
                            System.out.println();
                            }//close c while loop
                    x++;    
                    }//close x while loop
                   
                   
            System.out.println("Do Loop");
            x=1;
            do{
                c=1;
                    do{
                        d=1;
                            if(x%2==0){
                                do{
                                    System.out.print(x+" ");
                                    d++;
                                }while(d<=c);
                            }
                            else{
                                do{
                                    System.out.print(x+" ");
                                    d++;
                                }while(d<=(x+1-c));
                                
                                
                            }
                            System.out.println();
                    
                    c++;    
                    }while(c<=x);
            x++;        
            }while(x<=a);
            
                   
                   
                   
                   
        
    }//Close Main Method
}//Close Class
     