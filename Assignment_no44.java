package assignments;

public class Assignment_no44 {

	public static void main(String[] args) {
		//if the given no is present in array or not
		int a[] = new int [5];
		a[0]=34;
		a[1]=99;
		a[2]=55;
		a[3]=88;
		a[4]=22;
		 int no_tocheck=34;
		 
		 for(int i=0;i<5;i++) {
			 if(no_tocheck==a[i]){
				 
				 System.out.println("the given number "+no_tocheck + " is present in the given array");
				 System.out.println("the index number of given array is "+i);
				 
			 }
		 }
			
		 }

	}


