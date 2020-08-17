import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(new StudentComparator());
		priorityQueue.add(new Student("Jack", 1001, 3.3, true));
		priorityQueue.add(new Student("Jim", 1002, 3.7, false));
		priorityQueue.add(new Student("Bob", 1005, 3.8, true));
		priorityQueue.add(new Student("Brian", 1009, 3.3, true));
		priorityQueue.add(new Student("Annie", 1014, 3.1, false));
		priorityQueue.add(new Student("Katie", 1019, 3.8, false));
		priorityQueue.add(new Student("Mike", 1020, 2.9, false));
		priorityQueue.add(new Student("Mary", 1021, 3.7, false));
		priorityQueue.add(new Student("Dona", 1030, 3.2, true));
		while(!priorityQueue.isEmpty()) {
			priorityQueue.remove().display();
		}
	}

}
