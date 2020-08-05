
public class Node {
	private String element;
	private Node next; // pointer to Node objects or instances
	
	//constructors
	public Node(String s, Node n) {
		element = s; next = n;
	}
	
	public Node(String s) {
		element = s; next = null;
	}
	
	//getters
	public String getElement() {return element;}
	public Node getNext() {return next;}
	
	//modifiers
	public void setElement(String s) {element = s;}
	public void setNext(Node n) {next = n;}
}
