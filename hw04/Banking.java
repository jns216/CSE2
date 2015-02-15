///////////////////
//Jillian Saydah
//hw04
//February 17, 2015
//Banking Java Program
//This program uses switch statements to allow users to process banking transactions

import java.util.Scanner; //import the Scanner class
public class Banking {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

//Start the user off with a random amount between 1,000 and 5,000
int randNumber = (int)(Math.random()*4000 + 1000);
System.out.println("Your balance is " + randNumber);

//Offer the choice of depositing money, withdrawing money, or viewing balance
System.out.print("Do you want to deposit money, withdraw money, or view balance? ");
String choice = myScanner.nextLine();

double balance= randNumber;

switch (choice){
    //If deposit, ask how much and make sure it's positive
    case "deposit": System.out.print("How much do you want to deposit? ");
        String deposit = myScanner.nextLine();
        double deposit2 = Double.parseDouble(deposit);
        if(deposit2 > 0) {
        double newBalance = deposit2 + randNumber;
        //print resulting balance
        System.out.println("Your balance is " + newBalance);
        }
        else {
            System.out.println("That number is not positive.");
        }
    break;
    //If withdraw, ask how much and make sure it's positive and greater than balance
    case "withdraw": System.out.print("How much do you want to withdraw? ");
        String withdraw = myScanner.nextLine();
        double withdraw2 = Double.parseDouble(withdraw);
        if (withdraw2 > 0 && withdraw2 < randNumber){
        double newBalance2 = randNumber - withdraw2;
        //print resulting balance
        System.out.println("Your balance is " + newBalance2);
        }
        else {
        System.out.println("That number is not positive and greater than balance.");
        }
    break;
    //Choose view balance and print out the balance
    case "view": System.out.println("Your balance is " + balance);
    break;
}
 
    } //end of main method
} //end of class