package week6Project;
import java.util.ArrayList;
import java.util.List;

//Player Class

public class Player {

	   // create hand - (List of Card)
	    
	    List<Card> hand = new ArrayList<Card>();
	    
	   //score set to 0 in the constructor
	    int score = 0;
	    String name;

	    public Player(String newName) {
	        name = newName;
	        score = 0;
	    }
       // describe (prints out information about the player and calls the describe method for each card in the Hand List)
	    public void describe() {
	        System.out.println("A Player's cards are:%s \n" + name);
	        
	        for (Card card : hand) {
	            card.describe();
	        }
	    }
      
	    // flip (removes and returns the top card of the Hand)
	    public Card flip() {
	        return hand.remove(0);
	    }
        // draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	    public void draw(Deck deck) {
	        hand.add(deck.draw());
	    }
	    
        // incrementScore (adds 1 to the Player’s score field)
	    public void incrementScore() {
	        score++;
	    }

	    public int getScore() {
	        return score;
	    }

	}

