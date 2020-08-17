import java.util.Comparator;

public class StudentComparator  implements Comparator<Student> {
	public int compare(Student p1, Student p2) {
		//condition 1 Athlete priority
		if (p1.getStudentIsAthlete() == true && p2.getStudentIsAthlete() == false)
			return -1;
		else if (p1.getStudentIsAthlete() == false && p2.getStudentIsAthlete() == true)
			return 1;
		//condition 2 GPA priority
		else if (p1.getStudentGPA() > p2.getStudentGPA())
			return -1;
		else if (p1.getStudentGPA() < p2.getStudentGPA())
			return 1;
		//condition 3 Earlier Enrollment priority
		else if (p1.getStudentID() < p2.getStudentID())
			return-1;
		else if (p1.getStudentID() > p2.getStudentID())
			return 1;
		//final case
		else
			return-1;
		}
}
