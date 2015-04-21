//
//
//James Mannherz
//CSE 002
//4/10/16
//lab 11
//Methods
/*Purpose For this lab, you will perform linear and 
binary search on large arrays of random numbers.

  */
import java.util.Random;
import java.util.Scanner;

class Arrays{
  public static void main(String[] args){
 
 int [] array1 = new int [50];
 int [] array2 = new int [50];


      for (int i=0; i < array1.length;i++){
          Random t = new Random();
          int w = t.nextInt(100);
          array1[i]= w;
      }

    
      int min = 0;
      min = array1[0];     
      for(int j = 0; j<50; j++){
      if(array1[j] < min){
      min = array1[j];
      }
      else{ 
        min = min;
      
    }  
      }
      int max = 0;
      max = array1[0];     
      for(int j = 0; j<50; j++){
      if(array1[j] > max){
      max = array1[j];
      }
      else{ 
        max = max;
      
    }  
      }
      
      
      int r = 0;
      for (int i=0; i < array2.length;i++){
          Random t = new Random();
          int w = t.nextInt(100);
          r = r + w;
          array2[i]= r;
      }
      
      
      int min2 = 0;
      min2 = array2[0];     
      for(int j = 0; j<50; j++){
      if(array2[j] < min2){
      min2 = array2[j];
      }
      else{ 
        min2 = min2;
      
    }  
      }
      int max2 = 0;
      max2 = array2[0];     
      for(int j = 0; j<50; j++){
      if(array2[j] > max2){
      max2 = array2[j];
      }
      else{ 
        max2 = max2;
      
    }  
      }
      
      
    System.out.println("Please enter an integer above 0: ");
    Scanner myScanner = new Scanner(System.in);
    
    if(myScanner.hasNextInt()){
        int s = myScanner.nextInt();
          if(s >= 0){
            if(s == array2[(array2.length/2)]){
              System.out.println("The number was found in the list");
            }
            else if(s >= array2[(array2.length/2)]){
                  if(s == array2[(array2.length/2)+(array2.length/4)]){
                    System.out.println("The number was found in the list");
                  }
                  else if (s>=array2[(array2.length/2)+(array2.length/4)]){
                    if (s==array2[(array2.length/2)+(array2.length/4)+(array2.length/8)]){
                      System.out.println("The number was found in the list");
                    }
                    else if (s>=array2[(array2.length/2)+(array2.length/4)+(array2.length/8)]){
                      if(s==(array2.length/2)+(array2.length/4)+(array2.length/8)+(array2.length/16)){
                          
                         
                        
                      }
                    }
              
            }
            
            
            
            
            
          }
          }
          else if(s<0) {
            System.out.println("You did not enter a integer above 0");
            System.exit(0);
          }
      
      
    
    else{
      System.out.println("You did not enter an integer");
      System.exit(0);
    }
  }
      
      
      
      
      
      
      
      
      
      
      
      
      
  
    
    System.out.println("The min of array 1 is: "+ min);
    System.out.println("The max of array 1 is: "+max);

    System.out.println("The min array 2 is: "+ min2);
    System.out.println("The max array 2 is: "+max2);
    
    
    
    
  System.out.println("Please enter an integer above 0: ");
  if(myScanner.hasNextInt()){
  int w = myScanner.nextInt();
  
            int low = 0;
            int high = array2.length - 1;
            int i = 0;
            while (high >= low){
             
            int mid = (low + high) / 2;
            if(w < array2[mid] ){
                high = mid -1;
                i++;
            }
            else if(w == array2[mid]){
            i++;
            System.out.println("The grade "+w+" was found");
            System.exit(0);
            
                
            }
            
            else{
            i++;    
            low = mid + 1;}
            }
            
            System.out.println("The number "+w+" was not found.");
            System.out.println("The number above the key "+high );
            System.out.println("The number below the key was "+low);
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
  else{
    System.exit(0);
  }
  
  
    
    



  }
  
}

