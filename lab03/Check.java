//Ayman Zeine
//9/11/2015
//CSE 2
import java.util.Scanner;
public class Check{
 public static void main(String[] args){

  //initializing Scanner
  Scanner myScanner = new Scanner(System.in);
  System.out.println("Enter the original cost of the check in the form xx.xx");

  double checkCost = myScanner.nextDouble();

  System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
  double tipPercent = myScanner.nextDouble();
  tipPercent /= 100;
  // converting the percent to a decimal

  System.out.print("Enter the number of people who went out to dinner");
  int numPeople = myScanner.nextInt();

  double totalCost;
  double costPerPerson;
  int dollars, dimes, pennies; //for storing digits to the right of the decimal point

  totalCost = checkCost * (1+tipPercent);
  costPerPerson = totalCost / numPeople;
  dollars = (int) costPerPerson;
  //get dimes amount
  dimes = (int) (costPerPerson * 10) % 10;
  pennies = (int) (costPerPerson * 100) % 10;

  System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);

 }
}