package assignments;

import java.util.Arrays;

public class Assignment_no78 {

	public static void main(String[] args) {
		
		int array1[]=new int [3];
		array1[0]=30;
		array1[1]=40;
		array1[2]=50;
		int array2[]=new int [3];
		
		for(int i=0,k=2;i<array1.length;i++,k--) {
			array2[k]=array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

	}


