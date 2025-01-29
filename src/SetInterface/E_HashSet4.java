package SetInterface;

import java.util.LinkedHashSet;

import java.util.Iterator;

public class E_HashSet4 {

	public static void main(String[] args) {
		LinkedHashSet <String>LHS = new LinkedHashSet<String>();
		LHS.add("Apple");
		LHS.add("Cherry");
		System.out.println(LHS.add("Cherry"));
		LHS.add("Banana");
		LHS.add(null);
		LHS.add(null);
		System.out.println(LHS);
		System.out.println(LHS.size());
		for(String str : LHS) {
		System.out.println(str);
		}
		Iterator it = LHS.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		System.out.println(LHS.isEmpty());
		System.out.println(LHS.contains("Apple"));
		System.out.println(LHS.contains("App1e"));


	}

}
