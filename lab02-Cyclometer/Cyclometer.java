///////////////////////////////
//Jillian Saydah
//January 30, 2015
//Lab 02
//Cyclometer Java Program

//Record 2 kinds of data
    //Time elapsed in seconds
    //Number of rotations of the front wheel
    
//This program will print the following
    //the number of minutes for each trip
    //the number of counts for each trip
    //the distance of each trip in miles
    //the distance for the two trips combined
    
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        
int secsTrip1=480; //the number of seconds for the trip 1
int secsTrip2=3220; //the number of seconds for trip 2
int countsTrip1=1561; //the counts for trip 1
int countsTrip2=9037; //the counts for trip 2

double wheelDiameter=27.0; //the diameter of the wheel
double PI=3.14159; //the value of pi
double feetPerMile=5280; //the number of feet in a mile
double inchesPerFoot=12; //the number of inches in a foot
double secondsPerMinute=60; //the number of seconds in a minute
double distanceTrip1; //the distance of trip 1
double distanceTrip2; //the distance of trip 2
double totalDistance; //the distance of both trips

System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + "minutes and had " + countsTrip1 + " counts.");
System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + "minutes and had " + countsTrip2 + " counts.");

//run the calculations. store the values
//
distanceTrip1=countsTrip1*wheelDiameter*PI;
//Above gives distance in inches
//(for each count, a rotation of the wheel travels the diameter in inches times PI)

distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;

//print out the output data.
System.out.println("Trip 1 was " +distanceTrip1+ " miles");
System.out.println("Trip 2 was " +distanceTrip2+ " miles");

    } //end of main method
} //end of class


    
