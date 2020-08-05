import java.util.Scanner;

public class SLinkedList {
	protected Node head; //head node of the list
	protected long size; // number of nodes in the list
	
	//default constructor of empty list
	public SLinkedList() {
		head = null;
		size = 0;
	}
	
	//add node to the linked list
	//... add, update, search, delete, display methods
	
	public void addFirst(Node newNode) {
		newNode.setNext(head);
		head = newNode;
		size++;
	}
	public void addLast(Node v) {
		Node tail = null;
		Node temp = head;
		if(head == null) {
			head = v;
			size++;
			return;
		}
		while (temp.getNext() != null){
			temp = temp.getNext();
		}
		tail=temp;
		tail.setNext(v);
		size++;
	}
	public void removeHead() {
		if (head == null)
			return;
		head = head.getNext();
		size--;
	}
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.getElement());
			temp = temp.getNext();
		}
	}//display
	public void removeSecond(){
		Node temp = head;
		if (head == null || head.getNext()== null)
			return;
//		if(head.getNext().getNext()==null)
//			head.setNext(null);
		
		temp = temp.getNext().getNext();
		head.setNext(temp);
		size--;
	}//remove second
	public void removeLast() {
		Node temp = head;
		if(head == null) return;
		if(head.getNext()==null) {head = null; return;}
		while (temp.getNext().getNext() != null)
			temp = temp.getNext();
		temp.setNext(null);
	}//remove last
	public void swap(Node x, Node y) {
		if (head == null) return;
		Node temp = head;
		Node preX = null;
		Node preY = null;
		Node aftX = null;
		Node aftY = null;
		if (temp == x) {
			aftX = x.getNext();
			if (aftX == y) {
				x.setNext(y.getNext());
				y.setNext(x);
				head = y;
				return;	
			}
			while(temp.getNext() != null) {
				if (temp.getNext() == y)
					preY = temp;
				temp = temp.getNext();
			}
			preY.setNext(x);
			x.setNext(y.getNext());
			head = y;
			y.setNext(aftX);
			return;
		}
		else if (temp == y) {
			aftY = y.getNext();
			if (aftY == x) {
				y.setNext(x.getNext());
				x.setNext(y);
				head = x;
				return;	
			}
			while(temp.getNext() != null) {
				if (temp.getNext() == x)
					preX = temp;
				temp = temp.getNext();
			}
			preX.setNext(x);
			y.setNext(x.getNext());
			head = x;
			x.setNext(aftY);
			return;
		}
		else if (x.getNext() == y) {
			while (temp.getNext() != null) {
				if (temp.getNext() == x) {
					x.setNext(y.getNext());
					temp.setNext(y);
					y.setNext(x);
					return;
				}
				else
					temp = temp.getNext();
			}
			return;
		}
		else if (y.getNext() == x) {
			while (temp.getNext() != null) {
				if (temp.getNext() == y) {
					y.setNext(x.getNext());
					temp.setNext(x);
					x.setNext(y);
					return;
				}
				else
					temp = temp.getNext();
			}
			return;
		}//else if
		else {
			 preX = null;
			 preY = null;
			while(temp.getNext() != null){
				if (temp.getNext() == x)
					preX = temp;
				if (temp.getNext() == y)
					preY = temp;
				temp = temp.getNext();
			}
			preX.setNext(x.getNext());
			preY.setNext(x);
			x.setNext(y);
			return;
		}//else

	}
	public void relocateX(Node x, Node y) {
		Node temp = head;
		if (head == null)
			return;
		if ( y == head){
			while (temp.getNext() != null) {
				if(temp.getNext() == x) {
					temp.setNext(x.getNext());
					x.setNext(y);
					head = x;
					return;
				}
				else
					temp = temp.getNext();
			}//while
			return;
		}//if
		else if (x.getNext() == y) {
			return;
		}//else if
		else if ( x== head) {
			head = x.getNext();
			while (temp.getNext() != null) {
				if(temp.getNext()==y) {
					temp.setNext(x);
					x.setNext(y);
					return;
				}
				else
					temp= temp.getNext();
			}
		}
		else if (y.getNext() == x) {
			while (temp.getNext() != null) {
				if (temp.getNext() == y) {
					y.setNext(x.getNext());
					temp.setNext(x);
					x.setNext(y);
					return;
				}
				else
					temp = temp.getNext();
			}
			return;
		}//else if
		else {
			Node preX = null;
			Node preY = null;
			while(temp.getNext() != null){
				if (temp.getNext() == x)
					preX = temp;
				if (temp.getNext() == y)
					preY = temp;
				temp = temp.getNext();
			}
			preX.setNext(x.getNext());
			preY.setNext(x);
			x.setNext(y);
			return;
		}//else
	}//method relocateX
}//class
