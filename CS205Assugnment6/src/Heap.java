
public class Heap {
	private int[] arr;
	private int index; //point to the highest array cell that stores a value
	
	public Heap(int capacity) {
		arr = new int[capacity];
		index = 0; //assume arr[0] has been occupied
	}
	
	public void add(int key) {
		for (int i = 0; i <= index; i++) {
			if (arr[i] == key) {
				System.out.println("I am sorry but the key (" + key + ") has alrady been entered.");
				return;
			}
		}
		if(index == 0) {
			arr[++index] = key;
		}
		else {
			arr[++index] = key;
			upHeap(index);
		}
	}//add
	
	public int removeMin() {
		int min = arr[1];
		arr[1] = arr[index];
		index--;
		downHeap(1);
		return min;
		
	}//removeMin
	
	public void upHeap(int child) {
		int parent = child/2;
		
		if(parent <= 0) return;
		
		if(arr[child] < arr[parent]) {
			swap(child, parent);
			upHeap(parent); //recursive call
		}
	}//uHeap
	
	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a]= arr[b];
		arr[b] = temp;
	}//swap
	
	public void downHeap(int parent) {
		int left = 2*parent;
		int right = left +1;
		
		if (left == index) { //left child is the last node
			if(arr[parent] > arr[left]) {
				swap(parent, left);
			}
		}
		else if (right == index) {//right child is the last node
			if(arr[parent] > arr[left] && arr[left]< arr[right])
				swap(parent, left);
			else if (arr[parent] > arr[right] && arr[right]<arr[left])
				swap(parent, right);
		}
		else if (right<index) { //has more levels below parent
			if(arr[parent] > arr[left] && arr[left] < arr[right]) {
				swap(parent, left);
				downHeap(left);
			}
			else if (arr[parent] > arr[right] && arr[right] <arr[left]) {
				swap(parent, right);
				downHeap(right);
			}
		}
	}//downHeap
	
	public void display() {
		for (int i = 1; i <=index; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void displayByRemoveMin() {
		int heapSize = index;
		for (int i = 1; i <=heapSize; i++) {
			System.out.print(removeMin() + " ");
		}
	}
}
