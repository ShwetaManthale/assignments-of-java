package assignments;

import java.util.Date;

public class Assignment_no38 {

	public static void main(String[] args) {
		// future time
		Date d1=new Date();
		 System.out.println(d1.getTime());
		 
		 Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
		 System.out.println(d2);

	}

}
