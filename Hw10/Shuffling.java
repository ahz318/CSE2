//Ayman Zeine
//HW 10 Shuffling
//This program will produce a deck of cards, display them. Shuffle the deck, and display it and then produce a randomly generated hand of 5 cards.
import java.util.Scanner;
public class Shuffling{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    //suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    
    for (int i=0; i<52; i++){
      cards[i]=rankNames[i%13]+suitNames[i/13]; //assigning card values in initial array
    }
    
    printArray(cards);
    shuffle(cards);
    printArray(cards);
    hand = randomizeHand(cards);
    printArray(hand);
  }
  
  public static void printArray(String[] a){ //printing intial array of cards
    for (int i=0; i< a.length; i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
  
  public static void shuffle(String[] b){ //shuffles deck
    for(int q = 0; q < 70; q++){ //shuffles deck 70 times
      for(int i = 0; i < b.length; i++){
        int index = (int)(Math.random()*51 + 1);
        //simple swap of the array cards[]
        String a = b[index]; //assigning a as a random card from cards[]
        b[index] = b[i]; //assigns the random card selected as the current value of i
        b[i] = a; //swaps the values of the randomly chosen card with the current card (i)
      }
    }
    System.out.println("Shuffled");
  }
  
  public static String[] randomizeHand(String[] c){ //gives a randomized hand
    System.out.println("Randomized hand");
    String tempHand[] = new String[5]; //declaring a temporary hand for display
    for(int i = 0; i < tempHand.length; i++){
      int randoCard = (int)(Math.random()*51 + 1); //creating a random number to select a random card
      tempHand[i] = c[randoCard]; //assigning random card to hand
    }
    return tempHand;
  }
  
}
