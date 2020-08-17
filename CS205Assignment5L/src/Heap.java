
public class Heap {
	private Input[] arr;
	private int index; //point to the highest array cell that stores a value
	
	public Heap(int capacity) {
		arr = new Input[capacity];
		index = 0; //assume arr[0] has been occupied
	}
	
	public void add(Input key) {
		if(index == 0) {
			arr[++index] = key;
		}
		else {
			arr[++index] = key;
			upHeap(index);
		}
	}//add
	
	public int removeMin() {
		int min = arr[1].getIndex();
		arr[1] = arr[index];
		index--;
		downHeap(1);
		return min;
	}//removeMin
	
	public void upHeap(int child) {
		int parent = child/2;
		
		if(parent <= 0) return;
		
		if(arr[child].getIndex() < arr[parent].getIndex()) {
			swap(child, parent);
			upHeap(parent); //recursive call
		}
	}//uHeap
	
	public void swap(int a, int b) {
		int tempIndex = arr[a].getIndex();
		String tempLetter = arr[a].getLetter();
		arr[a].setIndex(arr[b].getIndex());
		arr[a].setLetter(arr[b].getLetter());
		arr[b].setIndex(tempIndex);
		arr[b].setLetter(tempLetter);
	}//swap
	
	public void downHeap(int parent) {
		int left = 2*parent;
		int right = left +1;
		
		if (left == index) { //left child is the last node
			if(arr[parent].getIndex() > arr[left].getIndex()) {
				swap(parent, left);
			}
		}
		else if (right == index) {//right child is the last node
			if(arr[parent].getIndex() > arr[left].getIndex() && arr[left].getIndex() < arr[right].getIndex())
				swap(parent, left);
			else if (arr[parent].getIndex() > arr[right].getIndex() && arr[right].getIndex()<arr[left].getIndex())
				swap(parent, right);
		}
		else if (right<index) { //has more levels below parent
			if(arr[parent].getIndex() > arr[left].getIndex() && arr[left].getIndex() < arr[right].getIndex()) {
				swap(parent, left);
				downHeap(left);
			}
			else if (arr[parent].getIndex() > arr[right].getIndex() && arr[right].getIndex()<arr[left].getIndex()) {
				swap(parent, right);
				downHeap(right);
			}
		}
	}//downHeap
	
	public void display() {
		for (int i = 1; i <=index; i++) {
			arr[i].display();
		}
	}
	public void displayByRemoveMIn() {
		int heapSize = index;
		for (int i = 1; i <=heapSize; i++) {
			System.out.print(removeMin() + " ");
		}
	}
}
