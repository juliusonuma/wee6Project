package week6Project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1b. Deck class
//Create a class called Deck.
//		Fields:  This class should have a list of Card field called cards that will hold all the cards in the deck. 

public class Deck {
    // Step 1 
	//create cards made up of a List of Card
    
	List<Card> cards = new ArrayList<Card>();

	//		Constructor: The constructor for the Deck Class should
	// 			instantiate all 52 standard playing cards and add them to the cards list.
    public Deck() {
        for (int i = 2; i < 15; i++) {
            cards.add(new Card(i, "Diamonds"));
            cards.add(new Card(i, "Hearts"));
            cards.add(new Card(i, "Clubs"));
            cards.add(new Card(i, "Spades"));
        }

   }
    //Create methods - shuffle randomizes the order of the cards
   //	Add a shuffle method to Deck within the Deck Class
    	
    public void shuffle() {
        Collections.shuffle(cards);
    	}
     //draw (removes and returns the top card of the Cards field)
    //Add a draw method to Deck within the Deck Class
    	public Card draw() {
        return cards.remove(0);
    	}

	}
