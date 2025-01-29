package SetInterface;

import java.util.HashSet;

import java.util.Iterator;

public class B_HashSet {

	public static void main(String[] args) {
		HashSet HS = new HashSet(); //AL DC = 10 ,16 Load
	//	Factor Fillratio - 0.75
		HS.add("Java");
		HS.add(444);
		HS.add(true);
		HS.add('D');
		HS.add(null);
		HS.add(null);
		System.out.println(HS);
		System.out.println(HS.add(444)); //false
		System.out.println(HS.add("Java1")); //True
		System.out.println(HS);
		//If ur trying to add duplicate element it will return false
		HashSet <String> HS1 = new HashSet<String>();
		HS1.add("Apple");
		HS1.add("Banana");
		HS1.add("Cherry");
		HS1.add("Apple");
		System.out.println(HS1);
		//check t=if an element exists
		System.out.println(HS1.contains("Apple"));
		//Remove an element
		HS1.remove("Apple");
		System.out.println(HS1);
		HashSet <Integer> HS2 = new HashSet<Integer>();
		HS2.add(10);
		HS2.add(20);
		HS2.add(30);
		HS2.add(40);
		// for(int i=0 ;i<HS2.size();i++) {
		// System.out.println(HS2.ge);
		// }
		for(Integer num :HS2) {
		System.out.println(num);
		}
		//Using iterator
		System.out.println();
		Iterator obj = HS2.iterator();
		while(obj.hasNext()) {
		System.out.println(obj.next());
		}
		}
		}
