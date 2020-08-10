import java.util.Scanner;

public class Stocks {
	private int numberOfStocks = 0;
	private int priceOfStocks = 0;
	private Stocks nextStock = null;
	
	//constructors
	public Stocks(int inNumberOfStocks, int inPriceOfStocks) {
		numberOfStocks = inNumberOfStocks; 
		priceOfStocks = inPriceOfStocks;
	}
	//getters
	public int getNumberOfStocks() {
		return numberOfStocks;
	}
	public int getPriceOfStocks() {
		return priceOfStocks;
	}
	public Stocks getNextStock() {
		return nextStock;
	}
	//modifiers
	public void setNumberOfStocks(int inNumberOfStocks ) {
		numberOfStocks = inNumberOfStocks;
	}
	public void setPriceOfStocks(int inPriceOfStocks ) {
		priceOfStocks = inPriceOfStocks;
	}
	public void setNextStock(Stocks inNextStock) {
		nextStock = inNextStock;
	}
	
}// class
