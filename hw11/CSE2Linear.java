//Hw 11
//Jillian Saydah
//due April 14
//This homework gives practice in searching single dimensional arrays

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    public static void main (String[] args){
    
    Scanner myScanner = new Scanner (System.in);
    int[] digit = new int[15];
    int scrambleArray[];
    System.out.println("Enter 15 ints for final grades in CSE2: ");
        
        for (int i = 0; i < digit.length; i++) {
            while (!myScanner.hasNextInt()){
                System.out.println("Error. This is not an int.");
                myScanner.next();
            }//check if int
            digit[i] = myScanner.nextInt();
            
            while (digit[i]<0 || digit[i]>100) {
                System.out.println("Error. This value is not between 0 and 100");
                while (!myScanner.hasNextInt()){
                    System.out.println("Error. This is not an int.");
                    myScanner.next();
                }
                digit[i] = myScanner.nextInt();
            }//check if in range
            if (i!=0){    
                if (digit[i] >= digit[i-1]){
                continue;
                }
                else {
                    System.out.println("Error. This int is not larger than the previous.");
                    i--;
                }
            }
            else {
            }
        }//end for loop
    String out="";
    out+=listArray(digit);  
  	System.out.println(out);
  

    //prompt the user to enter a grade to be searched for
    System.out.print("Enter a grade to search for: ");
    int gradeSearch = myScanner.nextInt();
    binarySearch(digit, gradeSearch);
    
    //scramble the sorted array randomly, and print out the scrambled array.
    System.out.println("Scrambled:");
    scramble(digit);
    String out2="";
    out2+=listArray(digit);  
  	System.out.println(out2);
  	
  	//Prompt the user again to enter an int to be searched for
  	System.out.print("Enter a grade to search for: ");
    int gradeSearch2 = myScanner.nextInt();
    linearSearch(digit, gradeSearch2);
    
    
    }//end main method
    
    //method to print the array
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
    
 //binary search to find grade input   
 public static void binarySearch (int[] digit, int gradeSearch) {
       
       int iteration = 1;
       int top = digit.length;
       int bottom = 0;
       int mid = (top + bottom) / 2;
       
    while ((digit[mid] != gradeSearch) && (bottom <= top)) {
         
        iteration++;
        
        if (digit[mid] > gradeSearch) {                                           
            top = mid - 1;   
        }                                                             
        else {                                                        
            bottom = mid + 1;
        }
       
        mid = (top + bottom) / 2;
     }//end while loop
     
    if (bottom <= top) {
        System.out.print("The number " + gradeSearch + " was found ");
        System.out.println("after " + iteration + " iterations.");
     }//end if statement
    else {
          System.out.println("The number " + gradeSearch + " was not found.");
    }//end else
    
  return;
  
}//end binary search method

//method to scramble array
    public static void scramble (int[] digit){
 
    Random random = new Random();

    for (int i = digit.length-1; i > 0; i--){
        int position = random.nextInt(i+1);
        int swap = digit[position];
        digit[position] = digit[i];
        digit[i] = swap;
    }//end for loop
    }//end scramble method 
    
    public static void linearSearch (int[] digit, int gradeSearch){
        int iteration = 0;
        int i = 0;
        for (i = 0; i < digit.length; i++) {
            if (digit[i] == gradeSearch) {
                System.out.print("The number " + gradeSearch + " was found ");
                System.out.println("after " + iteration + " iterations.");
            break;
            }
            iteration++;
        }
        if (i == digit.length) {
            System.out.println("The number " + gradeSearch + " was not found.");
        }
    }// end linearSearch method
    
}//end class

