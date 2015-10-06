///////////////////////
//Ayman Zeine
//CSE 2
//This program will scan a barcode of a book, perform calculations in order to determine if the ISBN is valid
import java.util.Scanner;
public class CheckDigit{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    String barcode;
    boolean looper = false; //loop control
    int sum = 0;
    int checkDigit;
    do{
      System.out.print("Please enter a 10 digit barcode: ");
      barcode = input.nextLine(); //inputting barcode
      
      if(barcode.length() < 10 || barcode.length() > 10){ //checking for barcode length
        looper = true;
        while(looper == true){ //beginning loop to ensure there are 10 digits
          System.out.print("That is not a valid ISBN. Please enter 10 digits: ");
          barcode = input.nextLine(); //resubmitting value
          if(barcode.length() == 10)
            looper = false; //terminate loop
        }
      }
      //finding the sum of the numbers
      for(int i = 0; i < barcode.length()-1;){ //controls what number in barcode is being used
        for(int j = 10; j > 1; j--){ //controls the number by which each barcode number will be multiplied by
          sum += Character.getNumericValue(barcode.charAt(i)) * j;
          i++;
        }
      }
      
      checkDigit = sum % 11;
      
      if(checkDigit == 10){
        checkDigit = (char) 'X';
      }
      if(Character.getNumericValue(barcode.charAt(9)) == (checkDigit)){ //Checking for valid end number
        System.out.println("This is a valid ISBN");
      }
      else{
        System.out.println("This is NOT a valid ISBN. Check digit should be " + checkDigit);
        checkDigit--;
      }
    }while(Character.getNumericValue(barcode.charAt(9)) != (checkDigit));
    
  }
}