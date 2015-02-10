///////////////////
//Jillian Saydah
//hw03
//February 10, 2015
//Bicycle Java Program
//This program computes and prints out the distance traveled and the average miles per hour on a bicycle

import java.util.Scanner; //import the Scanner class
public class Bicycle {
    //main method required for every Java program
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner ( System.in );

System.out.print("Enter the number of seconds : ");
int nSeconds = myScanner.nextInt ();
System.out.print("Enter the number of counts : ");
int nCounts = myScanner.nextInt ();

double wheelDiameter=27.0; //the diameter of the wheel
double PI=3.14159; //the value of pi
double feetPerMile=5280; //the number of feet in a mile
double inchesPerFoot=12; //the number of inches in a foot
double secondsPerMinute=60; //the number of seconds per minute
double minutesPerHour=60; //the number of minutes per hour
double nMinutes=nSeconds/secondsPerMinute; //the number of minutes
double nHours=nMinutes/minutesPerHour; //the number of seconds
double distanceTrip=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //the distance of the trip in miles
double avgMph=distanceTrip/nHours;

System.out.println("The distance was " + (double)Math.round(distanceTrip*100)/100 + " miles and took " + (double)Math.round((nMinutes*100)/100) + " minutes.");
System.out.println("The average mph was " + (double)Math.round(avgMph*100)/100 + ".");

    } //end of main method
    
} //end of class