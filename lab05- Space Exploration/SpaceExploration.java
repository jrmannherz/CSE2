//
//
//James Mannherz
//CSE 002
//2/14/16
//lab 05
//Space Exploration
/*Purpose You are going to write a program that outputs 
a timeline of significant space exploration advances 
from 2000 - 2010. */
import java.lang.Math; //import utility

public class SpaceExploration { //open class
        public static void main (String [] args){ //open main method
        
    
        int x = 2000 + (int) (Math.random()*11); //set up variable
        
            if(x>2000){        //check if correct input
            System.out.println("Here is a time line of the space exploration events from "+x+" to 2000:");
            
            switch(x) { //set up switch statement
                case 2010:
                    System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
                case 2009:
                    System.out.println("2009: N/A");
                case 2008:
                    System.out.println("2008: Kepler launched to study deep space");
                case 2007:
                    System.out.println("2007: N/A");
                case 2006:
                    System.out.println("2006: Spacecraft returns with collections from a comet");
                case 2005:
                    System.out.println("2005: Spacecraft collides with comet");
                case 2004:
                    System.out.println("2004: N/A");
                case 2003:
                    System.out.println("2003: Largest infrared telescope released");
                case 2002:
                    System.out.println("2002: N/A");
                case 2001:
                    System.out.println("2001: First spacecraft lands on asteroid");
                case 2000:   
                    System.out.println("2000: First spacecraft orbits an asteroid");
            }
            }
            else{
            System.out.println("Here is the space exploration event from 2000:"); //if x equals 2000
            System.out.println("2000: First spacecraft orbits an asteroid");
            }
            
            
            
            
            
        }//close class
}//close method 

