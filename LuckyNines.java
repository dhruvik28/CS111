public class LuckyNines {
	public static int countLuckyNines(int lowerEnd, int upperEnd) {

	int nine = 0;

	if(lowerEnd > upperEnd){
		return -1;
	}

	for(int i = lowerEnd; i <= upperEnd; i++){
		int temp = i;
		if(temp < 0){
			temp = Math.abs(temp);
		}
		while(temp >= 9){
			if(temp%10 == 9){
				nine++;
			}
			temp = temp/10;
		}
	}
	return nine;
}

	public static void main(String[] args){
		int start = IO.readInt();
		int end = IO.readInt();
		int nine = countLuckyNines(start,end);
		IO.outputIntAnswer(nine);
	}
}