package week6Project;

public class Card {
	
	int value;
    String name;
    //1a. value (contains a value from 2-14 representing cards 2-Ace)
 // A standard deck of playing cards has 52 cards as specified below 
 		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
 		//				
 		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
 		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
 		//
 		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
 		//							 to make this easy, a Two will have a value of 2, a
 		//							 Three will have a value of 3, ... and an Ace will have
 		//							 a value of 14.
    public Card(int newValue, String suit) {
    	
    	value = newValue;
    	
    	switch(newValue) {
        case 2: name = "Two";
            break;
        case 3: name = "Three";
            break;
        case 4: name = "Four";
            break;
        case 5: name = "Five";
            break;
        case 6: name = "Six";
            break;
        case 7: name = "Seven";
            break;
        case 8: name = "Eight";
            break;
        case 9: name = "Nine";
            break;
        case 10: name = "Ten";
            break;
        case 11: name = "Jack";
            break;
        case 12: name = "Queen";
            break;
        case 13: name = "King";
            break;
        case 14: name =  "Ace";
            break;
    }
    //Name for example Ace of Diamonds, or Two of Hearts

    name += "of" + suit;
    }
    
    // Methods
    //Getters 
    public int getValue() {
    return value;
    }
    //Setters
    public void setValue(int value) {
    this.value = value;
    }
    //Getters 
    public String getName() {
    return name;
    }
    //Setters
    public void setName(String name) {
    this.name = name;
    }
    //Describe method showing how to print information out of card to display the card information to the Console.
    public void describe() {
		System.out.printf("Card:%s with value of %d\n", name, value);
    }
}
