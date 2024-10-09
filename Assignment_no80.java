package assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment_no80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(134);
		a1.add("shweta");
		a1.add(134);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		
		ListIterator i1=a1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}

	}

}
