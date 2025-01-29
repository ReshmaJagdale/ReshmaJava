package SetInterface;

import java.util.HashSet;

public class D_HashSet3{

	public static void main(String[] args) {
		//default initial capacity (16) and load factor (0.90).
		HashSet HS1 = new HashSet(100, 0.90f); //100
		HS1.add(1);
		HS1.add(2);
		HS1.add(3);
		HS1.add(44);
		HS1.add(33);
		HashSet HS2 = new HashSet(100, 0.90f); //16
		HS2.add(3);
		HS2.add(44);
		HS2.add(33);
		//Union
		HS1.addAll(HS2);
		System.out.println(HS1); //
		//Intersection
		HS1.retainAll(HS2);
		System.out.println(HS1);


	}

}
