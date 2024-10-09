package assignments;



//method overriding concept
class Override{
	
	
	void login()
	{
		System.out.println("1");
	}
}
public class Assignment_no62 extends Override {
	
	void login() 
	{
		
		System.out.println("3");
	}


	public static void main(String[] args) {
		Assignment_no62 a= new Assignment_no62();
		a.login();


	}

}
