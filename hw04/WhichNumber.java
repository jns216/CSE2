///////////////////
//Jillian Saydah
//hw04
//February 17, 2015
//Which Number Java Program
//This program prompts the user to think of an int between 1 and 10
//Then the program proceeds to ask the user questions in an attempt to guess the number

import java.util.Scanner; //import the Scanner class
public class WhichNumber {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

//prompts the user to think of an int between 1 and 10
System.out.println("Think of an int between 1 and 10 inclusive.");

//asks the user if the number is even
System.out.print("Is the number even? ");
String number1 = myScanner.nextLine();

if (number1.equals("Y")||number1.equals("y")){
    //ask if divisible by 3
    System.out.print("Is the number divisible by 3? ");
    String number2 = myScanner.nextLine();
    if (number2.equals("Y")||number2.equals("y")) {
    //ask if the number is 6
        System.out.print("Is the number 6? ");
        String six = myScanner.nextLine();
        if (six.equals("Y")||six.equals("y")) {
            System.out.println("YAY!");
        }
    }
            
    //if not divisible by 3        
    else if (number2.equals("N")||number2.equals("n")){
    //ask if divisible by 4
        System.out.print("Is the number divisible by 4? ");
        String number3 = myScanner.nextLine();
    //ask if greater than 1
        if (number3.equals("Y")||number3.equals("y")){
        System.out.print("Is the number divided by 4 greater than 1? ");
        String number4 = myScanner.nextLine();
    //ask if eight
            if (number4.equals("Y")||number4.equals("y")){
            System.out.print("Is the number 8? ");
            String eight = myScanner.nextLine();
                if (eight.equals("Y")||eight.equals("y")){
                System.out.println("YAY!");}
            }
            else if (number4.equals("N")||number4.equals("n")){
            System.out.print("Is the number 4? ");
            String four = myScanner.nextLine();
                if (four.equals("Y")||four.equals("y")){
                System.out.println("YAY!");}
            }
    }
        else if (number3.equals("N")||number3.equals("n")){
        System.out.print("Is the number divisible by 5? ");
        String number5 = myScanner.nextLine();
            if (number5.equals("Y")||number5.equals("y")){
            System.out.print("Is the number 10? ");
            String ten = myScanner.nextLine();
                if (ten.equals("Y")||ten.equals("y")){
                System.out.println("YAY!");}
}

            else if (number5.equals("N")||number5.equals("n")){
            System.out.print("Is the number 2? ");
            String two = myScanner.nextLine();
                if (two.equals("Y")||two.equals("y")){
                System.out.println("YAY!");}
        }
    }
}
}
else if (number1.equals("N")||number1.equals("n")){
System.out.print("Is the number divisible by 3? ");
String number6 = myScanner.nextLine();
    if (number6.equals("Y")||number6.equals("y")){
    System.out.print("Is the number divided by 3 greater than 1? ");
    String number9 = myScanner.nextLine();
        if (number9.equals("Y")||number9.equals("y")){
        System.out.print("Is the number 9? ");
        String nine = myScanner.nextLine();
            if (nine.equals("Y")||nine.equals("y")){
                System.out.println("YAY!");}
        }
        else if (number9.equals("N")||number9.equals("n")){
        System.out.print("Is the number 3? ");
        String three = myScanner.nextLine();
            if (three.equals("Y")||three.equals("y")){
                System.out.println("YAY!");}
    }
    }
    else if (number6.equals("N")||number6.equals("n")){
    System.out.print("Is the number greater than 6? ");
    String number7 = myScanner.nextLine();
        if (number7.equals("Y")||number7.equals("y")){
        System.out.print("Is the number 7? ");
        String seven = myScanner.nextLine();
            if (seven.equals("Y")||seven.equals("y")){
                System.out.println("YAY!");}
        }
        else if (number7.equals("N")||number7.equals("n")){
        System.out.print("Is it less than 3? ");
        String number8 = myScanner.nextLine();
            if (number8.equals("Y")||number8.equals("y")){
            System.out.print("Is the number 1? ");
            String one = myScanner.nextLine();
                if (one.equals("Y")||one.equals("y")){
                System.out.println("YAY!");}
            }
            else if (number8.equals("N")||number8.equals("n")){
            System.out.print("Is the number 5? ");
            String five = myScanner.nextLine();
                if (five.equals("Y")||five.equals("y")){
                System.out.println("YAY!");}
            }
            }
        }
        }
else{
    System.out.println("That is not a valid input.");
}
    } //end of main method
} //end of class

