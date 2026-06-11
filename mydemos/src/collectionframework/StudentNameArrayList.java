package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class StudentNameArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//		Add 10 students name by using add() method
		list.add("Aarav");
		list.add("Vihaan");
		list.add("Ishaan");
		list.add("Aditya");
		list.add("Rohan");
		list.add("Karan");
		list.add("Arjun");
		list.add("Rahul");
		list.add("Neeraj");
		list.add("Siddharth");
//		print students name one by by using for each loop
		for(String stud : list) {
			System.out.println(stud);
		}
	}
}
