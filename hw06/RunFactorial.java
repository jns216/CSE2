//Jillian Saydah
//Due March 3, 2015
//HW 06-Run Factorial-Use while-loop to solve factorial programs
//Using scanner, you will first input an integer that is between 9 and 16 inclusively. 
//Then you need to calculate the factorial of the input number

import java.util.Scanner; //import the Scanner class
public class RunFactorial {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

System.out.print("Please enter an integer that is between 9 and 16: ");

//Have scanner only read in integers
//if a double is entered, the program will not run
while (myScanner.hasNextInt()){
    int number=myScanner.nextInt();
if ((number>=9)&&(number<=16)){
int factorial=1;
int i=1;
while (i<=number) {
      factorial*=i;
      i++;
      }
System.out.println("The Factorial is: " + factorial);
break;
        }
else{
    System.out.println("Invalid, enter again.");
}
}

    }//end main method
}//end class


