package collectionframework;

import java.util.*;
public class CityNamesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Bengaluru");
		list.add("Pune");
		list.add("Hyderabad");
		System.out.println(list.size());
		for(String city : list) {
			System.out.println(city);
		}
	}

}
