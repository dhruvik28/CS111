public class LuckySevens {
	public static void main(String[] args) {

		int lowerEnd = IO.readInt();
		int upperEnd = IO.readInt();
		int seven = 0;

		if(lowerEnd > upperEnd){
			IO.reportBadInput();
			return;
		}

		for(int i = lowerEnd; i <= upperEnd; i++){
			int temp = i;
			if(temp < 0){
				temp = Math.abs(temp);
			}
			while(temp >= 7){
				if(temp%10 == 7){
					seven++;
				}
				temp = temp/10;
			}
		}
		IO.outputIntAnswer(seven);
	}
}