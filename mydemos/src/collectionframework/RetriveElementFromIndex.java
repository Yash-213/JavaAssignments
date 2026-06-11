package collectionframework;

import java.util.*;

public class RetriveElementFromIndex {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//		Add ten Students Name;
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
		
		int position = 4; // what position want
//		finding position by using get() method
		System.out.println(list.get(position));
	}
}
