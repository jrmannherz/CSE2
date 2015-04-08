//
//
//James Mannherz
//CSE 002
//4/5/16
//hw 10
//Elimination
/*Purpose This homework gives you practice in manipulating 
arrays and in writing methods that have array parameters.

  */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int [] num=new int[10];
int [] newArray1;
int [] newArray2;
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }//close main method
  
  public static int[] randomInput(){
    int []one  = new int[10];
    Random x = new Random();
    int ran = 0;
    for (int i = 0;i<10;i++){
        ran = x.nextInt(10);
        one[i] = ran;
    }//close for loop
return (one);
  }//close method
  
  public static int[] delete(int [] list,int pos){
      //The method delete(list,pos) takes, as input, an integer array called list and an integer called pos.  It should create a new array that has one member fewer than list, and be composed of all of the same members except the member in the position pos.  
    int []x = new int [list.length-1];
    int y,j;
    y = pos;
    int i;
    for(i= j = 0; i < list.length; i++){
        if(!(i == y )){    
        x[j]=list[i];
        j++;
        }
    }
    
    return (x);
  }
  
  public static int[] remove(int [] list, int target) {
   //Method remove(list,target) deletes all the elements that are equal to target, returning a new list without all those new elements.
   int i,j,a=0;
   int y = target;
   
   for(i=0;i<10;i++){
       if(list[i]==y){
           a++;
       }
   }
   
   
   int x[]= new int [list.length - a];
   for (i=j =0; i < list.length; i++){
       if(!(list[i]==y)){
           x[j]=list[i];
           j++;
   }
   }        
  return (x);
}
}