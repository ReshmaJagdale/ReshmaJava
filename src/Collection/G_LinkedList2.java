package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class G_LinkedList2 {

	public static void main(String[] args) {
		//Create Link List
		
		LinkedList<String> fruit=new LinkedList<String>();
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapes");
		fruit.add("orange");
		System.out.println(fruit);
		
		//Access Element
		System.out.println(fruit.getFirst());
		System.out.println(fruit.getLast());
		
		//Remove elements
		fruit.removeFirst();
		System.out.println(fruit);
		
		
		fruit.removeLast();
		System.out.println(fruit);
		
		System.out.println(fruit.contains("Apple"));
		
		//Update Element
		fruit.set(0, "Cherry");
		System.out.println(fruit);
		
		LinkedList LL1=new LinkedList();
		LL1.add("R");
		LL1.add("E");
		LL1.add("S");
		LL1.add("H");
		LL1.add("M");
		LL1.add("A");
		LinkedList LL2 = new LinkedList();
		LL2.addAll(LL1);
		System.out.println(LL2);
		
		//Remvoe all
		LL2.removeAll(LL1);
		System.out.println(LL2);
		
		Collections.sort(LL1);
		System.out.println(LL1);
		
		Collections.sort(LL1,Collections.reverseOrder());
		System.out.println(LL1);
		}
		
	}


