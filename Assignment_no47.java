package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Assignment_no47 {

	public static void main(String[] args) {
		//iterate set interface
		
		Set s1= new HashSet();
		
		s1.add("shweta");
		s1.add(null);
		s1.add(24);
		s1.add(25);
		s1.add("string");
		s1.add(99);
		System.out.println(s1);
		
		Iterator i= s1.iterator(); //using forward direction with iterator cursor
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	
	}

}
