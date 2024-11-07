// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int inputNum = Integer.parseInt(args[0]);
		System.out.println(inputNum/100 + " hundreds, "+
		((inputNum/10)%10) +" tens, and "+ inputNum%10 + " ones.");
	}
}
