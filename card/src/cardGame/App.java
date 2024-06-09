package cardGame;

public class App {

	public static void main(String[] args) {
		// We need two players
		Player player1 = new Player();
		
		Player player2 = new Player();
		
		// and a deck
		Deck deck = new Deck();
		deck.shuffle();	
		for (int i=0; i < 26; i++) {
			player1.getHand().add(deck.draw());
			player2.getHand().add(deck.draw());
		}
		for (int i = 0; i < 26; i++) { // Compares what is drawn every round
			Card p1card = player1.flip();
			Card p2card = player2.flip();
			p1card.describe();
			p2card.describe();
			if (p1card.getValue() > p2card.getValue()) {
				System.out.println("Player 1 wins this round");
				player1.incrementScore();
			} else if (p1card.getValue() < p2card.getValue() ) {
				System.out.println("Player 2 wins this round");				
				player2.incrementScore();				
			} else {
				System.out.println("Tie");
			}
			System.out.println("Player 1 score = " + player1.getScore());
			System.out.println("Player 2 score = " + player2.getScore());
			System.out.println();
		}
		if (player1.getScore() > player2.getScore()) { //Compares the final scores
			System.out.println("Player 1 wins the war!"); // and determines the winner
			player1.incrementScore();
		} else if (player1.getScore() < player2.getScore() ) {
			System.out.println("Player 2 wins the war!");				
			player2.incrementScore();				
		} else {
			System.out.println("Truce is formed");
		}
	}

}
