//lab 07
//March 6, 2015
//Zig Zag Java Program

import java.util.Scanner;

public class zigzag{
    public static void main(String[] args){

Scanner myScanner;        
myScanner = new Scanner ( System.in );

System.out.print("Enter an int between 3 and 33: ");
  int nStars=myScanner.nextInt();

while ((nStars>=3)&&(nStars<=33)){
    
        while (myScanner.hasNextInt()){
        int counter=0;
        
            while (counter < nStars){
            System.out.print("*");
	        counter++;
	       
            }//first while loop
            System.out.println();
//(2)
//(3)
        int counter1=0;
        
            while (counter1 < nStars){
    	        System.out.print("*");
	            counter1++;
	            
            }//third loop
        }//close while (myScanner.hasNextInt())

        while(!myScanner.hasNextInt()){
            System.out.println("Enter an int between 3 and 33: ");
            nStars=myScanner.nextInt();
           
        }//end while (!myScanner.hasNextInt) loop
    break;
    
}//end outside loop
while ((nStars<3)&&(nStars>33)){
    System.out.print("Enter an int between 3 and 33: ");
    nStars=myScanner.nextInt();
    break;
}

    }//end main method
}//end class





//Create an int variable nStars and assign it the value of 10. Then, use a loop to print out nStars copies of ‘*’ on a line: