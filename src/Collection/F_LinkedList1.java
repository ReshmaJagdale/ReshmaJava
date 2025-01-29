package Collection;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class F_LinkedList1 {

	public static void main(String[] args) {
		LinkedList LL1=new LinkedList();
		LinkedList LL2=new LinkedList();
		
		LL1.add(10);     //0 index
		LL1.add('B');    //1 index
		LL1.add("Java");
		LL1.add(true);
		LL1.add(null);
		LL1.add("Automation");
		LL1.add(44.5);            //6 index
		System.out.println(LL1); 
		
		//Size
		int len=LL1.size();
		System.out.println(len);
		//System.out.println(LL1.size());
		
		//Remove
		System.out.println(LL1.remove(1));
		System.out.println(LL1);
		
		//get
		System.out.println(LL1.get(3));
		
		//add
		LL1.add(3,"Test");
		System.out.println(LL1);
		
		//Addlast
		LL1.addLast("Java");
		
		System.out.println(LL2.isEmpty());
		
		//FOR lOOP
		for(int i=0;i<LL1.size();i++) {
			System.out.println(LL1.get(i));
		}
		
		//Advance For loop
		for(Object Obj:LL1) {
			System.out.println(Obj);
			
			//Iteration
			//Iterator str = LL1.iterator();
		//	while(str.hasNext()) {
		//System.out.println(str.next());
			}

		}
		
	}


