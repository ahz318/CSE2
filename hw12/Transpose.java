//Ayman Zeine
//This program creates transposes and prints matrices
//hw11
//Tuesday 17th November, 2015
import java.util.Scanner;

public class Transpose{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    boolean correct = false; //loop control
    int height = 0;
    int width = 0;
    
    do{
      System.out.print("Enter an int for the number of rows in your matrix: ");
      while(!correct){ //filtering input to only accept correct values
        if(input.hasNextInt()){
          height = input.nextInt();
          correct = true;
          if(height > 10 || height < 0){ //checking for correct interval
            System.out.println("Your input must be between -10 and 10. try again: ");
            input.next();
          }
        }
        else{
          System.out.print("Error not an integer, try again: ");
          input.next();
        }
      }
      correct = false; //resetting loop checker
      
      System.out.println("Enter an int for number of columns in your matrix: ");
      while(!correct){ //filtering input to only accept correct values
        if(input.hasNextInt()){
          width = input.nextInt();
          correct = true;
          if(width > 10 || width < 0){ //checking for correct interval
            System.out.println("Your input must be between -10 and 10. try again: ");
            input.next();
          }
        }
        else{
          System.out.print("Error not an integer, try again: ");
          input.next();
        }
      }
      if(width == height){
        System.out.println("The matrix is a square, to see a transposed matrix, use different numbers.");
      }
      
    }while(width == height);
    
    
    int[][] oMatrix = randomMatrix(height, width); //creating original matrix
    System.out.println("The Original matrix is: ");
    printMatrix(oMatrix); //printing
    
    System.out.println();
    
    int[][] tMatrix = transposeMatrix(oMatrix); //transposing name
    System.out.println("The transposed matrix is: ");
    printMatrix(tMatrix);
  }
  
  public static int[][] randomMatrix(int height, int width){
    int[][] number = new int[height][width]; //creating random matrix
    for(int i=0; i<height; i++){
      for(int j=0; j<width; j++){
        number[i][j] = (int)(Math.random()*20 - 10); //assigning random variables to matrix
      }
    }
    return number; //passing matrix numbers
  }
  
  public static void printMatrix(int[][] matrix){ 
    for(int i=0; i<matrix.length; i++){
      System.out.print("  ");
      for(int j=0; j<matrix[i].length; j++){
        System.out.print(matrix[i][j] + "  ");
      }
      System.out.println();
    }
  }
  
  public static int[][] transposeMatrix(int[][] matrix){
    int[][] temp = new int[matrix[0].length][matrix.length]; //creating new array to be passed
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        temp[j][i] = matrix[i][j]; //switching places of objects in matrix
      }
    }
    return temp; //passing transposed matrix
  }
}