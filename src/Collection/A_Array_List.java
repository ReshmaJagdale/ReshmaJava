package Collection;

import java.util.ArrayList;

public class A_Array_List {

	public static void main(String[] args) {
		//Array                           //static--similar data Type
		int arr[]=new int [10];
		
		arr[0]=50;
		arr[9]=80;
		System.out.println(arr);
		System.out.println(arr.length);
		
		//Array List
		ArrayList AL=new ArrayList();   //Ds-10 Dynamic array- no similar datatype
		
		ArrayList<Integer>AL1=new ArrayList<Integer>(); //static type -Similar Data type
		
		//1. Add --->to add or insert the element in array list
		
		AL.add(20);
		AL.add(50);
		AL.add("Java");
		AL.add(true);
		AL.add(49.4f);
		AL.add('R');
		AL.add(null);
		AL.add("python");
		AL.add(20);
		AL.add(44.5f);
		AL.add(50);
		
		System.out.println(AL);
		//2.size-return the number of element in this list
		
		System.out.println(AL.size());
		
		//3.Remove
		System.out.println(AL.remove(2));
		AL.add("Automation");
		System.out.println(AL);
		
		System.out.println(AL.get(9));
		
		//4.Contains-Return True if the list contains the specified element
		
		System.out.println(AL.contains(20)); //True
		System.out.println(AL.contains(2000));//False
		
		System.out.println(AL.contains("python"));
		
		//5.Get  Emthod Retrieve the element --CharAt()
		
		System.out.println(AL.get(7));
		System.out.println(AL.get(2));
		
		//6.set -Replace or change the value
		AL.set(2,"Ruby");
		System.out.println(AL);
		
		AL.set(3,2000);
		System.out.println(AL);
		
		//7. Is Empty
		System.out.println(AL.isEmpty());
		System.out.println(AL1.isEmpty());
		
		//Read/Print the data from given arraylist
		//By using simple loop
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));	
		}
		System.out.println();
		//2.
		for(Object obj:AL) {
			System.out.println(obj);
			
		}
		
	}

}
