//
//
//James Mannherz
//CSE 002
//2/14/16
//lab 06
//Smile Generator
/*Purpose The purpose of this lab is to get familiar with loops, 
a critical piece of syntax that is essential for many 
programming languages  */

import java.lang.Math;

public class SmileGenerator {
    public static void main (String[] args){
        String smile = ":)";
        int a = 1;
        int j = 0;



int x = (int) (Math.random()*99+1); //set up variable

for(a = 1;a < x;a++){
    for(j=1;j<a;j++){
    System.out.println(smile);
    }
}



    }//close method
}//close class

