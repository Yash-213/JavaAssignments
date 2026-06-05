package collectionframework;

import java.util.TreeSet;

/*Tree Set: 
 * It always follow ascending order by default
 * do not store null pointer
 * */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(23);
		treeSet.add(34);
		treeSet.add(54);
		treeSet.add(2);
		
		System.out.println(treeSet);
	}

}
