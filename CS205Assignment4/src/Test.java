import java.util.Scanner;

public class Test {
	public static void buy(StockLinkList testStockListLink) {
		int numberOfStocks = 0;
		int priceOfStocks = 0;
		boolean validInputs = false;
		System.out.println("Please enter the number of stocks you would like to purchase, then enter the price of the stocks.");
		while (validInputs == false) {
			Scanner sc = new Scanner(System.in);
			try {
				numberOfStocks = Math.abs(sc.nextInt());
				priceOfStocks = Math.abs(sc.nextInt());
				validInputs = true;
				System.out.println(	"Please enter B if you would like to buy more stocks, S if you would like to to sell stocks, or Q to quit the program.");
			} catch (Exception invalidInput) {
				System.out.print("Please enter an integer for a valid input.");
				sc = new Scanner(System.in);
			}
		}//while
		Stocks newStock = new Stocks(numberOfStocks, priceOfStocks);
		testStockListLink.addLastStock(newStock);
	}//buy
	
	public static void sell(StockLinkList testStockLinkList) {
		Scanner sc = new Scanner(System.in);
		int capitalGains = 0;
		int numberOfStocks = 0;
		int priceOfStocks = 0;
		boolean validInputs = false;
		System.out.println("Please enter the number of stocks you would like to sell, then enter the price of the stocks.");
		while (validInputs == false) {
			try {
				numberOfStocks = Math.abs(sc.nextInt());
				priceOfStocks = Math.abs(sc.nextInt());
				validInputs = true;
			} catch (Exception invalidInput) {
				System.out.print("Please enter an integer for a valid input.");
				sc = new Scanner(System.in);
			}
		}//while
		while (numberOfStocks > 0) {
			if (numberOfStocks >= testStockLinkList.getHead().getNumberOfStocks()) {
				capitalGains = capitalGains + ((priceOfStocks-testStockLinkList.getHead().getPriceOfStocks())*testStockLinkList.getHead().getNumberOfStocks());
				numberOfStocks = numberOfStocks - testStockLinkList.getHead().getNumberOfStocks();
				testStockLinkList.removeHead();
			}
			else {
				capitalGains = capitalGains + ((priceOfStocks-testStockLinkList.getHead().getPriceOfStocks())*numberOfStocks);
				numberOfStocks = numberOfStocks - testStockLinkList.getHead().getNumberOfStocks();
			}
		}
		System.out.println("Capital gains from selling shares is $" + capitalGains);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRunning = true;
		boolean isValidInput = false;
		StockLinkList testStockListLink = new StockLinkList();
		
		Scanner sc = new Scanner(System.in);
		String userInput;
		while (isRunning == true) {
			System.out.println(
					"Please enter B if you would like to buy stocks, S if you would like to to sell stocks, or Q to quit the program.");
			try {
				while (isValidInput == false) {
					userInput = sc.next();
					if (userInput.equals("Q")) {
						isValidInput = true;
						isRunning = false;
					}
					else if (userInput.equals("B"))
						buy(testStockListLink);
					else if (userInput.contentEquals("S")) {
						sell(testStockListLink);
						isValidInput = true;
						isRunning = false;
					}
					else
						System.out.println("Please enter a valid input of either B to buy stocks, S to sell Stocks, or Q to quit program.");	
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid input of either B to buy stocks, S to sell Stocks, or Q to quit program.");
			}//try catch

		}
	}// main

}
