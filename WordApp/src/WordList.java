import java.util.StringTokenizer;

public class WordList {
	//variables
	protected ClassWord head;
	protected int size;
	private int uniqueSize;
	
	//constructors
	public WordList() {
		head = null;
		size = 0;
	}
	public WordList(String inString) {
		StringTokenizer stringTokenizer = new StringTokenizer(inString);
		while(stringTokenizer.hasMoreTokens()) {
			ClassWord newClassWord = new ClassWord(stringTokenizer.nextToken());
			ClassWord tail = null;
			ClassWord temp = head;
			if(head == null) {
				head = newClassWord;
				size++;
			}
			else {
			while (temp.getNext() != null){
				temp = temp.getNext();
			}
			tail=temp;
			tail.setNext(newClassWord);
			size++;
			}
		}	
	}
	public void display() {
		ClassWord temp = head;
		ClassWord temp2;
		ClassWord temp3;
		while(temp != null) {
			int count = 0;
			if (temp.getNext() != null) {
				temp2 = temp.getNext();
				temp3 = temp.getNext();
				 while (temp3 != null) {
//					 System.out.println(temp.getWord());
//					 System.out.println(temp3.getWord());
					 if (temp3.getWord().equals(temp.getWord())) {
					 	//System.out.println("Have same word.");
					 temp.increaseFrequency();
					 for (int i = 0; i < count-1; i++)
						 temp2 = temp2.getNext();
					 //System.out.println(temp2.getWord());
					 temp2.setNext(temp3.getNext());
					// System.out.println(temp2.getNext().getWord());
					 }
					 else
						 //System.out.println("Not the same.");
					 count++;
					 //System.out.println(count);
					 temp3 = temp3.getNext();
				 }
			}
			System.out.println(temp.getWord() + " " + temp.getFrequency());
			uniqueSize++;
			temp = temp.getNext();
		}
		System.out.println("Size of word list: " + size);
		System.out.println("Unique Words in list: " + uniqueSize);
}
}

