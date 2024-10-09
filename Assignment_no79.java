package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment_no79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(134);
		a1.add("shweta");
		a1.add(134);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		
		Iterator i=a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}

	}

}
