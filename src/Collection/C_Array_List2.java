package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C_Array_List2 {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();  //Dynamic+Hetergenous type
		
		A1.add(400);
		A1.add("Java");
		
		ArrayList<Integer> A2=new ArrayList<Integer>();  //Static Homogenous
		A2.add(33);
		//A2.add("Test");  no other datatype accepted
	//	================================================
		System.out.println("By Using Simple Loop");
		for(int i=0;i<A1.size();i++) {
			System.out.println(A1.get(i));
		}
   //===================================================
		//2.Advance for Loop
		 System.out.println("Advance for Loop");
		
		 for(Object obj:A1) {
			 System.out.println(obj);
		 }
		 
		 ArrayList A3=new ArrayList();  //Dynamic+Hetergenous type
		 A3.add("A");
		 A3.add("B");
		 A3.add("C");
		 A3.add("D");
		 System.out.println(A3);   //O/p:[A, B, C, D]
		 System.out.println(A3.size());  //Size is 4
		 
		// ==================================
		 //AddALL
		 System.out.println("AddALL");
		 //===========
		 ArrayList A4=new ArrayList();
		 A4.addAll(A3);
		 System.out.println(A4);
		 
		//=================
		 //RemoveAll
		 System.out.println("RemoveAll");
		 A4.removeAll(A3);
		 
		 //sort
		 Collections.sort(A3);
		 System.out.println(A3);
		 
		 //Desc Sort
		 Collections.sort(A3,Collections.reverseOrder());
		 System.out.println(A3);
		 
		 
	}

}
