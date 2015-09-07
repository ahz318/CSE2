//Ayman Zeine 
//CSE 2
// 3/9/2015
public class Arithmetic{
    public static void main(String[] args){
        
        //delcare costs of items
        double sockCost$ = 2.58;
        double glassCost$ = 2.29;
        double envelopeCost$ = 3.25;
        double taxPercent = .06; //percentage of tax
        
        //declare number of items
        int nSocks = 3;
        int nGlasses = 6;
        int nEnvelopes = 1;
        
        //initializing total cost of items (excluding tax)
        double totalSockCost$ = (nSocks*sockCost$);
        double totalGlassCost$ = (nGlasses*glassCost$);
        double totalEnvelopeCost$ = (nEnvelopes*envelopeCost$);
        
        //finding cost of tax for each group of items
        double taxSockCost$ = totalSockCost$*taxPercent;
        double taxGlassCost$ = totalGlassCost$*taxPercent;
        double taxEnvelopeCost$ = totalEnvelopeCost$*taxPercent;
        
        //total cost of items w/out tax
        double totalCostExTax$ = totalSockCost$ + totalEnvelopeCost$ + totalGlassCost$;
        
        //total cost including tax
        double totalCost$ = (totalCostExTax$) + (taxSockCost$ + taxGlassCost$ + taxEnvelopeCost$);
        
        //formatting the numbers to 2 decimal places
        int totalItemCost$ = (int) (totalCost$ * 100);
        int totalItemCostExTax$ = (int) (totalCostExTax$ * 100);
        int totalGlass$ = (int) (totalGlassCost$ * 100);
        int totalSocks$ = (int) (totalSockCost$ * 100);
        int totalEnvelope$ = (int) (totalEnvelopeCost$ * 100);
        
        int taxSocks$ = (int) (taxSockCost$ * 100);
        int taxGlass$ = (int) (taxGlassCost$ * 100);
        int taxEnvelope$ = (int) (taxEnvelopeCost$ * 100);
        int taxTotal$ = (int) (taxSocks$ + taxGlass$ + taxEnvelope$);
        
        //Print cost of items
        System.out.println("Total cost of Socks including tax is $" + ((totalSocks$ + taxSocks$)/100.00) + " and $" + totalSocks$/100.0 + " excluding tax (being $" + taxSocks$/100.0 + ")" + " for " + nSocks + " pairs of socks.");
        System.out.println("Total cost of Glasses including tax is $" + ((totalGlass$ + taxGlass$)/100.0) + " and $" + totalGlass$/100.0 + " excluding tax (being $" + taxGlass$/100.0 + ")" + " for " + nGlasses + " glasses.");
        System.out.println("Total cost of Envelopes including tax is $" + ((totalEnvelope$ + taxEnvelope$)/100.0) + " and $" + totalEnvelope$/100.0 + " excluding tax (being $" + taxEnvelope$/100.0 + ")" + " for " + nEnvelopes + " envelope");
        
        //Print cost of all items
        System.out.println("The total cost of all the items including tax is $" + totalItemCost$/100.0 + " and $" + totalItemCostExTax$/100.0 + " excluding tax. (tax being $" + taxTotal$/100.0 + ")");
    }
}
