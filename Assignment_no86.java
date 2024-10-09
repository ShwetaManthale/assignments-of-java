package assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment_no86 {

	public static void main(String[] args) {
		
			Queue a1 = new LinkedList();
			a1.add(134);
			a1.add("shweta");
			a1.add(134);
			a1.add(null);
			a1.add(null);
			System.out.println(a1);
			
			Queue a2 = new LinkedList();
			a2.add(56);
			a2.add(99);
			a2.add(88);
			//Collections.sort(a2);
			
			
			System.out.println(a2);
			
			
			Iterator i=a1.iterator();
			
			while(i.hasNext()) {
				System.out.println(i.next());
				
			}
			
			



	}

}
