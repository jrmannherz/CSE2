import java.util.Scanner;
import java.util.Random;

class Study{
  public static void main(String[] args){
     int x[]={1, 2, 4, 6};
     double [] u={3, 4, 5, 6, 7}, v={2, 4, 5};

System.out.println(enigma(u,v,x));

System.out.println(enigma(v,u,x));


   
  }
   
  public static int enigma(double x[], double y[],int z[]){
        double []temp;
        temp=x;
        temp[z[2]]=42.0;
        y=x;
        y[0]=2.34;
        return z[z[0]];
    }


  
  
  
  
 
}
    