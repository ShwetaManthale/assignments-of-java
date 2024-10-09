package assignments;
//single level inheritance both classes in same classes

class Parent_class
{
	void add(int a,int b) 
	{
		int sum= a+b;
		System.out.println(sum);
		
	}
}
public class Assignment_no57 extends Parent_class{
	void sub(int a, int b)
	{
		int c= a-b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Assignment_no57 a= new Assignment_no57();
		a.add(8, 9);
		a.sub(10, 20);
		
		

	}

}
