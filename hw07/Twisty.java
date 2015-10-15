import java.util.Scanner;

public class Twisty{
  public static void main(String[] args){
    
    System.out.print("Input your desired length: ");
    
//initializing Scanner    
    Scanner input = new Scanner(System.in);
    int length = 0;
    boolean correct = false; //loop control
    
//ensuring correct input for length & width
    while(!correct){ //checking for correct input
      if(input.hasNextInt()){
        length = input.nextInt(); //input double
        correct = true;
        if(length > 80){
          System.out.println("Number too large for program");
          System.out.print("Enter a smaller number: ");
          input.next();
        }
      }
      else{
        System.out.println("Error: Not an integer.");
        System.out.print("Enter an integer for length: ");
        input.next(); //input correct int
      }
    }
    int width = 0;
    System.out.print("Enter your desired width: ");
    
    correct = false; //resetting loop control
    
//correct input for width    
    while(!correct){ //checking for correct input
      if(input.hasNextInt()){
        width = input.nextInt(); //input int
        correct = true;
        if(width > 80){
          System.out.println("Number too large for program");
          System.out.print("Enter a smaller number: ");
          input.next();
        }
        else if(width > length){
          System.out.println("Error: Please input an integer smaller than the length.");
          System.out.print("Enter a smaller number: ");
          input.next();
        }
      }
      else{
        System.out.println("Error: Not an integer.");
        System.out.print("Enter an integer for length: ");
        input.next(); //input correct integer
      }
    }
    
    //begin loop printing
    int i = 0;
    int k = 0;
    
    for(i = 0; i < width; i++){
      for(k = 0; k < length; k++){
        if(k%((width*2)) == i){ //builds down '#'
          System.out.print("#");
        }
        else if((width-(k%(width*2))-1)%(width*2) == i){ //builds up '/'
          System.out.print("/");
          
        }
        else if(k%(2*width) - width == i){
          System.out.print("\\"); //builds down '\'
        }
        else if(((2*width)-(k%(2*width))-1) == i){
          System.out.print("#"); //builds up '#'
        }
        else{
          System.out.print(" ");
        }
        }//close for k
      System.out.println();
      }//close for i
    
  }
}