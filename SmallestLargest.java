public class SmallestLargest{
	public static void main(String[] args){

		double terminating = IO.readDouble();
		double largest = IO.readDouble();
		double smallest = Integer.MAX_VALUE;
		double input;

		while(largest == terminating){
			IO.reportBadInput();
			return;
		}
		if(largest != terminating){
			smallest = IO.readDouble();
			if(smallest == terminating){
				IO.outputDoubleAnswer(largest);
				IO.outputDoubleAnswer(largest);
				return;
			}else if(smallest > largest){
				double temp = smallest;
				smallest = largest;
				largest = temp;
			}
		}

		input = IO.readDouble();
		while(input != terminating){
			if(input < largest){
				if(input < smallest){
					smallest = input;
				}
			}else{
				largest = input;
			}	
			input = IO.readDouble();
		}		
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(largest);
	}
}