
public class BirthdayApp {
	public static void main(String args[]) {
		
		BirthSim sim = new BirthSim(20, 1000); //# of people, # of simulations
		System.out.println(sim.simulation());
		
		BirthSim sim2 = new BirthSim(50, 1000); //# of people, # of simulations
		System.out.println(sim2.simulation());
		
		BirthSim sim3 = new BirthSim(2, 1000); //# of people, # of simulations
		System.out.println(sim3.simulation2());
		
		BirthSim sim4 = new BirthSim(20, 1000); //# of people, # of simulations
		System.out.println(sim4.simulation2());
	}

}
