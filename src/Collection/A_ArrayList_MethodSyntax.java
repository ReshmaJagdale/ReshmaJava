package Collection;

import java.util.ArrayList;

public class A_ArrayList_MethodSyntax {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(50);         //comb.of data types can use in this syntax   
		a.add('a');
		a.add(25.40);
		a.add("kiran");
		System.out.println(a);
	//-------------------------------------------------------		
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		b.add(10);   // only specific data types are used..  i,e. Integer,string,character
		b.add(30);   // combination of data types is not allowed i.e. int,char,string
		b.add(50);       
		b.add(70);
		b.add(40);
		System.out.println(b);
	//--------------------------------------------------------		
		System.out.println(b.get(0));   //get method with index
		System.out.println(b.get(1));
		System.out.println(b.get(1)+b.get(3));
	//-------------------------------------------------------		
		b.set(0, 15);           //set method -> we can change the value
		System.out.println(b);  // 0-index & 15-value here
	//--------------------------------------------------		
		System.out.println("Total Size-->"+ b.size()); //size method
	//------------------------------------------		
		b.remove(0);        //remove Method-> we can remove data 
		System.out.println(b);
		
		System.out.println("Updated Size->"+ b.size()); //4

	}

}
