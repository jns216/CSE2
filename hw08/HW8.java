//Homework 8
//Jillian Saydah
//Due 3/24/15
//Practice in writing methods, overloading methods, and in forcing the user to enter good input
import java.util.Scanner;

public class HW8{

    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    public static void box(){
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    public static String getInput(Scanner scan, String string){
        String inputC=scan.next();
        if (inputC.length()==1){
            if (string.charAt(0)==inputC.charAt(0) || string.charAt(1)==inputC.charAt(0)){
            }

        else {
            System.out.println("Yea right LOSER!");
            System.exit (0);
        }
        }
    return string;
    }
    public static String getInput(Scanner scan, String string, int trial){
        
        int counterHit=0;
        while (counterHit<=trial) { 
            String inputA=scan.next();
            if (inputA.length()==1){
                if (string.charAt(0)==inputA.charAt(0) || string.charAt(1)==inputA.charAt(0)){
                    int hitMiss= (int)(Math.random()*2);
                    if (hitMiss==0){
                        System.out.println("Critical Hit!");
                        counterHit++;
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                    else {
                        System.out.println("Gosh! How can you miss it?");
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                }
                else if (string.charAt(2)==inputA.charAt(0) || string.charAt(3)==inputA.charAt(0)){
                    int escape= (int)(Math.random()*11);
                    if (escape==10){
                        return string;
                    }
                    else {
                       System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                }
                else{
                   System.out.println("Executed by the GIANT! Game Over!");
                    System.exit(0); 
                }
            }
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
        }
        return string;
    }
    public static String getInput(Scanner scan){
        
        if (scan.hasNextInt()){
            int box=scan.nextInt(); 
            switch(box){
                case 1:
                    System.out.println("$10");
                    break;
                case 2:
                    System.out.println("$0");
                    break;
                case 3:
                    System.out.println("$1,000");
                    break;
                default:
            }
        }
        else {
            System.out.println("You get nothing! Better restart the game LOL");
        }
    return "";
    }

}