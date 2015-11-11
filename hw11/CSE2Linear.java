// Ayman Zeine
// 11/10/2015
// This program utilizes linear and binary search to find numbers in arrays. It also shows how to 
import java.util.Scanner;
public class CSE2Linear{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int finalGrades[] = new int[15]; //initialiing array
    
    //prompting user to input values
    System.out.print("Enter 15 ints for final grades in CSE2: ");
    
    boolean correct = false; //loop control
    
    for(int i = 0; i < finalGrades.length; i++){
      while(!correct){
        if(input.hasNextInt()){
          finalGrades[i] = input.nextInt();
          correct = true;
          if(finalGrades[i] > 100 || finalGrades[i] < 0){
            System.out.println("Invalid number please enter a number between 0-100");
            input.next();
          }
        }
        else{
          System.out.println("Error: Not an integer, please enter an int");
          input.next();
        }
      }
      correct = false;
    }
    
    sortArray(finalGrades); //sorting the array within the method
    
    
    //Displaying array
    System.out.print("Sorted array: ");
    for(int a = 0; a < finalGrades.length; a++){
      System.out.print(finalGrades[a] + " ");
    }
    System.out.println();
    
    System.out.print("Enter a search for: "); //prompting the user to search for a number
    int searchValue1 = input.nextInt();
    
    binarySearch(finalGrades, searchValue1); //Binary Search
    
    System.out.println("Scrambled Array:"); //Scrambling array
    Scramble(finalGrades);
    
    //Displaying scrambled array
    for(int a = 0; a < finalGrades.length; a++){
      System.out.print(finalGrades[a] + " ");
    }
    System.out.println();
    
    System.out.print("Enter a grade to search for: "); //second search value for linear search
    int searchValue2 = input.nextInt();
    
    linearSearch(finalGrades, searchValue2);
    
  }
  
  public static int[] sortArray(int[] array){ //Sorting the array
    
    int[] newArray = array; //constructing new sorted array
    
    for(int j = 0; j < newArray.length-1; j++){
      
      int currentMin = newArray[j]; //current minimum value
      int currentMinIndex = j; //current minimum index
      
      for(int k = j+1; k < newArray.length; k++){
        if(currentMin > newArray[k]){
          //swap
          currentMin = newArray[k]; 
          currentMinIndex = k;
        }
      }
      if(currentMinIndex != j){ //if current minimum indexes are not the same, swap
        newArray[currentMinIndex] = newArray[j];
        newArray[j] = currentMin;
      }
      
    }
    return newArray;
  }
  
  public static void linearSearch(int[] list, int key){ 
    
    int iterations = 0;
    boolean targetCheck = false;
    for(int i = 0; i < list.length; i++){
      if(key == list[i]){
        iterations++;
        targetCheck = true;
        break;
      }
      else{
        iterations++;
      }
    }
      if(targetCheck == true){ //target was found
        System.out.println(key + " was found in the list with " + iterations + " iterations");
      }
      else{ //target was not found
        System.out.println(key + " was not found in the list with " + iterations + " iterations");
      }
    }
  
  public static void binarySearch(int[] list, int key){
    
    int low = 0;
    int high = list.length-1;
    int iterations = 0;
    
    while(high >= low){
      int middle = (low+high)/2;
      if(key < list[middle]  && list[middle] != key){
        high = middle - 1;
      }
      else{
        low = middle + 1;
      }
      iterations++;
    }
    if(high < low){ //not found
      System.out.println(key + " was not found in the list with " + iterations + " iterations");
    }
    else{ //found
      System.out.println(key + " was found in the list with " + iterations + " iterations");
    }
  }
  
  public static int[] Scramble(int[] array){
    
    int newArray[] = array; //constructing new scrambled array
    
    for(int i = newArray.length-1; i > 0; i--){
      
      //Generate an index j randomly w 0<=j<=i
      int j = (int)(Math.random()*(i+1));
      
      //Swap the original number with the random index
      int tempValue = newArray[i];
      newArray[i] = newArray[j];
      newArray[j] = tempValue;
    }
    return newArray;
  }
  
}