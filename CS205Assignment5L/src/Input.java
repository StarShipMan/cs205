
public class Input {
	private int index;
	private String letter;
	
	//constructor
	public Input(int inIndex, String inLetter) {
		index = inIndex;
		letter = inLetter;
	}
	
	//getters
	public int getIndex() {
		return index;
	}
	public String getLetter() {
		return letter;
	}
	//setters
	public void setIndex(int inIndex) {
		index = inIndex;
	}
	public void setLetter(String inLetter) {
		letter = inLetter;
	}
	
	public void display() {
		System.out.print("(" + index + ", " + letter + ") ");
	}
	
	
}
