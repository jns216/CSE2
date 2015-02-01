////////////////////////
//Jillian Saydah
//hw02
//Arithmetic Java Program

//Record 2 kinds of data
    //Cost of items bought
    //Amount of sales tax
    
//This program will print the following
    //the item being bought, the quantity, and the cost of each item
    //the total cost of each item and the sales tax for that item
    //tht total cost of the purchases, the sales tax, and the total cost of the purchases with tax
    
//
public class Arithmetic {
    //main method required for every java program
    public static void main(String[] args) {
 
int nSocks=3; //Number of pairs of socks
double sockCost$=2.58; //Cost per pair of socks
int nGlasses=6; //Number of drinking glasses
double glassCost$=2.29; //Cost per glass
int nEnvelopes=1; //Number of boxes of envelopes
double envelopeCost$=3.25; //Cost per box of envelopes
double taxPercent=0.06; //PA sales tax 

double totalSockCost$; //Total cost of the socks
double totalSockTax$; //Sales tax for the total cost of the socks
double totalGlassCost$; //Total cost of the glasses
double totalGlassTax$; //Sales tax for the total cost of the glasses
double totalEnvelopeCost$; //Total cost of the envelopes
double totalEnvelopeTax$; //Sales tax for the total cost of the envelopes
double totalPurchaseCost$; //Total cost of the purchases before tax
double totalPurchaseTax$; //Sales tax for the total purchase cost
double totalAmountPaid$; //Total amount of the purchases including tax

System.out.println(nSocks + " socks were purchased at " + sockCost$ + " per sock." );
System.out.println(nGlasses + " glasses were purchased at " + glassCost$ + " per glass.");
System.out.println(nEnvelopes + " box of envelopes was purchased at " + envelopeCost$ + " per box.");

//Run the calculations. Store the values
totalSockCost$=(double)Math.round(nSocks*sockCost$*100)/100;
totalSockTax$=(double)Math.round(totalSockCost$*taxPercent*100)/100;
totalGlassCost$=(double)Math.round(nGlasses*glassCost$*100)/100;
totalGlassTax$=(double)Math.round(totalGlassCost$*taxPercent*100)/100;
totalEnvelopeCost$=(double)Math.round(nEnvelopes*envelopeCost$*100)/100;
totalEnvelopeTax$=(double)Math.round(totalEnvelopeCost$*taxPercent*100)/100;

//Print out the calculations
System.out.println("The total cost of the socks is $" + totalSockCost$ + ".");
System.out.println("The sales tax of the socks is $" + totalSockTax$ + ".");
System.out.println("The total cost of the glasses is $" + totalGlassCost$ + ".");
System.out.println("The sales tax of the glasses is $" + totalGlassTax$ + ".");
System.out.println("The total cost of the envelopes is $" + totalEnvelopeCost$ + ".");
System.out.println("The sales tax of the envelopes is $" + totalEnvelopeTax$ + ".");

//Run final calculations and print out
totalPurchaseCost$=(double)Math.round((totalSockCost$+totalGlassCost$+totalEnvelopeCost$)*100)/100;
totalPurchaseTax$=(double)Math.round(totalPurchaseCost$*taxPercent*100)/100;
totalAmountPaid$=(double)Math.round((totalPurchaseCost$+totalPurchaseTax$)*100)/100;

System.out.println("The total cost of the purchases before tax is $" + totalPurchaseCost$ + ".");
System.out.println("The total sales tax is $" + totalPurchaseTax$ + ".");
System.out.println("The total amount paid including tax is $" + totalAmountPaid$ + ".");


    }
}
