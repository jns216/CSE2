//import Scanner as we require it.
import java.util.Scanner;
 
// the name of our class its public
public class practice {
    //void main
        public static void main (String[] args)
        {
            //declare int
            int i=1,no,fact=1;
 
            //Declare input as scanner
            Scanner input = new Scanner(System.in);
 
            //Take input
             System.out.println("Enter Number :");
             no = input.nextInt();
 
            //while loops
            while(i<=no)
            {
            fact=fact*i;
            i++;
            }
 
            System.out.println("Factorial = "+fact);
        }
}