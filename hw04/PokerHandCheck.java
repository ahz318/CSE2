//Ayman Zeine
// 9/22/2015
//hw04 pokerhandcheck
public class PokerHandCheck{
  public static void main(String[] args){
      
    //generate random number between 1 and 52
    double card1 = (int)(Math.random() * 52 + 1);
    double card2 = (int)(Math.random() * 52 + 1);
    double card3 = (int)(Math.random() * 52 + 1);
    double card4 = (int)(Math.random() * 52 + 1);
    double card5 = (int)(Math.random() * 52 + 1);
    
    //creating String variables to represent card suits
    String suit1 = "";
    String suit2 = "";
    String suit3 = "";
    String suit4 = "";
    String suit5 = "";
    
    //creating String variables to represent card identities
    String identity1 = "";
    String identity2 = "";
    String identity3 = "";
    String identity4 = "";
    String identity5 = "";
    
    //boolean for combinations in order to print correct statement
    boolean pair = false;
    boolean pair2 = false;
    boolean kind3 = false;
    boolean highCard = false;
    
    //determining suit of card 1
    if(card1 >= 1 && card1 <= 13){
      suit1 = "Diamonds";
    }
    else if(card1 >= 14 && card1 <= 26){
      suit1 = "Clubs";
    }
    else if(card1 >= 27 && card1 <= 39){
      suit1 = "Hearts";
    }
    else if(card1 >= 39 && card1 <= 52){
      suit1 = "Spades";
    }
    
    //determining suit of card 2
    if(card2 >= 1 && card2 <= 13){
      suit2 = "Diamonds";
    }
    else if(card2 >= 14 && card2 <= 26){
      suit2 = "Clubs";
    }
    else if(card2 >= 27 && card2 <= 39){
      suit2 = "Hearts";
    }
    else if(card2 >= 39 && card2 <= 52){
      suit2 = "Spades";
    }
    
    //determining suit of card 3
    if(card3 >= 1 && card3 <= 13){
      suit3 = "Diamonds";
    }
    else if(card3 >= 14 && card3 <= 26){
      suit3 = "Clubs";
    }
    else if(card3 >= 27 && card3 <= 39){
      suit3 = "Hearts";
    }
    else if(card3 >= 39 && card3 <= 52){
      suit3 = "Spades";
    }
    
    //determining suit of card 4
    if(card4 >= 1 && card4 <= 13){
      suit4 = "Diamonds";
    }
    else if(card4 >= 14 && card4 <= 26){
      suit4 = "Clubs";
    }
    else if(card4 >= 27 && card4 <= 39){
      suit4 = "Hearts";
    }
    else if(card4 >= 39 && card4 <= 52){
      suit4 = "Spades";
    }
    
    //determining suit of card 5
    if(card5 >= 1 && card5 <= 13){
      suit5 = "Diamonds";
    }
    else if(card5 >= 14 && card5 <= 26){
      suit5 = "Clubs";
    }
    else if(card5 >= 27 && card5 <= 39){
      suit5 = "Hearts";
    }
    else if(card5 >= 39 && card5 <= 52){
      suit5 = "Spades";
    }
    
    //create variable for card identity for all 5 cards
    int cardID1 = (int) (card1) % 13;
    int cardID2 = (int) (card2) % 13;
    int cardID3 = (int) (card3) % 13;
    int cardID4 = (int) (card4) % 13;
    int cardID5 = (int) (card5) % 13;
    
    //switch statements to determine card identity for card 1
    switch(cardID1){
      case 0:
        identity1 = "King";
        break;
      case 1:
        identity1 = "Ace";
        break;
      case 2:
        identity1 = "2";
        break;
      case 3:
        identity1 = "3";
        break;
      case 4:
        identity1 = "4";
        break;
      case 5:
        identity1 = "5";
        break;
      case 6:
        identity1 = "6";
        break;
      case 7:
        identity1 = "7";
        break;
      case 8:
        identity1 = "8";
        break;
      case 9:
        identity1 = "9";
        break;
      case 10:
        identity1 = "10";
        break;
      case 11:
        identity1 = "Jack";
        break;
      case 12:
        identity1 = "Queen";
        break;
    }
    
    //switch statements to determine card identity for card 2
    switch(cardID2){
      case 0:
        identity2 = "King";
        break;
      case 1:
        identity2 = "Ace";
        break;
      case 2:
        identity2 = "2";
        break;
      case 3:
        identity2 = "3";
        break;
      case 4:
        identity2 = "4";
        break;
      case 5:
        identity2 = "5";
        break;
      case 6:
        identity2 = "6";
        break;
      case 7:
        identity2 = "7";
        break;
      case 8:
        identity2 = "8";
        break;
      case 9:
        identity2 = "9";
        break;
      case 10:
        identity2 = "10";
        break;
      case 11:
        identity2 = "Jack";
        break;
      case 12:
        identity2 = "Queen";
        break;
    }
    
    //switch statements to determine card identity for card 3
    switch(cardID3){
      case 0:
        identity3 = "King";
        break;
      case 1:
        identity3 = "Ace";
        break;
      case 2:
        identity3 = "2";
        break;
      case 3:
        identity3 = "3";
        break;
      case 4:
        identity3 = "4";
        break;
      case 5:
        identity3 = "5";
        break;
      case 6:
        identity3 = "6";
        break;
      case 7:
        identity3 = "7";
        break;
      case 8:
        identity3 = "8";
        break;
      case 9:
        identity3 = "9";
        break;
      case 10:
        identity3 = "10";
        break;
      case 11:
        identity3 = "Jack";
        break;
      case 12:
        identity3 = "Queen";
        break;
    }
    
    //switch statements to determine card identity for card 4
    switch(cardID4){
      case 0:
        identity4 = "King";
        break;
      case 1:
        identity4 = "Ace";
        break;
      case 2:
        identity4 = "2";
        break;
      case 3:
        identity4 = "3";
        break;
      case 4:
        identity4 = "4";
        break;
      case 5:
        identity4 = "5";
        break;
      case 6:
        identity4 = "6";
        break;
      case 7:
        identity4 = "7";
        break;
      case 8:
        identity4 = "8";
        break;
      case 9:
        identity4 = "9";
        break;
      case 10:
        identity4 = "10";
        break;
      case 11:
        identity4 = "Jack";
        break;
      case 12:
        identity4 = "Queen";
        break;
    }
    
    //switch statements to determine card identity for card 5
    switch(cardID5){
      case 0:
        identity5 = "King";
        break;
      case 1:
        identity5 = "Ace";
        break;
      case 2:
        identity5 = "2";
        break;
      case 3:
        identity5 = "3";
        break;
      case 4:
        identity5 = "4";
        break;
      case 5:
        identity5 = "5";
        break;
      case 6:
        identity5 = "6";
        break;
      case 7:
        identity5 = "7";
        break;
      case 8:
        identity5 = "8";
        break;
      case 9:
        identity5 = "9";
        break;
      case 10:
        identity5 = "10";
        break;
      case 11:
        identity5 = "Jack";
        break;
      case 12:
        identity5 = "Queen";
        break;
    }
    
    //displaying random cards
    System.out.println("Your random cards were: ");
    System.out.println(identity1 + " of " + suit1);
    System.out.println(identity2 + " of " + suit2);
    System.out.println(identity3 + " of " + suit3);
    System.out.println(identity4 + " of " + suit4);
    System.out.println(identity5 + " of " + suit5);
    
    //finding if there are 2 pairs     
    if(identity1 == identity2 && identity3 == identity4 || 
       identity1 == identity2 && identity3 == identity5 || 
       identity1 == identity3 && identity2 == identity4 || 
       identity1 == identity3 && identity2 == identity5 || 
       identity1 == identity4 && identity2 == identity3 || 
       identity1 == identity4 && identity2 == identity5 || 
       identity1 == identity5 && identity2 == identity3 || 
       identity1 == identity5 && identity2 == identity4 || 
       identity2 == identity3 && identity4 == identity5 || 
       identity2 == identity4 && identity3 == identity5 || 
       identity2 == identity5 && identity3 == identity4){
      pair2 = true;
      highCard = false;
      if(pair2 = true){
        System.out.println("You have 2 pairs!");
      }
    }  
    
    //finding if user has 3 of a kind using combinations
    if(identity1 == identity2 && identity1 == identity3 ||
       identity1 == identity2 && identity1 == identity4 ||
       identity1 == identity2 && identity1 == identity5 ||
       identity2 == identity3 && identity2 == identity4 ||
       identity2 == identity3 && identity2 == identity5 ||
       identity3 == identity4 && identity3 == identity5){
      kind3 = true;
      highCard = false;
      if(kind3 = true){
        System.out.println("You have 3 of a kind!");
      }
    }
    
    //finding if 2 of the 5 cards match using combinations
    if(identity1 == identity2 || identity1 == identity3 || identity1 == identity4 || identity1 == identity5
         || identity2 == identity3 || identity2 == identity4 || identity2 == identity5 || identity3 == identity4
         || identity3 == identity5 || identity4 == identity5){
      highCard = false;
      pair = true;
      if(pair2 = true){
        pair = false;
      }
      if(kind3 = true){
        pair = false;
      }
      if(pair = true){
        System.out.println("You have a pair!");
      }
    }
    
    //high card       
    else{
      highCard = true;
      if(highCard = true){
        System.out.println("You have a high card hand");
      }
    }
    
  }
}