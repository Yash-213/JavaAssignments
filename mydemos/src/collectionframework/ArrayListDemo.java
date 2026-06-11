package collectionframework;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // Create ArrayList 
//		Adding String and null in List and print list
		list.add(null);
		list.add("Apple");
		list.add("orange");
		list.add("mango");
		System.out.println(list);
	}
}
