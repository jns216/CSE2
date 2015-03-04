//Jillian Saydah
//lab 06
//Feb 27 2015
//Smile Generator

public class SmileGenerator{
    public static void main(String[] args){
//print 5 smiley faces using for loop
int counter = 0;
for ( counter = 0; counter < 5; counter++ ) {
    System.out.print(":)");
}
System.out.println();

//print out 5 smiley faces using while loop 
int counter1 = 0;
while (counter1 < 5){
	System.out.print(":)");
	counter1++;
}
System.out.println();

//print 5 smileys using do while loop
int counter2 = 0;
do {
System.out.print(":)");
  counter2++;
      }while(counter2 < 5);
System.out.println();

/*Create a second loop to print out 
a random number of smiley faces using “math.random()”*/
int counterRand = (int)(Math.random()*99)+ 1;
int counter3 = 0;
while (counter3 < counterRand){
  System.out.print(":)");
  counter3++;
  if (counter3%30==0){
    System.out.println();
  }

}
System.out.println();

//loop that increases the number of smiley faces on each line 
//by one for every new line that is used
int row, smiley1;
    for (row = 1; row <= 4; row++) {
      for(smiley1 = 1; smiley1 <= row; smiley1++) {
        System.out.print(":)");
      }
      System.out.println();
    }

    }//end main method
}//end class