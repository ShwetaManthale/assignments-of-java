
package assignments;

//super keyword
class Superkeyword1{
	
	
	void getcode()
	{
		System.out.println("1");
	}
}
public class Assignment_no63 extends  Superkeyword1  {
	
	void getcode() 
	{
		super.getcode();
		System.out.println("3");
	}


	public static void main(String[] args) {
		Assignment_no63 a= new Assignment_no63();
		a.getcode();


	}

}

