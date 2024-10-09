package assignments;

import assignments.grandparent_class;

class grandparent_class{
	
	grandparent_class(){
		System.out.println("1");
	}
}
class parent_class3 extends grandparent_class{
	parent_class3(int a){
		super();
		System.out.println("2");
	}
	
}

public class Assignment_no60 extends parent_class3 {
	Assignment_no60(){
		super(18);
		System.out.println("3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_no60 a1= new Assignment_no60();
	}

}
