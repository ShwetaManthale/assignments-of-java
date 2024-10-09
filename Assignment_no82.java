package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment_no82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(134);
		a1.add("shweta");
		a1.add(134);
		a1.add(null);
		a1.add(null);
		
		ArrayList a2 = new ArrayList();
		a2.add(56);
		a2.add(99);
		a2.add(88);
		Collections.sort(a2);
		
		
		System.out.println(a2);
		
		//Collections.sort(a1);
		System.out.println(a1);
		
		Iterator i=a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		ListIterator i1=a1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}

	}

}
