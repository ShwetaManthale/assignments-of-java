package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment_no46 {

	public static void main(String[] args) {
		// iterate list interface
		List l1= new ArrayList();
		l1.add("shweta");
		l1.add(null);
		l1.add(24);
		l1.add(24);
		l1.add("string");
		
		System.out.println(l1);
		
		Iterator i= l1.iterator(); //using forward direction with iterator cursor
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ListIterator li= l1.listIterator();//using bot forward and backward direction with listiterator cursor
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
