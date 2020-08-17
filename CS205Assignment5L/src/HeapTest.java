
public class HeapTest {

	public static void main(String[] args) {
		Heap h = new Heap(20);
		h.add(new Input(13, "A"));
		h.add(new Input(32, "B"));
		h.add(new Input(27, "C"));
		h.add(new Input(18, "D"));
		h.add(new Input(9, "E"));
		h.add(new Input(39, "F"));
		h.add(new Input(44, "G"));
		h.add(new Input(21, "H"));
		h.add(new Input(96, "I"));
		h.add(new Input(13, "J"));
		h.add(new Input(4, "K"));
		h.add(new Input(25, "L"));
		
		h.display();
		
		System.out.println();
		h.removeMin();
		h.removeMin();
		h.display();
		

	}

}
