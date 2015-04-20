//Lab 11
//April 10
//Jillian Saydah

import java.util.Random;
import java.util.Scanner;
public class lab11 {

public static void main (String[] args){
        
Scanner myScanner = new Scanner ( System.in );  

//Create two integer arrays of size 50
int[] array1 = new int[50];
int[] array2 = new int[50];

//Fill array1 with random integers between 0 and 100
    for (int i = 0; i < array1.length; i++){
        array1[i] = (int)(Math.random() * 100);
        System.out.print(array1[i] + " ");
    }//end for loop
    System.out.println();

//Use linear search to print min and max values of array1
System.out.println("The maximum of array 1 is: " + getMaxValue(array1));
System.out.println("The minimum of array 1 is: " + getMinValue(array1));
    
//Add random numbers to array2
    for (int j = 0; j < array2.length; j++){
        array2[j] = (int)(Math.random() * 100);
        System.out.print(array2[j] + " ");
    }//end for loop
    System.out.println();
    
//Print min and max values of array2
System.out.println("The maximum of array 2 is: " + getMaxValue(array2));
System.out.println("The minimum of array 2 is: " + getMinValue(array2));
    
//Prompt the user to enter an int >= 0
System.out.print("Enter an int >= 0: ");
int input=myScanner.nextInt();
    if (input < 0){
    System.exit(0);
    }//exit the program if they do not enter an int >= 0.
array2 = sort(array2);
for (int k = 0; k < array2.length; k++){
        System.out.print(array2[k] + " ");
    }//end for loop
    System.out.println();
//Use binary search to search the array for the inputted value.
binarySearch(array2, input);
  }//end main method

//Method to print max value of array1
public static int getMaxValue(int[] array){  
    int maxValue = array[0];  
    for (int i = 1;i < array.length;i++){  
        if (array[i] > maxValue){  
        maxValue = array[i];  
         }  
     }  
             return maxValue;  
}//end max method

//Method to print min value of array1
public static int getMinValue(int[] array){  
     int minValue = array[0];  
     for (int i = 1;i < array.length; i++){  
        if (array[i] < minValue){  
        minValue = array[i];  
        }  
     }  
            return minValue;  
}//end min method  

//method to sort array
public static int [] sort (int[] array){
int tempVar;
    for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array.length; j++) {
            if (array[i] < array[j]) {
                tempVar = array [j];
                array [j]= array [i];
                array [i] = tempVar;
            }
       }
    }
    return array;
}
//Method to search the array for the inputted value
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
          System.out.println("The number above the key was " + top);
          System.out.println("The number below the key was " + bottom);
    }//end else
  return;
}//end binary search method

}//end class

