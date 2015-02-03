//
//James Mannherz
//CSE 002
// 2/3/15
//Homework 02
//Arithmetic
//The purpose of this homework is to practice manipulating data stored in variables
//running simple calculations and printing numerical outputs
//
//
//
//define a class
public class Arithmetic {

    //Define a method
    public static void main(String[] args) {
        
        //Input Variables
        int nSocks=3;  //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks
        
        int nGlasses=6;    //Number of glasses
        double glassCost$=2.29;  //cost per glass bought
        
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        double taxPercent=0.06; //tax percent on purchases
        
        double totalSockCost$; //total cost of socks
        double totalGlassCost$; //total cost of glasses
        double totalEnvelopeCost$; //total cost of envelope
        double salesTaxSockCost$; //sales tax for socks
        double salesTaxGlassCost$; //sales tax for glasses
        double salesTaxEnvelopeCost$; //sales tax for envelopes
        double totalCostBeforeTax$; //total cost before tax
        double totalCostoftransaction$; //total cost with sales tax
        
        totalSockCost$=nSocks*sockCost$;  //equation for total sock cost
        totalGlassCost$=nGlasses*glassCost$; //equation for total glass cost
        totalEnvelopeCost$=nEnvelopes*envelopeCost$; //equation for total envelope cost
        salesTaxSockCost$=totalSockCost$*taxPercent; //equation for sales tax for socks
        salesTaxGlassCost$=totalGlassCost$*taxPercent; //equation for sales tax for glass
        salesTaxEnvelopeCost$=totalEnvelopeCost$*taxPercent; //equation for sales tax for envelope
        totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //equation for total cost before tax
        totalCostoftransaction$= (1+taxPercent)*(totalSockCost$+totalGlassCost$+totalEnvelopeCost$); //equation for total cost
        
        //print statements for desired value
        System.out.println("The items that were bought were Socks and "+nSocks+" were bought at a price of $"+sockCost$+" per sock pair");
        System.out.println("The items that were bought were Glasses and "+nGlasses+"  were bought at a price of $"+glassCost$+" per glass");
        System.out.println("The item that was bought was an envelope and "+nEnvelopes+"  were bought at a price of $"+envelopeCost$+" per envelope ");
        //print statements for desired values    
        System.out.printf("The Cost of the socks was $%.2f and the sales tax was $%.2f\n", totalSockCost$, salesTaxSockCost$);
        System.out.printf("The Cost of the glasses was $%.2f and the sales tax was $%.2f\n", totalGlassCost$, salesTaxGlassCost$);
        System.out.printf("The Cost of the envelopes was $%.2f and the sales tax was $%.2f\n", totalEnvelopeCost$, salesTaxEnvelopeCost$);
        System.out.printf("The Total Cost before tax was $%.2f\n", totalCostBeforeTax$);
        System.out.printf("The Total Cost of the purchase was $%.2f\n", totalCostoftransaction$);
        
        
        
        
    }// close main method
}//close the class