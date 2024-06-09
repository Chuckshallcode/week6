package cardGame;

import java.util.ArrayList;
import java.util.*; 
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Spades ♠", "Hearts ♥", "Clubs ♣", "Diamonds ◆"};
		for (String suit:suits) {
			int count = 2;  // setting the index of the cards to their actual value
			for (String name:names) {
				Card card = new Card(); // Create a card
                String str = (name + " of " + suit); // Create card name
                card.setName(str); // Set card name
                card.setValue(count); // set card value

                this.cards.add(card); // Add the card to the list

                count++; // Move to next card value
				
			}
		}
	}
	


	
	public void shuffle() {
		Collections.shuffle(cards); //randomizes the cards
		
	}
	
	public Card draw() {
		return cards.remove(0); //removes the "top" of the deck
	}
	
}
