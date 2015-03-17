//hw07 
//Jillian Saydah
//Due 3/17/15

import java.util.Scanner; //import the Scanner class
public class waves {
    //main method required for every Java program
    public static void main(String[] args) {
Scanner myScanner;
myScanner = new Scanner ( System.in );

System.out.print("Enter a number between 1 and 30: ");
int number = myScanner.nextInt ();

//for loop
System.out.println("FOR LOOP");
int counter, digit, i;
  for (i= 1; i<=number; i++){
    if (i%2==0){
      for (counter = 1; counter <= i; counter++) {
        for(digit = 1; digit <= counter; digit++) {
         System.out.print(i);
        }
        System.out.println();
      }
    }
   else {
      for (counter = i; counter >= 1; counter--) {
        for(digit = 1; digit <= counter; digit++) {
          System.out.print(i);
        }
        System.out.println();
      }
    }
  }
  
//while loop
System.out.println("WHILE LOOP");
int counter1=0;
int j=1;
int digit1=1;
  while (j <= number){
	  if (j%2==0) {
	    counter1=1;
	    while (counter1<=j){
	      digit1=1;
	      while (digit1<=counter1){
	        System.out.print(j);
	        digit1++;
	      }
	      counter1++;
	      System.out.println();
	    }
	  }
	  else {
	    counter1=j;
	    while (counter1>=1){
	      digit1=1;
	      while (digit1<=counter1){
	        System.out.print(j);
	        digit1++;
	      }
	      counter1--;
	      System.out.println();
	    }
	  }
	  j++;
  }
System.out.println();

//do-while loop
System.out.println("DO-WHILE LOOP");
int counter2=0;
int k=1;
int digit2=1;

do {
    if (k%2==0){
      counter2=1;
      do{
        digit2=1;
        do{
        System.out.print(k);
        digit2++;
        }while (digit2<=counter2);
      System.out.println();
      counter2++;
      }while (counter2<=k);
    }
    else {
      counter2=k;
      do{
        digit2=1;
        do{
        System.out.print(k);
        digit2++;
        }while (digit2<=counter2);
      System.out.println();
      counter2--;
      }while (counter2>=1);
    }
    k++;
}while (k<=number);

}//end main method
}//end class
