
public class StockLinkList {
	protected Stocks head;
	protected long size;
	
	//default constructor of empty list
	public StockLinkList() {
		head = null;
		size = 0;
	}
	
	public void addLastStock(Stocks inStock) {
		Stocks tail = null;
		Stocks temp = head;
		if(head == null) {
			head = inStock;
			size++;
			return;
		}
		while (temp.getNextStock() != null){
			temp = temp.getNextStock();
		}
		tail=temp;
		tail.setNextStock(inStock);
		size++;
	}
	public void removeHead() {
		if (head == null)
			return;
		head = head.getNextStock();
		size--;
	}
	public Stocks getHead() {
		return head;
	}
}//class
