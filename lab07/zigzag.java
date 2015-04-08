//lab 07
//March 6, 2015
//Zig Zag Java Program

import java.util.Scanner;

public class zigzag{
    public static void main(String[] args){

Scanner myScanner;        
myScanner = new Scanner ( System.in );
String answer = "";

do {
System.out.print("Enter an int between 3 and 33: ");
  int nStars=myScanner.nextInt();

    if (nStars>=3&&nStars<=33){
        //print first row
        int counter=0;
            while (counter < nStars){
            System.out.print("*");
	        counter++;
            }
        System.out.println();
        
        //print diagonal
        int i=0;
        while (i<(nStars-2)){
            int j=0;
            while (j<=i){
                System.out.print(" ");
                j++;
            }
            System.out.print("*");
            i++;
            System.out.println();
        }

        //print last row
        int counter1=0;
            while (counter1 < nStars){
    	    System.out.print("*");
	        counter1++;
            }
        System.out.println();
}
System.out.println("Enter y or Y to go again: ");
answer=myScanner.next();
} while (answer.equals("y")||answer.equals("Y"));

    }//end main method
}//end class





//Create an int variable nStars and assign it the value of 10. Then, use a loop to print out nStars copies of ‘*’ on a line: