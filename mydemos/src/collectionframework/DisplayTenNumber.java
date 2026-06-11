package collectionframework;

import java.util.*;
public class DisplayTenNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(39);
		list.add(35);
		list.add(29);
		list.add(89);
		list.add(26);
		list.add(23);
		list.add(9);
		for(int l : list) {
			System.out.println(l);
		}
	}
}
;