import java.util.Scanner;

 class Study{
     
     public static void main (String [] args){
     Scanner scan;    
         
     scan = new Scanner( System.in );
     
     System.out.println("Please enter in one of the following; 0 1 10 11 100 101 110 or 111");
     
     int x = scan.nextInt();
     int a=0;
     int b;
     int c=0;
     int d;
     int e=0;
     boolean z;
     z = 10/100==0;
     
     if (x== 0 || x == 1 || x == 10 || x == 11 || x == 100 ||x == 101 ||x == 110 ||x == 111){
        if (x/100>=0){
        a=4;}
        if (x%100/10>0){
            c=2;
        }
        if (x%100%10>0){
            e=1;
        }
        
     System.out.println("The integer value is"+(a+c+e));
     System.out.println(z);
     }
     else{
         System.out.println("WRONG INPUT");
     }
     
     
     
     
     
     
     
     
 }

                }
        
        
    