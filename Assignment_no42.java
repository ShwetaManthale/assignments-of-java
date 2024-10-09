package assignments;

public class Assignment_no42 {

	public static void main(String[] args) throws NullPointerException {
		
		
		try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("exception occure");
            throw e; 
        }
		

	}

}
