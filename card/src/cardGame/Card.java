package cardGame;

public class Card {
	private int value;
	private String name;
	
	// Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public Card() {
		// TODO Auto-generated constructor stub
	}

	// the getters and setters
	public int getValue() {
		return value;
	}
	
	public void setValue (int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// Now we create a method to log the card
	public void describe() {
		System.out.println("Card Name: " + name + " with a value of " + value); // Concatenation so we get a more descriptive output
	}
}
