package assignments;

abstract class Child3 {
	
	public abstract void login(); //abstract method
	
	 public void sleep()  //concrete method
	 	{
		 
		    System.out.println("Zzz");
		  }
}
	 class Example extends Child3{
		// @Override
			public void login() {
				
				System.out.println("override method");
				
			}
	 }
	class Assignment_no65{
	public static void main(String[] args) {
		Example c2 = new Example();
		c2.login();
		c2.sleep();
	

	}

	 }
	 
