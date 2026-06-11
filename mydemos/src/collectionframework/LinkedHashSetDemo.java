package collectionframework;

import java.util.LinkedHashSet;

/*
 * Linked HasSet :
 * A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.

It is part of the java.util package and implements the Set interface.
*/
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("hello");
		linkedHashSet.add("hello");
		linkedHashSet.add(null);
		linkedHashSet.add("world");
		
		System.out.println(linkedHashSet);
	}
}
