package Collection;

import java.util.ArrayList;

import java.util.Iterator;

public class B_Array_List1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(50);         //combination of data types can use in this syntax   
		a.add('a');
		a.add(25.40);
		a.add("Reshma");
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
				
				/*Read/Print the array from given arraylist
				1.By Using simple Loop
				2.Advance for Loop
				3.Ierator   */
			//	==============================
				System.out.println("By Using simple Loop");
				//1.By Using simple Loop
				for(int i=0 ;i<a.size() ;i++){
				System.out.println(a.get(i));
				}
				
				//2.Advance for Loop
				 System.out.println("Advance for Loop");
				
				for(Object obj:a) {
					System.out.println(obj);
				}
				
				//3.Ierator  
				System.out.println("By using Ierator ");
				Iterator it=a.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
	}

}
