package assignments;

import java.util.Date;

public class Assignment_no37 {

	public static void main(String[] args) {
	//present time using date class
	 Date d1=new Date();
	 System.out.println(d1.getTime());
	 
	 Date d2=new Date(d1.getTime());
	 System.out.println(d2);
	}

}
