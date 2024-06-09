package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	

	public List<Card> hand = new ArrayList<Card>();
	public int score = 0;
	public String name;
	
	// Getter and setter for Hand
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	// getter and setter for score to work in main method
		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

	public void describe() { //Prints out the player names
		
		System.out.println("Player " + name);
		for (Card card: hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0); // Takes out the card at the "top"
	}
	
	public void draw(Deck deck) { // does Draw and adds the returned card to Hand
		hand.add(deck.draw());
	}
	
	public void incrementScore() { // Adds to the score of the game
		score++;
	}
	
}
