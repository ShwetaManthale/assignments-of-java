package assignments;

import java.util.Arrays;

public class Assignment_no34 {

	public static void main(String[] args) {
		//anagram or not
		String s1="saw";
		String s2="was";
	char [] c1=	s1.toCharArray();
	char [] c2=	s1.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	boolean b1=Arrays.equals(c1, c2);
	System.out.println(b1);
	if(b1==true) {
		System.out.println("they are anagram");
	}
	else {
		System.out.println("they are not anagram");
	}
	}

	}


