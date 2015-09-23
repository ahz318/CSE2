//Ayman Zeine
//CSE 2
// 9/15/2015
import java.util.Scanner;

public class Timer{
 public static void main(String[] args){
     
    //initialize scanner
    Scanner input = new Scanner(System.in);
    
    //collecting data
    System.out.print("Enter the current time: ");
    int currentTime = input.nextInt();

    System.out.print("Enter the time that will be eating dinner: ");

    int dinnerTime = input.nextInt();

    int hours, minutes;
    //calculations
    hours = (dinnerTime - currentTime)/100;
    minutes = dinnerTime - (hours*100 + currentTime);
    minutes = minutes%60;

    System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner");

 }
}