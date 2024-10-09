package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment_no87 {

	public static void main(String[] args) {
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(123, "shweta");
		m1.put(124, "akash");
		m1.put(125, "vani");
		m1.put(126, "satish");
		m1.put(127, "mangala");
		
		System.out.println(m1);
		
		for(Integer i1 : m1.keySet())
		{
			System.out.println(i1);
		}
		
		for(String s1 : m1.values())
		{
			System.out.println(s1);
		}
		
		for(Entry<Integer, String> e1: m1.entrySet())
		{
			System.out.println(e1);
		}
		

	}

}
