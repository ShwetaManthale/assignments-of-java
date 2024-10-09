package assignments;

public class Assignment_no32 {

	public static void main(String[] args) {
		//reverse string
		String s1="school";
		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--) {
		char c1=s1.charAt(i);
		s2=s2+c1;
		
		}
		System.out.println("the reverse of given string is "+s2);
	}

}
