package dll;


// just here for testing, in case you want to use it


public class Card {

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public Card(int value, String suit) {
		super();
		this.value = value;
		this.suit = suit;
	}
	
	private int value;
	
	@Override
	public String toString() {
		return "Card [value=" + value + ", suit=" + suit + "]";
	}

	private String suit;
	
	
}
