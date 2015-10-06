/////////////////////////////////////////////////
//Ayman Zeine
//CSE 2
//This program produces a Bar Graph based off user input depicting their spending in one week
import java.util.Scanner;
public class BarGraph{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    double Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    System.out.println("Input expenses for the week");
    
    //Monday
    System.out.print("Expenses for Monday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Monday = input.nextDouble();
      if(Monday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Monday < 0);
    
    //Tuesday
    System.out.print("\nExpenses for Tuesday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Tuesday = input.nextDouble();
      if(Tuesday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Tuesday < 0);
    
    //Wednesday
    System.out.print("\nExpenses for Wednesday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Wednesday = input.nextDouble();
      if(Wednesday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Wednesday < 0);
    
    //Thursday
    System.out.print("\nExpenses for Thursday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Thursday = input.nextDouble();
      if(Thursday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Thursday < 0);
    
    //Friday
    System.out.print("\nExpenses for Friday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Friday = input.nextDouble();
      if(Friday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Friday <= 0);
    
    //Saturday
    System.out.print("\nExpenses for Saturday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Saturday = input.nextDouble();
      if(Saturday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Saturday < 0);
    
    //Sunday
    System.out.print("Expenses for Sunday: ");
    do{
      while (!input.hasNextDouble()) {
        System.out.print("Sorry you did not enter an integer. Try again: ");
        input.next();
      }
      Sunday = input.nextDouble();
      if(Sunday < 0)
        System.out.print("Please enter a positive number: ");
    }while (Sunday < 0);
    
    System.out.println();
    
    //converting input to amount of stars in graph
    int starMon = (int) Math.round(Monday);
    int starTues = (int) Math.round(Tuesday);
    int starWed = (int) Math.round(Wednesday);
    int starThurs = (int) Math.round(Thursday);
    int starFri = (int) Math.round(Friday);
    int starSat = (int) Math.round(Saturday);
    int starSun = (int) Math.round(Sunday);
    
    //printing stars in graph
    //Monday
    System.out.print("Mon:  ");
    for(int i=0; i< starMon; i++){
      System.out.print("*");
    }
    System.out.println();
    //Tuesday
    System.out.print("Tues:  ");
    for(int i=0; i< starTues; i++){
      System.out.print("*");
    }
    System.out.println();
    //Wednesday
    System.out.print("Wed:  ");
    for(int i=0; i< starWed; i++){
      System.out.print("*");
    }
    System.out.println();
    //Thursday
    System.out.print("Thurs:  ");
    for(int i=0; i< starThurs; i++){
      System.out.print("*");
    }
    System.out.println();
    //Friday
    System.out.print("Fri:  ");
    for(int i=0; i< starFri; i++){
      System.out.print("*");
    }
    System.out.println();
    //Saturday
    System.out.print("Sat:  ");
    for(int i=0; i< starSat; i++){
      System.out.print("*");
    }
    System.out.println();
    //Sunday
    System.out.print("Sun:  ");
    for(int i=0; i< starSun; i++){
      System.out.print("*");
    }
    
    System.out.println();
    
    double average = (Monday + Tuesday + Wednesday + Thursday + Friday + Saturday + Sunday)/7;
    
    double projectionVar = Math.random()*41;
    if(projectionVar <= 20){
      projectionVar = -projectionVar;
    }
    else if(projectionVar > 20){
      projectionVar = projectionVar - 20;
    }
    
    double projectionWeek = projectionVar*average;
    double projectionYears = (projectionWeek*52)*4;
    
    //rounding to 2 decimals
    average = (int) (average * 100);
    average = average/100.0;
    
    projectionYears = (int) (projectionYears * 100);
    projectionYears = Math.abs(projectionYears/100.0);
    
    System.out.println("Your average weekly expenses are: $" + average);
    System.out.println("Estimated expenditure for 4 years: $" + projectionYears);
  }
}