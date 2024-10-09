package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_no43 {

	public static void main(String[] args) {
		//Accept the value of array at runtime
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the  size of array");
		n=sc.nextInt();
		int a[]= new int [4];
		/* a[0]=sc.nextInt();
		 a[1]=sc.nextInt();
		 a[2]=sc.nextInt();
		 a[3]=sc.nextInt();*/
		 System.out.println("enter the elements of array");
		 for(int i=0;i<4;i++) 
		 {
		 a[i]= sc.nextInt();
		 
		 }
		 System.out.println("array elements are");
		 
		 System.out.println(Arrays.toString(a));
		 
	}

}
