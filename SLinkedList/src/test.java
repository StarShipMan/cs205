
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLinkedList sLinkedList = new SLinkedList();
		Node node1 = new Node("1");
		sLinkedList.addLast(node1);
		Node node2 = new Node("2");
		sLinkedList.addLast(node2);
		Node node3 = new Node("3");
		sLinkedList.addLast(node3);
		Node node4 = new Node("4");
		sLinkedList.addLast(node4);
		Node node5 = new Node("5");
		sLinkedList.addLast(node5);
		sLinkedList.swap(node5, node2);
		sLinkedList.display();
	}

}
