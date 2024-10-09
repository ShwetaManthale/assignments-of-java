package assignments;

public class Assignment_no33 {

	public static void main(String[] args) {
		//palindrome or not
		String s1="malayalam";
		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--) {
		char c1=s1.charAt(i);
		s2=s2+c1;
		
		}
		System.out.println(s2);
		if(s2.equals(s2)==true) {
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not palindrome");
		}
	}

}
