package SetInterface;

import java.util.TreeSet;

public class F_HashSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(10);
		TreeSet<String> names = new TreeSet<String>();
		names.add("David");
		names.add("Rahul");
		names.add("Rohit");
		names.remove("David");
		System.out.println(names);
		System.out.println(numbers);
		System.out.println(names.contains("Rahul"));
		System.out.println(names.contains("Rahu1l"));
		System.out.println(names.size());
		for(String str :names) {
		System.out.println(str);
		}

	}

}
