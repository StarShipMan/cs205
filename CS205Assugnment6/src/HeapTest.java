
public class HeapTest {

	public static void main(String[] args) {
		Heap h = new Heap(20);
		h.add(10);
		h.add(10);
		h.add(5);
		h.add(8);
		h.add(12);
		h.add(-1);
		h.add(18);
		h.add(9);
		h.add(100);
		h.add(-100);
		h.add(13);
		h.add(-200);
		h.add(12);
		
		h.display();
		System.out.println();
		h.displayByRemoveMin();
		

	}

}
