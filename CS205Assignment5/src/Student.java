
public class Student {
	String studentName;
	int studentID;
	boolean studentIsAthlete;
	double studentGPA;
	
	//default constructor
	public Student() {
		studentID = 99999;
		studentName = "Unknown";
		studentGPA = 0.0;
		studentIsAthlete = false;
	}
	
	//overload constructor
	public Student(String inName, int inStudentID,  double inGPA, boolean inIsAthlete) {
		studentName = inName;
		studentID = inStudentID;
		studentGPA = inGPA;
		studentIsAthlete = inIsAthlete;
	}
	
	//getters
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getStudentGPA() {
		return studentGPA;
	}
	public boolean getStudentIsAthlete() {
		return studentIsAthlete;
	}
	//setters
	public void setStudentID(int inStudentID) {
		studentID = inStudentID;
	}
	public void setStudentName(String inStudentName) {
		studentName = inStudentName;
	}
	public void setStudentGPA(double inStudentGPA) {
		studentGPA = inStudentGPA;
	}
	public void setStudenIsAthlete(boolean inStudentAthlete) {
		studentIsAthlete = inStudentAthlete;
	}
	
	//display
	public void display() {
		String athleteStatus;
		if(studentIsAthlete)
			athleteStatus ="athlete";
		else
			athleteStatus ="non-athlete";
		System.out.println(studentName + ", " + studentID + ", " 
			+ athleteStatus + ", " + studentGPA + ".");
		
	}
}
