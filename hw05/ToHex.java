/*Jillian Saydah
HW 05- To Hex
Due: February 24, 2015

This homework takes decimal RGB values (three inputs) and convert them to hexadecimal
*/

//input Scanner
import java.util.Scanner;
//define class
public class ToHex{
    //add main method
    public static void main(String[] args){

Scanner myScanner=new Scanner(System.in);

//prompt the used to enter three numbers representing RGB values
System.out.print("Enter three numbers representing RGB values: ");
int number1=myScanner.nextInt();
int number2=myScanner.nextInt();
int number3=myScanner.nextInt();

//divide input by 16
int number1By16=number1/16;
int number2By16=number2/16;
int number3By16=number3/16;
//find the remainder
int number1Remainder=number1%16;
int number2Remainder=number2%16;
int number3Remainder=number3%16;

if ((number1>=0)&&(number2>=0)&&(number3>=0)&&(number1<=255)&&(number2<=255)&&(number3<=255)){
    System.out.print("The decimal numbers R: "+number1+", G: "+number2+", B: "+number3+ ", is represented in hexadecimal as: ");

switch (number1By16){
    case 0:
        System.out.print("0");
        break;
    case 1:
        System.out.print("1");
        break;
    case 2:
        System.out.print("2");
        break;
    case 3:
        System.out.print("3");
        break;
    case 4:
        System.out.print("4");
        break;
    case 5:
        System.out.print("5");
        break;
    case 6:
        System.out.print("6");
        break;
    case 7:
        System.out.print("7");
        break;
    case 8:
        System.out.print("8");
        break;
    case 9:
        System.out.print("9");
        break;
    case 10:
        System.out.print("A");
        break;
    case 11:
        System.out.print("B");
        break;
    case 12:
        System.out.print("C");
        break;
    case 13:
        System.out.print("D");
        break;
    case 14:
        System.out.print("E");
        break;
    case 15:
        System.out.print("F");
        break;
}
switch (number1Remainder){
    case 0:
        System.out.print("0");
        break;
    case 1:
        System.out.print("1");
        break;
    case 2:
        System.out.print("2");
        break;
    case 3:
        System.out.print("3");
        break;
    case 4:
        System.out.print("4");
        break;
    case 5:
        System.out.print("5");
        break;
    case 6:
        System.out.print("6");
        break;
    case 7:
        System.out.print("7");
        break;
    case 8:
        System.out.print("8");
        break;
    case 9:
        System.out.print("9");
        break;
    case 10:
        System.out.print("A");
        break;
    case 11:
        System.out.print("B");
        break;
    case 12:
        System.out.print("C");
        break;
    case 13:
        System.out.print("D");
        break;
    case 14:
        System.out.print("E");
        break;
    case 15:
        System.out.print("F");
        break;
}
switch (number2By16){
    case 0:
        System.out.print("0");
        break;
    case 1:
        System.out.print("1");
        break;
    case 2:
        System.out.print("2");
        break;
    case 3:
        System.out.print("3");
        break;
    case 4:
        System.out.print("4");
        break;
    case 5:
        System.out.print("5");
        break;
    case 6:
        System.out.print("6");
        break;
    case 7:
        System.out.print("7");
        break;
    case 8:
        System.out.print("8");
        break;
    case 9:
        System.out.print("9");
        break;
    case 10:
        System.out.print("A");
        break;
    case 11:
        System.out.print("B");
        break;
    case 12:
        System.out.print("C");
        break;
    case 13:
        System.out.print("D");
        break;
    case 14:
        System.out.print("E");
        break;
    case 15:
        System.out.print("F");
        break;
}
switch (number2Remainder){
    case 0:
        System.out.print("0");
        break;
    case 1:
        System.out.print("1");
        break;
    case 2:
        System.out.print("2");
        break;
    case 3:
        System.out.print("3");
        break;
    case 4:
        System.out.print("4");
        break;
    case 5:
        System.out.print("5");
        break;
    case 6:
        System.out.print("6");
        break;
    case 7:
        System.out.print("7");
        break;
    case 8:
        System.out.print("8");
        break;
    case 9:
        System.out.print("9");
        break;
    case 10:
        System.out.print("A");
        break;
    case 11:
        System.out.print("B");
        break;
    case 12:
        System.out.print("C");
        break;
    case 13:
        System.out.print("D");
        break;
    case 14:
        System.out.print("E");
        break;
    case 15:
        System.out.print("F");
        break;
}
switch (number3By16){
    case 0:
        System.out.print("0");
        break;
    case 1:
        System.out.print("1");
        break;
    case 2:
        System.out.print("2");
        break;
    case 3:
        System.out.print("3");
        break;
    case 4:
        System.out.print("4");
        break;
    case 5:
        System.out.print("5");
        break;
    case 6:
        System.out.print("6");
        break;
    case 7:
        System.out.print("7");
        break;
    case 8:
        System.out.print("8");
        break;
    case 9:
        System.out.print("9");
        break;
    case 10:
        System.out.print("A");
        break;
    case 11:
        System.out.print("B");
        break;
    case 12:
        System.out.print("C");
        break;
    case 13:
        System.out.print("D");
        break;
    case 14:
        System.out.print("E");
        break;
    case 15:
        System.out.print("F");
        break;
}
switch (number3Remainder){
    case 0:
        System.out.print("0");
        break;
    case 1:
        System.out.print("1");
        break;
    case 2:
        System.out.print("2");
        break;
    case 3:
        System.out.print("3");
        break;
    case 4:
        System.out.print("4");
        break;
    case 5:
        System.out.print("5");
        break;
    case 6:
        System.out.print("6");
        break;
    case 7:
        System.out.print("7");
        break;
    case 8:
        System.out.print("8");
        break;
    case 9:
        System.out.print("9");
        break;
    case 10:
        System.out.print("A");
        break;
    case 11:
        System.out.print("B");
        break;
    case 12:
        System.out.print("C");
        break;
    case 13:
        System.out.print("D");
        break;
    case 14:
        System.out.print("E");
        break;
    case 15:
        System.out.print("F");
       break;
    }
}
else {
    System.out.println("Your input is not valid");
}
}//end main method
}//end class