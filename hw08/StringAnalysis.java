//Ayman Zeine
//CSE 2
//This program will prompt the user to enter a string and then it will process the whole string or part of it based on what the user decides.
//The progam checks for if the String itself only contains letters and if it does then it is a valid string and vice versa.
import java.util.Scanner;
public class StringAnalysis{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    String inputString = ""; //default string
    int numProcess = 0; //default chosen length processing number
    char checker; //letter checker
    boolean processResult; //processor result
    
    System.out.print("Input the string you would like processed: ");
    inputString = input.nextLine(); //inputting user String
    
    
    System.out.println("Would you like to process the entire String? (y/n)");
    System.out.print("If not, enter the the number of characters to process: ");
    
    checker = input.next().charAt(0); //checking for answer to entire String or part

    switch(checker){
      case 'y': //checks entire string
        processResult = Check(inputString); //checking for result of entire string
        if(processResult == true){ //all letters
          System.out.println("The String is valid because it only contains letters.");
        }
        else{ //not all letters
          System.out.println("The String is invalid because it does not only contain letters.");
        }
        break;
      case 'n': //checks part of the string
        System.out.print("Enter the number of characters you would like to process: ");
      numProcess = input.nextInt(); //enters number of characters to check
      while(numProcess > inputString.length()){ //making sure user is inputting correct integer
        System.out.print("Number is larger than string length, choose smaller number: ");
        numProcess = input.nextInt(); //inputting number again in case of incorrect input
      }
      processResult = Check(numProcess, inputString); //checking result for part of string
      if(processResult == true){
          System.out.println("The String is valid because it only contains letters.");
        }
        else{
          System.out.println("The String is invalid because it does not only contain letters.");
        }
      break;
      default: //for inputs neither y or n
        System.out.print("Error: incorrect input. Enter (y/n): ");
        input.next();
        break;
    }
  }
  
  public static boolean Check(String x){ //checks entire string
    Scanner input = new Scanner(System.in);
    boolean validity = false;
    for(int i=0; i < x.length(); i++){ //checks each character individually
      if(Character.isLetter(x.charAt(i)) == false){
        validity = false;
      }
      else if(x.charAt(i) == ' '){ //checking for spaces
        validity = false;
      }
      else{
        validity = true;
      }
    }
    return validity; //returning result
  }
  
  public static boolean Check(int x, String y){ //checks part of string
    Scanner input = new Scanner(System.in);
    boolean validity = false;
    for(int i = 0; i < x-1; i++){ //checks each character individually until indicated number of characters
      if(Character.isLetter(y.charAt(i)) == false){
        validity = false;
      }
      else if(y.charAt(i) == ' '){ //checking for spaces
        validity = false;
      }
      else{
        validity = true;
      }
    }
    return validity; //returning result
  }
  
}