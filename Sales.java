public class Sales {
	public static void main(String[] args) {

		System.out.println("What is the total sales charge?");
		double charge = IO.readDouble();

		if(charge <= 0){
			IO.reportBadInput();
		}

		System.out.println("How much is the customer giving?");
		double giving = IO.readDouble();

		if(giving <= 0){
			IO.reportBadInput();
		}

		double change = giving - charge;

		if(change >= 20){
			int twenty = change/20;
			int twentyBills = twenty*20;
			if(twentyBills != 0){
				int ten = change - twentyBills;
			}
		}

	}
}