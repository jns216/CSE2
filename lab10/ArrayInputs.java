//Lab 10
//Jillian Saydah
//The lab gets you familiar with declaring, allocating and initializing one-dimensional arrays

import java.util.Scanner;
public class ArrayInputs {
    
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        //ask the user to enter the size of an one-dimensional array
        System.out.print("Enter the size of an one-dimensional array: ");
        int size = scan.nextInt();
        //ask the user to fill up the array with integers
        System.out.print("Please fill up the array with integers: ");
        ifInt(size);
    }
    
    public static void ifInt (int size){
    Scanner scan = new Scanner(System.in);
    int digit=0;
    int i=0;
    int [] numbers = new int [size];
     while (i< size) {
            if (!scan.hasNextInt()){
                System.out.println("Error. This is not an int.");
                scan.next();
            }//check if int
            else {
                digit = scan.nextInt();
             if (digit<0) {
                System.out.println("Error. This value is not positive.");
                }
                else {
                    numbers[i]=digit;
                    i++;
                }
            }
            }
            for (int j= 0;j< numbers.length;j++){ 
            System.out.println("This is the array: " +numbers[j]);
            }
        
    }//end ifInt method
}