public class SimplifyFraction{

	public static void main(String[] args){

		int numerator = IO.readInt();
		int denomimator = IO.readInt();

		while(denomimator == 0){
			IO.reportBadInput();
			denomimator = IO.readInt();
		}

		int gcf = Methods.gcf(numerator, denomimator);
		numerator /= gcf;
		denomimator /= gcf;
		System.out.println(numerator + "/" + denomimator);
	}
}