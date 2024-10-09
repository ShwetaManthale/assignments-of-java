package assignments;


//constructor overloading
public class Assignment_no49 {
	
	Assignment_no49(int a, int b)
	{
		 int sum= a+b;
		 System.out.println(sum);
		
	}
	Assignment_no49()
	{
		System.out.println("constructor overloading method");
	}

	public static void main(String[] args) {
		Assignment_no49 a= new Assignment_no49();
		 new Assignment_no49(100,100);
		

	}

}
