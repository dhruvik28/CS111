public class PayFriend {
	public static void main(String[] args) {

		System.out.print("What is the payment amount? ");
		double amount = IO.readDouble();

		if(amount <= 0){
			while(amount <= 0){
			IO.reportBadInput();
			System.out.print("Amount needs to be greater than 0. Input appropriate amount: ");
			amount = IO.readDouble();
				if(amount > 0){
					break;
				}
			}
		}
		
		double fee = 0;
		if (amount <= 100.00) {
			fee = 5.00;
		} else if(amount < 1000.00){
			if (amount*0.03 < 6.00){
				fee = 6.00;
			} else {
				fee = amount*0.03;
			}
		} else if(amount < 10000.00){
			if (amount*0.01 < 15.00){
				fee = 15.00;
			} else {
				fee = amount*0.01;
			}
		} else {
			if (amount == 10000.00){
				fee = amount*0.01;
			} else if (amount <= 15000.00){
				fee = (10000*0.01) + (amount-10000)*0.02;
			} else {
				fee = (10000*0.01) + (5000*0.02) + (amount - 15000)*0.03;
			}
		}
		IO.outputDoubleAnswer(fee);
	}
}