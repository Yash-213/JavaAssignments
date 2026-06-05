package collectionframework;

import java.util.HashSet;

/*
 * HashSet:
 
 * A HashSet is a collection of elements where every element is unique.

It is part of the java.util package and implements the Set interface*/

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(23);
		set.add(null);
		set.add(34);
		System.out.println(set);
	}
}
