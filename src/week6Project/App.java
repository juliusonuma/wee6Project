package week6Project;

//2. Create a class called App with a main method.
public class App {

	public static void main(String[] args) {
		
//a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
		
	        Deck deck = new Deck();
	        Player player1 = new Player("1");
	        Player player2 = new Player("2");
	        deck.shuffle();

//b.     Using a traditional for loop, iterate 52 times calling the Draw method on the 
//      other player each iteration using the Deck you instantiated.	        
	        for (int i = 0; i < 52; i++) {
	            if ( i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }

// c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
	        
	        for (int i = 0; i < 26; i++) {
	            Card player1game = player1.flip();
	            Card player2game = player2.flip();
	            if (player1game.getValue() > player2game.getValue()) {
	                player1.incrementScore();
	            } else if (player1game.getValue() < player2game.getValue()) {
	                player2.incrementScore();
	            }
	        }

// Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” 
// depending on which score is higher or if they are both the same.
	        
	        System.out.printf("Player1 score = %d\n", player1.getScore());
	        System.out.printf("Player2 score = %d\n", player2.getScore());
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player1 is the winner!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player2 is the winner!");
	        } else {
	            System.out.println("It is a DRAW!");
	        }


	    }

	

	}


