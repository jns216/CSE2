//Jillian Saydah
//Due March 3, 2015
//HW 06-Make Numbers
//use do-while loops and the random number generator 
//to generate an integer between 0 and 100

//  define a class
public class MakeSymbols{
    
//  add main method
    public static void main(String[] args) {
        
int number=(int)(Math.random()*100);
String even="*";
String odd="&";
int count=1;

System.out.println("Random number generated: " +number);
if (number%2==0){
    do {
    System.out.print(even);
    count++;
    
}
    while (count<=number);
}

else if (number%2==1){
    do {
    System.out.print(odd);
    count++;
    
}
    while (count<=number);
}

}//end main method
}//end class