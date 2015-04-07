//
//
//James Mannherz
//CSE 002
//4/5/16
//lab 09
//Methods
/*Purpose Methods allow software developers to modularize and 
reuse their code in many contexts, reducing the chance for bugs and 
increasing productivity.  This lab will give you basic experience in 
declaring and calling methods. 
  */


import java.util.Random;

class Methods{
  public static void main(String[] args){
    int t = 0;
    Random i = new Random();
    int w = i.nextInt(10); 
    String g = "";  
      
    for(t=0;t<=w;t++){
System.out.print("The "+Adjective(g)+" "+Adjective(g)+ " "+Noun(g)+ " "+Verb(g)+ " "+"the"+ " "+Adjective(g)+ " "+object(g));
System.out.println();
  }  
      
  
  
  
 
  }
 
 public static String Verb(String v){

     Random x = new Random();
     int a = x.nextInt(10);
     switch (a){
         case 0:
             v = "ran";
             break;
         case 1:
             v = "rung";
             break;
         case 2:
             v = "hit";
             break;    
         case 3:
             v = "jumped";
             break;
         case 4:
             v = "hoped";
             break;     
         case 5:
             v = "trapped";
            break;    
         case 6:
             v = "walked";
             break;    
         case 7:
             v = "looked";
             break;    
         case 8:
             v = "lied";
          break;
         case 9:
             v = "tried";
            break;    
     }
    return v;         
  
 }//close method
 
  public static String Noun(String n){
       Random x = new Random();
     int a = x.nextInt(10);
      switch (a){
         case 0:
             n = "school";
             break;
         case 1:
             n = "Lehigh";
             return n;
         case 2:
             n = "Acton";
             break;     
         case 3:
             n = "Boxborough";
             break;
         case 4:
             n = "Soccer";
            break;    
         case 5:
             n = "Ball";
            break;      
         case 6:
             n = "Track";
            break;     
         case 7:
             n = "Field";
            break;      
         case 8:
             n = "Fenway";
              break;  
         case 9:
             n = "the Red Sox";
            break;    
      }
             return n;
   
     
 }//close method
  public static String Adjective(String d){
       Random x = new Random();
     int a = x.nextInt(10);
      switch (a){
           case 0:
             d = "cool";
            break;  
         case 1:
             d = "low";
             break;  
         case 2:
             d = "awesome";
             break;     
         case 3:
             d = "boxy";
           break;  
         case 4:
             d = "Super";
           break;       
         case 5:
             d = "boneless";
          break;     
         case 6:
             d = "Sticky";
             break;     
         case 7:
             d = "cold";
             break;      
         case 8:
             d = "loud";
             break;  
         case 9:
             d = "Red";
            break;   
             
      }  
    return d;      
     
     
 }//close method
 
  public static String object(String o){
       Random x = new Random();
     int a = x.nextInt(10);
     
      switch (a){
         case 0:
             o = "dog";
            break;  
         case 1:
             o = "cat";
             break;  
         case 2:
             o = "town";
             break;      
         case 3:
             o = "city";
             break;  
         case 4:
             o = "state";
             break;     
         case 5:
             o = "ball";
             break;     
         case 6:
             o = "rock";
             break;      
         case 7:
             o = "jogger";
             break;       
         case 8:
             o = "way";
              break;  
         case 9:
             o = "few";
            break;  
      }
    return o;         
     
     
 }//close method

}//close class
    