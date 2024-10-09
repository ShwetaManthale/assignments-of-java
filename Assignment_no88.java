package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_no88 {

	public static void main(String[] args) {
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(123, "shweta");
		m1.put(124, "akash");
		m1.put(125, "vani");
		m1.put(126, "satish");
		m1.put(127, "mangala");
		
		System.out.println(m1);
		
		
		Set<Entry<Integer,String>> s2=m1.entrySet();
		Iterator<Entry<Integer,String>> i2= s2.iterator();
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
