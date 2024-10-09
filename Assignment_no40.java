package assignments;
//upcasting program

class Parent{
	
	void get() {
		
		System.out.println("printing parent method");
	}
	
	
	
}
class Child extends Parent{
	void get() {
		System.out.println("printing child class method");
	}
	
	
	
}
public class Assignment_no40 {

	public static void main(String[] args) {
		Parent p1= (Parent)new Child();
		Parent p2= (Parent)new Child();
		p1.get();
		p2.get();
				

	}

}
