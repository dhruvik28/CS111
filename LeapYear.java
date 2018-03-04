public class LeapYear{
	public static void main(String[] args){

		System.out.println("What year do you wish to investigate?");
		int year = IO.readInt();

		boolean leap = false;
		if (year % 4 == 0) { 
			if (year % 400 == 0) { 
				leap = true; 
			} else if (year % 100 == 0) { 
				leap = false; 
			} else { 
				leap = true; 
			} 
		} else{
			leap = false;
		}
		System.out.println(leap);
	}
}