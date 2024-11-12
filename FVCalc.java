// Computes the future value of a saving investment.

import java.util.stream.Gatherer.Integrator;

public class FVCalc {
	public static void main(String[] args){
		int saving = Integer.parseInt(args[0]);
		int interestRate = Integer.parseInt(args[1]);
		int timeFrame = Integer.parseInt(args[2]);
		double rate = interestRate / 100;
		double futureValue = saving;
		double time = timeFrame;
		while (time >0 ) {
			time --;
			futureValue += futureValue * rate;
		}
		System.err.print("After "+(int)timeFrame+" years, a $"+ (int)saving+ " saved at "+ interestRate+"%25 will yield $"+(int)futureValue);
		// Replace this comment with your code
	}
}