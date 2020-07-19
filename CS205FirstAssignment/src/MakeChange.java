import java.util.Scanner;
import java.text.DecimalFormat;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializes monetaryArray
				double[][]americanMonetarySystemArray = new double[10][2];
				for (int i = 0; i<10; i++)
					americanMonetarySystemArray[i][1] = 0;
				americanMonetarySystemArray[0][0]=100.0;
				americanMonetarySystemArray[1][0]=50.0;
				americanMonetarySystemArray[2][0]=20.0;
				americanMonetarySystemArray[3][0]=10.0;
				americanMonetarySystemArray[4][0]=5.0;
				americanMonetarySystemArray[5][0]=1.0;
				americanMonetarySystemArray[6][0]=.25;
				americanMonetarySystemArray[7][0]=.10;
				americanMonetarySystemArray[8][0]=.05;
				americanMonetarySystemArray[9][0]=.01;
				
		//Initial Input
		System.out.println("Please enter two numbers, one as a monetary amount charged, the other as a monetary amount given.");
		Scanner s = new Scanner(System.in);
		DecimalFormat monetaryCountFormat = new DecimalFormat("#");
		double amountCharged = s.nextDouble();
		double amountGiven = s.nextDouble();
		s.close();
		double change = amountGiven-amountCharged;
		System.out.println("The amount charged is: " + amountCharged);
		System.out.println("The amount given is: " + amountGiven);
		System.out.println("The amount of change is: " + change);
		for (int i =0; i<10; i++) {
			while (change >= americanMonetarySystemArray[i][0]) {
				change -= americanMonetarySystemArray[i][0];
				change = Math.round(change*100);
				change /= 100;
				americanMonetarySystemArray[i][1] +=1;
				}//while
			}//for
		System.out.println("Change should be given in: ");
		for (int i = 0; i<10; i++) {
			if (i<6) {
				if (americanMonetarySystemArray[i][1]>1)
					System.out.println(monetaryCountFormat.format(americanMonetarySystemArray[i][1]) + " $" + monetaryCountFormat.format(americanMonetarySystemArray[i][0]) + " bills" );
				else if (americanMonetarySystemArray[i][1]>0)
					System.out.println(monetaryCountFormat.format(americanMonetarySystemArray[i][1]) + " $" + monetaryCountFormat.format(americanMonetarySystemArray[i][0]) + " bill" );
			}
			if(i>=6)
				if (americanMonetarySystemArray[i][1]>1)
					System.out.println(monetaryCountFormat.format(americanMonetarySystemArray[i][1]) + " ¢" + monetaryCountFormat.format(100*americanMonetarySystemArray[i][0]) + " coins" );
				else if (americanMonetarySystemArray[i][1]>0)
					System.out.println(monetaryCountFormat.format(americanMonetarySystemArray[i][1]) + " ¢" + monetaryCountFormat.format(100*americanMonetarySystemArray[i][0]) + " coin" );
		}
	}//main
}//class
