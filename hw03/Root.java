///////////////////
//Jillian Saydah
//hw03
//February 10, 2015
//Root Java Program
//This program prompts the user to enter a double
    //and then prints out a crude estimate of the cube root of the number 
    //and the value of this crude guess when cubed

import java.util.Scanner; //import the Scanner class
public class Root {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

System.out.print("Enter a double and I print its cube root-  ");
double number = myScanner.nextDouble ();

double est1 = (number/3);
double est2 = (est1*est1*est1+number)/(3*est1*est1);
double est3 = (2*est2*est2*est2+number)/(3*est2*est2);
double est4 = (2*est3*est3*est3+number)/(3*est3*est3);
double answer = (est4*est4*est4);

System.out.println("The cube root is " + est4 + ":");
System.out.println( est4 + "*" + est4 + "*" + est4 + "=" + answer);

    }//end of main method
}//end of class