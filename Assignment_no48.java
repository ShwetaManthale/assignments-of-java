package assignments;


//method overloading

public class Assignment_no48 {
	
	  void add(int a, int b) {
		  int sum= a+b;
		  System.out.println(sum);
		  
	  }
	  void add() {
		  
		  System.out.println("printing the add method");
	  }

	public static void main(String[] args) {
		Assignment_no48 a= new Assignment_no48();
		a.add();
		a.add(78, 99);
		

	}

}
