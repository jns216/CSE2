//Lab 9
//Methods
//Jillian Saydah

import java.util.Random;
import java.util.Scanner;
public class lab9 {
    
    public static String adjective (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String adj= "";
        switch(randomInt){
        case 0:
            adj = "helpless";
        break;
        case 1:
            adj = "ordinary";
        break;
        case 2:
            adj = "detailed";
        break;
        case 3:
            adj = "angry";
        break;
        case 4:
            adj = "grumpy";
        break;
        case 5:
            adj = "happy";
        break;
        case 6:
            adj = "blue";
        break;
        case 7:
            adj = "crazy";
        break;
        case 8:
            adj = "pretty";
        break;
        case 9:
            adj = "sincere";
        break;
        }
        return adj;
    }//end adjective method
    public static String subject (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String sub= "";
        switch(randomInt){
        case 0:
            sub = "cat";
        break;
        case 1:
            sub = "man";
        break;
        case 2:
            sub = "girl";
        break;
        case 3:
            sub = "we";
        break;
        case 4:
            sub = "fox";
        break;
        case 5:
            sub = "boy";
        break;
        case 6:
            sub = "person";
        break;
        case 7:
            sub = "Mom";
        break;
        case 8:
            sub = "Grandpa";
        break;
        case 9:
            sub = "baby";
        break;
        }
        return sub;
    }//end subject method
    public static String verb (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String vb= "";
        switch(randomInt){
        case 0:
            vb = "runs";
        break;
        case 1:
            vb = "walks";
        break;
        case 2:
            vb = "cries";
        break;
        case 3:
            vb = "sleeps";
        break;
        case 4:
            vb = "follows";
        break;
        case 5:
            vb = "refuses";
        break;
        case 6:
            vb = "talks";
        break;
        case 7:
            vb = "yells";
        break;
        case 8:
            vb = "sighs";
        break;
        case 9:
            vb = "eats";
        break;
        }
        return vb;
    }//end verb method
    public static String object (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String obj= "";
        switch(randomInt){
        case 0:
            obj = "van";
        break;
        case 1:
            obj = "restaurant";
        break;
        case 2:
            obj = "house";
        break;
        case 3:
            obj = "person";
        break;
        case 4:
            obj = "museum";
        break;
        case 5:
            obj = "bottle";
        break;
        case 6:
            obj = "phone";
        break;
        case 7:
            obj = "leaf";
        break;
        case 8:
            obj = "bank";
        break;
        case 9:
            obj = "sun";
        break;
        }
        return obj;
    }//end object method
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int answer;
        do{
        System.out.println("The " +adjective()+" "+adjective()+" "+subject()+" "+verb()+ " the "+adjective()+" "+object()+ ".");
        System.out.println("Would you like another sentence? Input 1 for yes, 0 for no.");
        answer = scan.nextInt();
        } while(answer==1);
    }//end main method
}//end class