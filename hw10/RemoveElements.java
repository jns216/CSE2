//hw10
//Jillian Saydah
//Due 4/7/15
//This homework gives you practice in manipulating arrays and in writing methods that have array parameters.
    //The randomInput() method generates an array of 10 random integers between 0 to 9. 
    //The method delete(list,pos) takes, as input, an integer array called list and an integer called pos.
    //Method remove(list,target) deletes all the elements that are equal to target, returning a new list without all those new elements.

import java.util.Scanner;

public class RemoveElements{
    
  public static void main(String [] arg){
      
	Scanner scan=new Scanner(System.in);
	
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	    System.out.println("Random input 10 ints [0-9]");
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
  	    newArray2 = remove(newArray1,target);
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
  	 
  	    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	    answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }//end main method
 
  public static String listArray(int num[]){
	String out="{";
	for (int j=0;j<num.length;j++){
  	    if(j>0){
    	    out+=", ";
  	    }//end if statement
  	    out+=num[j];
	}//end for loop
	out+="} ";
	return out;
  }//end list array
  
  public static int [] randomInput(){
     int [] array = new int [10];
     for (int k = 0; k < array.length; k++){
         array[k] = (int)(Math.random()*10);
     } return array; //end for loop
  }//end randomInput method
  
  public static int [] delete(int[] list, int pos){
         if (pos > -1 || pos < 10){
             int[] array2 = new int[list.length - 1];
            System.arraycopy(list, 0, array2, 0, pos);
            System.arraycopy(list, pos+1, array2, pos, list.length - pos-1);
            return array2;
         }//end nested if statement
        else {
         System.out.println("The index is not valid.");
        }//end else statement
        return list;
  }//end delete method
  
  public static int [] remove(int [] list, int target){
      int targetVal=0;
      
      for (int i=0; i < list.length; i++){
          targetVal=list[i];
          if (targetVal==target){
            list=delete(list,i);    
          }//end if statement
      }//end for loop
      return list;
  }//end remove method
  
}//end class
