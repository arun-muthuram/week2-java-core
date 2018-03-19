package javaCore;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListVsSetVsMap {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();// indexed and ordered collection, allows duplicates and
																// null objects.
		HashSet<Integer> hashset = new HashSet<Integer>();// unordered, doesn't allow duplicates and allows one null
															// object
		Map<Integer, String> hashmap = new HashMap<Integer, String>();// maps values with keys, allows duplicate
																		// values,requires unique keys.
		arraylist.add(1);
		arraylist.add(1);// allows duplicates
		arraylist.add(2);
		hashset.add(1);
		hashset.add(1);// doesn't allow duplicate
		hashset.add(2);
		hashmap.put(1, "one");
		hashmap.put(1, "One");// overwrites the value in the existing key
		hashmap.put(2, "two");
		System.out.println(arraylist);
		System.out.println(hashset);
		System.out.println(hashmap);

	}

}
