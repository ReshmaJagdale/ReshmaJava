package SetInterface;

import java.util.HashSet;

public class C_HashSet2 {

	public static void main(String[] args) {
		
		//Converting HasSet to Array;
		HashSet<String> Cities = new HashSet<String>(); //16 -	LF - 0.75
		Cities.add("Pune");
		Cities.add("Mumbai");
		Cities.add("London");
		Cities.add("Tokyo");
		System.out.println(Cities);
		//Converting hashset to array
		String [] cityarray = Cities.toArray(new String[1]);
		System.out.println(cityarray);
		for(String Str :cityarray) {
		System.out.println(Str);
		}

		
	}

}
