package assignments;

import java.util.Enumeration;
import java.util.Stack;

public class Assignment_no81a {

	public static void main(String[] args) {
		Stack a1= new Stack();
		a1.add(134);
		a1.add("shweta");
		a1.add(137);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		
		Enumeration e1=a1.elements(); //it will aplicable for legacy classes so stack and vector are old classes
		
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		

	}

}
