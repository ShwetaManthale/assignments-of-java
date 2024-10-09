package assignments;

import question.Example4;

public class Assignment_no93 {

	
		private String un="shweta@gmail.com";
		
		public String getun() {
			return un;
			
		}
		public void setun(String un) {
			this.un=un;
			
		}

		public static void main(String[] args) {
			Example4 a= new Example4();
				a.setun("sh@gmail.com");
				
				System.out.println("name "+a.getun());

		}

	}


