import java.util.Random;

public class BirthSim {
	private int num;     // # of people
	private int m;	 // m times of simulations
	
	//constructor
	BirthSim(int n, int r){
		num = n;
		m = r;
	}
	
	//check if at least two people out of num have same birthday
	private Boolean haveSameBirthday() {
		int[] bDay = new int[num];   //to store num birthdays
		
		for(int i=0; i<num; i++)
			bDay[i] = -1;
		
		//create a Random instance
		Random rand = new Random();
		
		int newBirthday = 0;
		
		//populate the with random birthdays in {0, 1, ... 364}
		for (int i=0; i<num; i++) {
			newBirthday = rand.nextInt(365);   // returns a number in {0, 1, ... 364}
			
			//check to see if the newly generated birthday already exists in the array
			for (int j=0; j<i; j++) {
				if(bDay[j] == newBirthday)
					return true;
			}
			
			//store newBirthday to the array
			bDay[i] = newBirthday;
		}
		
		//we get here because no two people have the same birthday
		return false;
	}
	
	//Lab assignment 1:
	//implement a second simulation method, that creates a Boolean array of 365
	//initialize the array to false,
	//then going to a loop to generate a new birthday
	//check the Boolean array, if the value at the new birthday index is true;
	//...it means somebody else has that birthday, and return true;
	//otherwise (false), the birthday is not taken, and change the value to true
	//...and continue the loop.
	
	//simulation
	public double simulation() {
		int count = 0; // to store how many times out of m rounds of
		               // simulation at least two people have same birthday.
		
		// perform m rounds of simulation
		for (int i=0; i<m; i++) {
			//check to see if any 2 people out of num have the same birthday
			if(haveSameBirthday()) {
				count++;
			}
		}
		return (double)count/m;
	}
	public double simulation2() {
		int count = 0; // to store how many times out of m rounds of
        			   // simulation at least two people have same birthday.
		
		// perform m rounds of simulation
		for (int i=0; i<m; i++) {
			//check to see if any 2 people out of num have the same birthday
			if(haveSameBirthday2()) {
				count++;
			}
		}
		return (double)count/m;
	}
	
	private Boolean haveSameBirthday2() {
		boolean[] days365 = new boolean[365]; // initializes an array of 365 days
		for (int i = 0; i<365; i++)  //loops to set 
			days365[i] = false;      //all values to false
		
		//create a Random instance
		Random rand = new Random();
		
		int newBirthday = 0;
		
		//populate the with random birthdays in {0, 1, ... 364}
		for (int i=0; i<num; i++) {
			newBirthday = rand.nextInt(365);   // returns a number in {0, 1, ... 364}
			
			//check to see if the newly generated birthday already exists in the array
			if(days365[newBirthday] == false) 			//store newBirthday to the array if false
				days365[newBirthday] = true; 
			else
				return true;
		}
		//we get here because no two people have the same birthday
		return false;
	}
}
