package assignments;

public class Assignment_no104 {

	public static void main(String[] args) {
		int a=10;
		int b= 20;
		int c= 30;
		//which ever block is executed first tht will execute
		if(a<b) {
			System.out.println("1");
		}
		else if(b<c){
			System.out.println("2");
		}
		else if(a==b) {
			System.out.println("3");
		}
		else if(a==b && b<c ) {
			System.out.println("4");
		}
		
		else if(a==b || b<c ) {
			System.out.println("4");
		}

		else
		{
			System.out.println("6");
		}

	}

}
