package Collection;

import java.util.Iterator;
import java.util.Vector;


public class I_Vector1 {

	public static void main(String[] args) {  //Default size =10
		Vector V1=new Vector();
		//cc*3/2+1
		//CC*2
		
		V1.add('A');
		V1.add('B');
		V1.add('C');
		V1.add('D');
		V1.add('E');
		V1.add('F');
		V1.add('F');
		V1.add('F');
		V1.add('F');
		V1.add('F');
		//V1.add('F');  //20
		int test=V1.capacity();
		System.out.println(test);
		
		V1.add('E');
		int test1=V1.capacity();
		System.out.println(test1);
		V1.add(1,55);
		System.out.println(V1);
		
		for(int i=0 ;i<V1.size();i++) {
		System.out.println(V1.get(i));
		}
		for(Object obj :V1) {
		System.out.println(obj);
		}
		System.out.println();
		
		Iterator it = V1.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}

	}
}

