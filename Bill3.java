// Splits a restaurant bill evenly among three diners.
/*public class Bill3 {
	/**
	 
	public static void main(String[] args) {
		
		// To get you started, here is the first line in the program:
		System.err.println("123");

	   
		int bill = Integer.parseInt(args[3]); // Get the bill 
	
		System.err.println("Dear " +args[2] +", "+ args[1] +", and " + 
		args[0] +": pay " + (double)bill +" Shekels each" ); 

	}
}*/

// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name4 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double bill = Double.parseDouble(args[3]);
		bill = bill / 3;
		bill = Math.ceil(bill);
		// Prints the amount each person owes.
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + 
							name4 +": pay " + bill + " Shekels each"); 
	}
}
