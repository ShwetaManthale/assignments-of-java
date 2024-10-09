package assignments;

	interface Parent4 {
	
	abstract void add();
	abstract void get();

	
}
class Child4 implements Parent4{

	
	public void add() {
		
		System.out.println("adding the values");
	}

	
	public void get() {
		
		System.out.println("getting the values");
	}
	
}
class Assignment_no66{
	public static void main(String[] args) {
		Child4 c3= new Child4();
		c3.add();
		c3.get();
	}
	
}