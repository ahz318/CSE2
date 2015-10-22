import java.util.Scanner;
public class Area{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a shape to calculate it's area."); //prompting user to input shape
    
    String shapeInput = "";
    double triangleArea, rectangleArea, circleArea = 0;
    int choice = 0; //choice dictates which shape the user is inputting
    
    while(choice < 1){ //checking if shape is correct
      System.out.println("Available shapes are: triangle, rectangle, circle.");
      System.out.print("Enter the shape to calculate it's area: ");
      shapeInput = input.next();
      choice = shape(shapeInput);
      if(choice == 0){
        System.out.println("Error incorrect input, try again.");
        input.next();
      }
    }
    
    //initalizing variables for area calulations
    
    //checking input and printing according areas
    switch(choice){
        case 1:
            triangleArea = triangle();
            System.out.println("triangle area is " + triangleArea);
            break;
        case 2:
            rectangleArea = rectangle();
            System.out.println("rectangle area is " + rectangleArea);
            break;
        case 3:
            circleArea = circle();
            System.out.println("circle area is " + circleArea);
            break;
        default:
            break;
    }
    
  }
  public static int shape(String x){
    Scanner input = new Scanner(System.in);
      
      switch(x){
        case "triangle":
          return 1;
        case "rectangle":
          return 2;
        case "circle":
          return 3;
        default:
          return 0;
      }
  }
  
  
  public static double triangle(){ //triangle area
  
    Scanner input = new Scanner(System.in);
    
    double base = 0;
    double height = 0;
    boolean correct = false;
    
    System.out.print("Enter the measurement of the base: ");
//ensuring correct input for base and height
    while(!correct){ //checking for correct input
      if(input.hasNextDouble()){
        correct = true;
        base = input.nextDouble(); //input correct double
      }
      else{
        System.out.println("Error: Not a double");
        System.out.print("Enter a double for base: ");
        input.next();
      }
    }
    
    correct = false; //ressetting loop checker
    
    System.out.print("Enter the measurement of the height: ");    
    //correct input for height
    while(!correct){ //checking for correct input
      if(input.hasNextDouble()){
        correct = true;
        height = input.nextDouble(); //input correct double
      }
      else{
        System.out.println("Error: Not a double.");
        System.out.print("Enter an double for height: ");
        input.next();
      }
    }
    double triangleArea = base*height/2.0;
    return triangleArea;
    
  }
  public static double rectangle(){ //rectangle area
    Scanner input = new Scanner(System.in);
    
    double rectangleArea = 0;
    double length = 0;
    double width = 0;
    boolean correct = false;
    
    System.out.print("Enter the measurement of the length: ");
//ensuring correct input for length & width
    while(!correct){ //checking for correct input
      if(input.hasNextDouble()){
        correct = true;
        length = input.nextDouble(); //input double
      }
      else{
        System.out.println("Error: Not a double");
        System.out.print("Enter a double for length: ");
        input.next(); //input correct double
      }
    }
    
    correct = false; //ressetting loop checker
    
    System.out.print("Enter the measurement of the width: ");
    //correct input for width    
    while(!correct){ //checking for correct input
      if(input.hasNextDouble()){
        correct = true;
        width = input.nextDouble(); //input double
      }
      else{
        System.out.println("Error: Not a double.");
        System.out.print("Enter an integer for width: ");
        input.next(); //input correct double
      }
    }
    
    rectangleArea = length*width;
    
    return rectangleArea;
  }
  public static double circle(){ //circle area
    Scanner input = new Scanner(System.in);
    
    double circleArea = 0;
    double radius = 0;
    
    boolean correct = false;
//ensuring correct input for radius
    while(!correct){ //checking for correct input
      if(input.hasNextDouble()){
        radius = input.nextDouble(); //input double
        correct = true;
      }
      else{
        System.out.println("Error: Not a double");
        System.out.print("Enter a double for radius: ");
        input.next(); //input correct double
      }
    }
    
    double pi = 3.14159265;
    circleArea = pi*radius*radius;
    
    return circleArea;
  }
  
}