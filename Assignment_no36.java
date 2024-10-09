package assignments;

public class Assignment_no36 {

	public static void main(String[] args) {
		//in the given string how many are alphabets ,numerics ,special character and spaces
		int count_of_letter=0;
		int count_no=0;
		int count_space=0;
		int count_spclchar=0;
		String s1="shweta soma 123 @#$";
		char c1[]=	s1.toCharArray();
					
		for(int i=0;i<s1.length();i++) {
						
		boolean b1=Character.isLetter(c1[i]);
		boolean b2=Character.isDigit(c1[i]);
		boolean b3=Character.isWhitespace(c1[i]);
		boolean b4=Character.isSpaceChar(c1[i]);
		
		if(b1==true) 
		{
		count_of_letter++;
		}
		if(b2==true)
		{
		count_no++;
		}
		if(b3==true)
		{
		count_space++;
		}
		if(b4==true)
		{
		count_spclchar++;
		
		}
					
		}
		System.out.println("the no of letter in the given string is "+count_of_letter);
		System.out.println("the no of digit in the given string is "+count_no);
		System.out.println("the no of spaces in the given string is "+count_space);
		System.out.println("the no of special character in the given string is "+count_spclchar);

	}

}
