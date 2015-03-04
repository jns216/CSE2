//Jillian Saydah
//Due March 3, 2015
//HW 06-Get Integers
//Ask the user for 5 non-negative integers
//and print out the sum of the 5 integers

import java.util.Scanner; //import the Scanner class
public class GetIntegers {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

//prompt user to enter integer
System.out.print("Please enter 5 non-negative integers: ");
for(int i = 0; i < 5; i++) {
    int integer1=myScanner.nextInt();
    if(integer1 >= 0) {
        i++;
        int integer2=myScanner.nextInt();
        if(integer2 >= 0) {
            i++;
            int integer3=myScanner.nextInt();
            if(integer3 >= 0) {
                i++;
                int integer4=myScanner.nextInt();
                if(integer4 >= 0) {
                    i++;
                    int integer5=myScanner.nextInt();
                    if(integer5 >= 0) {
                        i++;
                        //print sum
                        int sum= integer1+integer2+integer3+integer4+integer5;
                        System.out.println("The sum is : " +sum);
                        
                    }
                    else {
                        System.out.println("Invalid");
                        i--;
                    }
                }
                else {
                System.out.println("Invalid");
                i--;
                    }
                }
            else {
            System.out.println("Invalid");
            i--;
                }
            } 
        else {
        System.out.println("Invalid");
        i--;
            }
        }
    else {
    System.out.println("Invalid");
    i--;
    }
    }
}//end main method
}//end class




