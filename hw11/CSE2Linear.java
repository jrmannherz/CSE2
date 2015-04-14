import java.util.Scanner;
import java.util.Random;
class CSE2Linear{
  
  public static void main(String[] args){
      
      Scanner myScan = new Scanner(System.in);
      int[] first = new int[15];
        
        int x = 15;
        int y = 0;
        boolean valid = true;
        boolean green = false;
        int r = 0;
        String f = "";
        
            while(!green){
                if(valid){
            System.out.print("Please enter 15 ints for the final grades in CSE2: ");
          while(r < x){
                    if(myScan.hasNextInt()){ //check for integer
                      y = myScan.nextInt();
                                    if(y>=0 && y<=100){  //check for positive
                                        if(r==0){
                                             first[r]= y;
                                             r++;
                                             valid = false;
                                        }                             
                                            else if(r>0){
                                                if ( y >= first[r-1]){
                                                first[r]= y;
                                                r++;
                                                valid = false;
                                        }
                                        else {
                                            System.out.println("Incorrect input, values must be in ascending order");
                                        }
                                            }
                                    }
                                    else{
                                        System.out.println("Incorrect Input, out of range");
                                        valid = true;                                    
                                    }//close else statement
                    }
                    else{
                         f=myScan.next();
                        System.out.println("Incorrect input");
                        valid = true;
                    }//close else statement
            }//close while loop
                }//close valid while loop
            
                            System.out.print("The grades, sorted, are: ");
                            int i=0;
                              while(i<x) { //counter for array
                                System.out.print(" "+first[i]);
                                i++;
                                }//close while loop
                                green = true;
                                
            }                
                System.out.println();                
                System.out.println("Enter a grade to be searched for: ");
                int next = myScan.nextInt();
                
                
                binarySearch(first,next);
                
                 scramble (first);
                    
                System.out.println("Enter a grade to be searched for: ");
                int last = myScan.nextInt();
                
                linear(first,last);
                    
               
                
                
                
            }
                
                
                
        public static int binarySearch(int[] list, int key){
            int low = 0;
            int high = list.length - 1;
            int i = 0;
            while (high >= low){
             
            int mid = (low + high) / 2;
            if(key < list[mid] ){
                high = mid -1;
                i++;
            }
            else if(key == list[mid]){
            i++;
            System.out.println("The grade "+key+" was found with "+i+" iterations");
            return mid;
                
            }
            else{
            i++;    
            low = mid + 1;}
            }
            
            System.out.println("The grade "+key+" was not found. "+i+" iterations were used." );
            return i;
            
        
            
            
            

        }        
    public static int[] scramble(int [] list){
     int index = 0;
     int x = 0;
     Random y = new Random();
     
     for(int i = list.length-1; i > 0; i--){
         index = y.nextInt(i + 1);
        x = list[index];
        list[index]= list [i];
        list[i]= x;
     }
        
        
    System.out.println("The Scrambled list is: ");   
    for(int l = 0; l < list.length; l++){  
    System.out.print(" " +list[l]);    
     
    }
    System.out.println();
    return list;
    
        
    }
    
    
public static int linear(int [] list, int key){
    
    int x = key;
    
    for (int i = 0; i<list.length; i++ ){
        if(x==list[i]){
            i++;
            System.out.println("The Grade "+key+" was found with "+i+" iterations.");
            break;
        }
       
        }
        return x;
    }
    
  

}
    