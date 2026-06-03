package collectionframework;

import java.util.*;


public class InsertElementInArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("How");
		list.add("are");
		int pos = 2;
		String value = "Yash";
		list.add(pos, value);
		System.out.println(list);
//	    for (String string : list) {
//			System.out.println(string);
//		}
	}
}
