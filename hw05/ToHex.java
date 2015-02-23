//
//
//James Mannherz
//CSE 002
//2/14/16
//hw 04
//To Hex
/*Purpose develop a program which takes decimal RGB values 
(three inputs) and convert them to hexadecimal. */ 
import java.util.Scanner;
//import scanner
 
public class ToHex {  //start class
        public static void main (String [] agrs) {  //start method
            //Open variables
            int r = 0;
            int g = 0;
            int b = 0;
            
            //set up scanner variable
            Scanner myScanner = new Scanner( System.in ); 
            System.out.println("Please enter R value: "); //ask user for import
            if (myScanner.hasNextInt()){ //check if integer is entered
            r = myScanner.nextInt();} 
            else{System.out.println("Sorry, your input must be an integer.");} //if not variable
            System.out.println("Please enter G value: "); 
            if (myScanner.hasNextInt()){  
            g = myScanner.nextInt();}
            else{System.out.println("Sorry, your input must be an integer.");}
            System.out.println("Please enter B value: ");
            if (myScanner.hasNextInt()){
            b = myScanner.nextInt();}
            else{System.out.println("Sorry, your input must be an integer.");}
            //initialize variables
            int u=0;
            int v=0;
            int w=0;
            int x=0;
            int y=0;
            int z=0;
            String h="";
            String i="";
            String j="";
            String k="";
            String l="";
            String m="";
            //initialize if statement to check values of r
            if (r>=0 && r<=255){
               //set up conversion to hexadecimal
                u= r/16;
                v= r%16;
                switch (u){
                        case 0:
                            h = "0";
                            break;
                        case 1:
                            h = "1";
                            break;
                        case 2:
                            h = "2";
                            break;
                        case 3:
                            h = "3";
                            break; 
                        case 4:
                            h = "4";
                            break;
                        case 5:
                            h = "5";
                            break;
                        case 6:
                            h = "6";
                            break;
                        case 7:
                            h = "7";
                            break;
                        case 8:
                            h = "8";
                            break;
                        case 9:
                            h = "9";
                            break;
                        case 10:
                            h = "A";
                            break;
                        case 11:
                            h = "B";
                            break;
                        case 12:
                            h = "C";
                            break;
                        case 13:
                            h = "D";
                            break; 
                        case 14:
                            h = "E";
                            break;
                        case 15:
                            h = "F";
                            break;    
                            
                    }
                
                switch (v){
                        case 0:
                            i = "0";
                            break;
                        case 1:
                            i = "1";
                            break;
                        case 2:
                            i = "2";
                            break;
                        case 3:
                            i = "3";
                            break; 
                        case 4:
                            i = "4";
                            break;
                        case 5:
                            i = "5";
                            break;
                        case 6:
                            i = "6";
                            break;
                        case 7:
                            i = "7";
                            break;
                        case 8:
                            i = "8";
                            break;
                        case 9:
                            i = "9";
                            break;
                        case 10:
                            i = "A";
                            break;
                        case 11:
                            i = "B";
                            break;
                        case 12:
                            i = "C";
                            break;
                        case 13:
                            i = "D";
                            break; 
                        case 14:
                            i = "E";
                            break;
                        case 15:
                            i = "F";
                            break;    
                            
                    }
                
                
                
                } 
            
            else { System.out.println("Sorry, you must enter values between 0-255."); //if incorrect input
                return;}
             
             
             
             
             
             if (g>=0 && g<=255){
                w = g/16;
                x = g%16;
                
                switch (w){
                        case 0:
                            j = "0";
                            break;
                        case 1:
                            j = "1";
                            break;
                        case 2:
                            j = "2";
                            break;
                        case 3:
                            j = "3";
                            break; 
                        case 4:
                            j = "4";
                            break;
                        case 5:
                            j = "5";
                            break;
                        case 6:
                            j = "6";
                            break;
                        case 7:
                            j = "7";
                            break;
                        case 8:
                            j = "8";
                            break;
                        case 9:
                            j = "9";
                            break;
                        case 10:
                            j = "A";
                            break;
                        case 11:
                            j = "B";
                            break;
                        case 12:
                            j = "C";
                            break;
                        case 13:
                            j = "D";
                            break; 
                        case 14:
                            j = "E";
                            break;
                        case 15:
                            j = "F";
                            break;    
                            
                    }
                
                switch (x){
                        case 0:
                            k = "0";
                            break;
                        case 1:
                            k = "1";
                            break;
                        case 2:
                            k = "2";
                            break;
                        case 3:
                            k = "3";
                            break; 
                        case 4:
                            k = "4";
                            break;
                        case 5:
                            k = "5";
                            break;
                        case 6:
                            k = "6";
                            break;
                        case 7:
                            k = "7";
                            break;
                        case 8:
                            k = "8";
                            break;
                        case 9:
                            k = "9";
                            break;
                        case 10:
                            k = "A";
                            break;
                        case 11:
                            k = "B";
                            break;
                        case 12:
                            k = "C";
                            break;
                        case 13:
                            k = "D";
                            break; 
                        case 14:
                            k = "E";
                            break;
                        case 15:
                            k = "F";
                            break;    
                            
                    }
                
                
                }
             else { System.out.println("Sorry, you must enter values between 0-255.");
                 return;
             }
            if (b>=0 && b<=255){
                y= b/16;
                z= b%16;
                
                switch (y){
                        case 0:
                            l = "0";
                            break;
                        case 1:
                            l = "1";
                            break;
                        case 2:
                            l = "2";
                            break;
                        case 3:
                            l = "3";
                            break; 
                        case 4:
                            l = "4";
                            break;
                        case 5:
                            l = "5";
                            break;
                        case 6:
                            l = "6";
                            break;
                        case 7:
                            l = "7";
                            break;
                        case 8:
                            l = "8";
                            break;
                        case 9:
                            l = "9";
                            break;
                        case 10:
                            l = "A";
                            break;
                        case 11:
                            l = "B";
                            break;
                        case 12:
                            l = "C";
                            break;
                        case 13:
                            l = "D";
                            break; 
                        case 14:
                            l = "E";
                            break;
                        case 15:
                            l = "F";
                            break;    
                            
                    }
                
                switch (z){
                        case 0:
                            m = "0";
                            break;
                        case 1:
                            m = "1";
                            break;
                        case 2:
                            m = "2";
                            break;
                        case 3:
                            m = "3";
                            break; 
                        case 4:
                            m = "4";
                            break;
                        case 5:
                            m = "5";
                            break;
                        case 6:
                            m = "6";
                            break;
                        case 7:
                            m = "7";
                            break;
                        case 8:
                            m = "8";
                            break;
                        case 9:
                            m = "9";
                            break;
                        case 10:
                            m = "A";
                            break;
                        case 11:
                            m = "B";
                            break;
                        case 12:
                            m = "C";
                            break;
                        case 13:
                            m = "D";
                            break; 
                        case 14:
                            m = "E";
                            break;
                        case 15:
                            m = "F";
                            break;    
                            
                    }
                
                
                 }
            
    
            else { System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
 
 
            System.out.println("The decimal numbers R:"+ r +", G:"+ g +", B:"+ b 
            + ", is represented in hexidecimal as: "+h+i+j+k+l+m); //Final print statement
            
            
            
            
} //close method

}//close class