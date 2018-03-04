public class Casting {
	public static void main(String[] args) {

		int a = 5;
		int b;
		double c = 5.42;
		double d;

		b = a;
		d = a;
		d = c;

		b = (int) c;
		c = a + b;
		c = d + a*b;
		c = (d+a)*b;
		b = a/a;
		b = (int) c/a;
		d = c/a; // you can do double over int, but not int over double*/

		System.out.print(a + " " + b + " " + c + " " + d);

	}
}