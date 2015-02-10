///////////////////
//Jillian Saydah
//hw03
//February 10, 2015
//Four Digits Java Program
//This program prompts the user to enter a double 
//and then prints out the first four digits to the right of the decimal point.

import java.util.Scanner; //import the Scanner class
public class FourDigits {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
double number = myScanner.nextDouble ();

int digits = (int) (number*10000);
int remainder1 = (int) (digits%10000)/1000;
int remainder2 = (int) (digits%1000)/100;
int remainder3 = (int) (digits%100)/10;
int remainder4 = (int) (digits%10);

System.out.println("The four digits are " + remainder1 + remainder2 + remainder3 + remainder4);

 } //end of main method
    
} //end of class