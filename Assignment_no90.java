package assignments;

public class Assignment_no90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b1= new StringBuffer("Shweta Soma");
		 b1.append("manthale");
		System.out.println(b1);
		System.out.println(b1.insert(0, "Mrs "));
		
		System.out.println(b1.replace(7, 11, "manthale"));
		
		System.out.println(b1.length());
		
		System.out.println(b1.capacity());
		
		System.out.println(b1.delete(0, 7));
		
		System.out.println(b1.reverse());
		
		System.out.println(b1.charAt(0));
		
		System.out.println(b1.substring(1));
		
		System.out.println(b1.substring(0, 6));
		
		
	}

}
