//Ayman Zeine
//CSE 2
// 9/15/2015
import java.util.Scanner;
public class Block{
  public static void main(String[] args){
    //initializing scanner
    Scanner input = new Scanner(System.in);
    
    //collecting data
    System.out.print("Enter the length of the block: ");
    double length = input.nextDouble();
    
    
    System.out.print("Enter the width of the block: ");
    double width = input.nextDouble();
    
    
    System.out.print("Enter the height of the block: ");
    double height = input.nextDouble();
    
    //initializing volume
    double volume = length * width * height;
    double surfaceArea = (2 * width * height) + (2 * length * height) + (2 * width * length);
    
    //printing results
    System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume);
    System.out.println("The surface area of the block is " + surfaceArea);
    
    
    
  }
}