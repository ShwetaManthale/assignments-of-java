package assignments;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.ListIterator;
import java.util.Set;

public class Assignment_no84 {

	public static void main(String[] args) {
		Set a1 = new HashSet();
		a1.add(134);
		a1.add("shweta");
		a1.add(139);
		a1.add(null);
		a1.add(10);
		System.out.println(a1);
		
		Set a2 = new HashSet();
		a2.add(56);
		a2.add(99);
		a2.add(88);
		//Collections.sort(a2); sorting is not possible in set interface
		
		
		System.out.println(a2);
		
		
		Iterator i=a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		

	}

}
