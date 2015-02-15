///////////////////
//Jillian Saydah
//lab04
//February 13, 2015
//Cookies Java Program
//This program uses the Scanner class to obtain from users
//how many cookies they want, 
//how many people they are buying for, 
//and at least how many cookies they want each person to get at an event

import java.util.Scanner;

public class Cookies {
    //main method required for every Java program
    public static void main (String[] args) {

Scanner myScanner;        
myScanner = new Scanner ( System.in );

System.out.print("Enter the number of people: "); //prompt the user for the number of people
int people = 0;

if (myScanner.hasNextInt()){
    people = myScanner.nextInt();
}
else {
    System.out.println("You did not enter an int");
    return; //leaves the program
}
if ( people < 0 ){
    System.out.println("The number is not greater than 0");
    return; //leaves the program
}

System.out.print("Enter the number of cookies: "); //prompt the user to enter the number of cookies
int cookies;

if (myScanner.hasNextInt()){
    cookies = myScanner.nextInt();
}
else {
    System.out.println("You did not enter an int");
    return; //leaves the program
}
if ( cookies < 0 ){
    System.out.println("The number is not greater than 0");
    return; //leaves the program
}

System.out.print("How many cookies do you want each person to get? ");
int perPerson = myScanner.nextInt();
double cookiesPerPerson = (double) cookies/perPerson;

if ( perPerson < 0) {
    System.out.println("The number is not positive");
    return; }

if (cookiesPerPerson==people){
    System.out.println("You have enough cookies and they will divide evenly");
    }
if (cookiesPerPerson<people){ 
    System.out.println("You will not have enough cookies");
}
if (cookiesPerPerson>people){
    System.out.println("You have enough cookies, but they won't divide evenly");
    return;
}
    } //end of main method
} //end of class
