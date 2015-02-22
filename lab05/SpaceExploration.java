//Jillian Saydah
//lab05- Space Exploration
//This program outputs a timeline of significant space exploration advances from 2000 to 2010
//use a random number generator to select a year within that decade
//then output all events in the timeline that have occurred from 2000 up until the year that has been randomly selected

//define a class
public class SpaceExploration {
    //add main method
    public static void main(String[] args){
        
int year=(int)(Math.random()*11 + 2000);

System.out.println("Here is a timeline of space exploration events from 2000 to " + year + ": ");

switch(year){
    case 2000: 
    System.out.println("2000: First spacecraft orbits an asteroid");
    break;
    case 2001:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    break;
    case 2002:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    break;
    case 2003:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    break;
    case 2004: 
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    break;
    case 2005:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    System.out.println("2005: Spacecraft collies with comet");
    break;
    case 2006: 
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    System.out.println("2005: Spacecraft collies with comet");
    System.out.println("2006: Spacecraft returns with collections from a comet");
    break;
    case 2007:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    System.out.println("2005: Spacecraft collies with comet");
    System.out.println("2006: Spacecraft returns with collections from a comet");
    System.out.println("2007: N/A");
    break;
    case 2008:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    System.out.println("2005: Spacecraft collies with comet");
    System.out.println("2006: Spacecraft returns with collections from a comet");
    System.out.println("2007: N/A");
    System.out.println("2008: Kepler launched to study deep space");
    break;
    case 2009:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    System.out.println("2005: Spacecraft collies with comet");
    System.out.println("2006: Spacecraft returns with collections from a comet");
    System.out.println("2007: N/A");
    System.out.println("2008: Kepler launched to study deep space");
    System.out.println("2009: N/A");
    break;
    case 2010:
    System.out.println("2000: First spacecraft orbits an asteroid");
    System.out.println("2001: First spacecraft lands on asteroid");
    System.out.println("2002: N/A");
    System.out.println("2003: Largest infrared telescope released");
    System.out.println("2004: N/A");
    System.out.println("2005: Spacecraft collies with comet");
    System.out.println("2006: Spacecraft returns with collections from a comet");
    System.out.println("2007: N/A");
    System.out.println("2008: Kepler launched to study deep space");
    System.out.println("2009: N/A");
    System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
    break;
    default:
}

    }
    
}