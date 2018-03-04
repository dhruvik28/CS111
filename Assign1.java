public class Assign1 {
	public static void main(String[] args) {

		System.out.print("Enter the color of the first band: ");
		String band1 = IO.readString();
		

		if(band1.equals("black")) {
			int digit1 = 0;
		}
		if(band1.equals("brown")) {
			int digit1 = 1;
		}
		if(band1.equals("red")) {
			int digit1 = 2;
		}
		if(band1.equals("orange")) {	
			int digit1 = 3;
		}
		if(band1.equals("yellow")) {
			int digit1 = 4;
		}
		if(band1.equals("green")) {
			int digit1 = 5;
		}
		System.out.print("Enter the color of the second band: ");
		String band2 = IO.readString();

		if(band2.equals("black")) {
			int digit2 = 0;
		}
		if(band2.equals("brown")) {
			int digit2 = 1;
		}
		if(band2.equals("red")) {
			int digit2 = 2;
		}
		if(band2.equals("orange")) {
			int digit2 = 3;
		}
		if(band2.equals("yellow")) {
			int digit2 = 4;
		}
		if(band2.equals("green")) {
			int digit2 = 5;
		}
		System.out.println("band 1: " + digit1 + " band 2: " + digit2);
	}
}