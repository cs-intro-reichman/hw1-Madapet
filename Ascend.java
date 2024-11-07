// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Replace this comment with your code\
		int minRange = Integer.parseInt(args[0]); // Get from the user the minimum  for the range 
		int maxRange = Integer.parseInt(args[1]); // Get from the user the maximum for the range 
		double num1 = Math.random() * (maxRange-minRange) + minRange; // First random number insdie the range 
		double num2 = Math.random() * (maxRange-minRange) + minRange; // Secound random number inside the range  
		double num3 = Math.random() * (maxRange-minRange) + minRange; // third random number inside the range 
		int max = Math.max((int)num1, Math.max((int)num2, (int)num3)); // Get the maximum number 
		int min = Math.min((int)num1, Math.min((int)num2, (int)num3)); // Get the minimum number 
		int middle = (int)(num1+num2+num3)-min-max; // Get the middle number 
		// Print by order 
		System.out.println(max);
		System.out.println(middle);
		System.err.println(min);


		
		
	}
}
