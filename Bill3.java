// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	
	 
	public static void main(String[] args) {
		
		// To get you started, here is the first line in the program:
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double bill = Double.parseDouble(args[3]);
		bill = bill /3;
		bill = Math.ceil(bill);
	
		System.err.println("Dear " +name3 +", "+ name2 +", and " + 
		name1 +": pay " + bill +" Shekels each" ); 

	}
}/* 

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
}*/
