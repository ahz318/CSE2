//Ayman Zeine
public class CardGenerator{
 public static void main(String[] args){
  //generate random number between 1 and 52
  double card = (int) (Math.random() * 52 + 1);

  //creating String variables to represent card identities
  String suit = "";
  String identity = "";
  //if statements to seperate each suit
  if(card >= 1 && card <= 13){
    suit = "Diamonds";
  }
  else if(card >= 14 && card <= 26){
    suit = "Clubs";
  }
  else if(card >= 27 && card <= 39){
    suit = "Hearts";
  }
  else if(card >= 39 && card <= 52){
    suit = "Spades";
  }
  //create variable for card identity
  int cardID = (int) (card) % 13;
  
  //switch statements to determine card identity
  switch(cardID){
    case 0:
      identity = "King";
      break;
    case 1:
      identity = "Ace";
      break;
    case 2:
      identity = "2";
      break;
    case 3:
      identity = "3";
      break;
    case 4:
       identity = "4";
      break;
    case 5:
      identity = "5";
      break;
    case 6:
      identity = "6";
      break;
    case 7:
      identity = "7";
      break;
    case 8:
      identity = "8";
      break;
    case 9:
      identity = "9";
      break;
    case 10:
      identity = "10";
      break;
    case 11:
      identity = "Jack";
      break;
    case 12:
      identity = "Queen";
      break;
  }
  
  System.out.println("You picked the " + identity + " of " + suit);
  
 }
}