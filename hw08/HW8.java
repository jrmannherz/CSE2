//
//
//James Mannherz
//CSE 002
//3/14/16
//hw 08
//HW8
/*Purpose program that forces the user to enter an integer between 1 and 30,
inclusive, and then prints out displays that depend on the value entered 
and look like the following:
  */
  
import java.util.Scanner;
import java.lang.Math;

 class HW8{
     
     
     public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//close main method
    
    
        public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//close giant method
    
        public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//close cave method
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    } //close box method
    
    
    public static String getInput(Scanner scan, String string){
     String l = scan.next();
     if (l.equals("c")||l.equals("C")){
     }
     else{
         System.out.println("Yea right Loser!");
         System.exit(0);
     }//close else statement
     
    return (l) ; 
    }//close continue getInput method
    
     public static String getInput(Scanner scan, String string, int trial){
     boolean valid = false;
     int crit = 0;
   
   while(valid == false){ 
        System.out.println("Please Enter A, a, to attack or E, or e to escape. ");
        String o = scan.next();  
        if (o.equals("A")||o.equals("a")){
            int hit = ((int) (Math.random() *(10))%2);
                if(hit==1){
                crit=crit+1;
                valid = valid;
                System.out.println("A Critical Hit.");
                    if (crit==10){
                        System.out.println("You have killed the giant!"); 
                        valid = true;
                    }//close if statement        
                
                }//close if statement
            else{
            System.out.println("You have missed the giant.");
            valid = false;
            }//close else statment
        }//close if statement
  
        else if(o.equals("e")||o.equals("E")){
      
            int run = ((int) (Math.random() *(10)+1));
            if (run == 10){
                System.out.println("You have escaped successfully.");
                valid = true;  
            }//close if statement
            else{
                System.out.println("You have failed to escape.");
                valid = false;
            }//close else statement
        }//close else if statment
 
        else{
        System.out.println("Executed by the Giant. Game Over!");
        System.exit(0);
         }//close else statement
        }//close valid while loop 
        return("scan");     
     }//close getInput method
    
    public static String getInput(Scanner scan){
        int yellow = scan.nextInt(); 
        switch (yellow){
        case 1: 
            System.out.println("It is a pound of gold!");
            break;
        case 2:
            System.out.println("It is a pound of silver!");
            break;
        case 3:
            System.out.println("It is a pound of bronze!");
            break;
        default:  
        System.out.println("A Wrong Number! You get nothing! Better restart the game LOL!");
        break;
        
        
        
    }//close switch statement
    return("scan");
    }//close method
    
    
    
    
    
 }//close class
     
     