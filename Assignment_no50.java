package assignments;

public class Assignment_no50 {
	static int a=20; //global variable
	final static int leapyear =365; //final variable
	
	static void sum(int a, int b) {
		
		int c=  a+b; //local variable
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("global variable is "+a);
		System.out.println("final variable is "+leapyear);
		sum(46,55);
	}

}
