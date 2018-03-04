public class Resistor {
	public static void main(String [] args) {
		System.out.print("What is the integer corresponding to the first band? ");
		int band1 = IO.readInt();

		if(band1 != 0 && band1 != 1 && band1 != 2 && band1 != 3 && band1 != 4 && band1 != 5) {
			System.out.print("Error");
			return;
		}

		System.out.print("What is the integer corresponding to the second band? ");
		int band2 = IO.readInt();

		if (band2 != 0 && band2 != 1 && band2 != 2 && band2 != 3 && band2 != 4 && band2 != 5) {
			System.out.print("Error");
			return;
		}

		if (band1 == 0 && band2 == 0) {
			System.out.print("Error");
			return;
		}

		System.out.print("What is the integer corresponding to the third band? ");
		int band3 = IO.readInt();

		if (band3 != 0 && band3 != 1 && band3 != 2 && band3 != 3 && band3 != 4 && band3 != 5) {
			System.out.print("Error");
			return;
		}

		int digit1 = band1*10;

		int value = digit1 + band2;
		int multiplier = 0;

		if (band3 == 0) {
			multiplier = 1;
		}
		if (band3 == 1) {
			multiplier = 10;
		}
		if (band3 == 2) {
			multiplier = 100;
		}
		if (band3 == 3) {
			multiplier = 1000;
		}
		if (band3 == 4) {
			multiplier = 10000;
		}
		if (band3 == 5) {
			multiplier = 100000;
		}

		int resistance = value*multiplier;

		System.out.print(resistance + " ohms ");
	}
}