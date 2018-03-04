public class TwoSmallest{
	public static void main(String[] args){

		double terminating = IO.readDouble();
		double smallest = IO.readDouble();
		double secondSmallest = 0;
		double input;

		while(smallest == terminating){
			IO.reportBadInput();
			smallest = IO.readDouble();
		}

		if(smallest != terminating){
			secondSmallest = IO.readDouble();
			while(secondSmallest == terminating){
				IO.reportBadInput();
				secondSmallest = IO.readDouble();
			}
			if(secondSmallest != terminating){
				if(secondSmallest < smallest){
					double temp = smallest;
					smallest = secondSmallest;
					secondSmallest = temp;
				}
			}
		}

		input = IO.readDouble();
		while(input != terminating){
			if(input < secondSmallest){
				if(input < smallest){
					double temp = smallest;
					smallest = input;
					secondSmallest = temp;
				} else {
					secondSmallest = input;
				}
			}
			input = IO.readDouble();
		}
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(secondSmallest);
	}
}