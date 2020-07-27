
public class ClassWord {
	//private variables
	private String word;
	private int frequency;
	private ClassWord next;
	
	//constructors
	public ClassWord(String inWord) {
		word = inWord;
		frequency = 1;
		next = null;
	}
	//getters
	public String getWord() {
		return word;
	}
	public ClassWord getNext() {
		return next;
	}
	public int getFrequency() {
		return frequency;
	}
	
	//modifiers
	public void setWord(String inWord) {
		word = inWord;
	}
	public void increaseFrequency() {
		frequency++;
	}
	public void setNext(ClassWord inClassWord) {
		next = inClassWord;
	}
	
}
