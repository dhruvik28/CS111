public class Party {
	public static void main(String[] args) {

		System.out.print("The number of people attending the party? ");
		int people = IO.readInt();

		System.out.print("The number of slices of pizza each person should be able to eat? ");
		int slicePerPerson = IO.readInt();

		System.out.print("The number of cans of soda each person should be able to drink? ");
		int cansPerPerson = IO.readInt();

		System.out.print("The cost of a pizza pie? ");
		double costPizzaPie = IO.readDouble();

		System.out.print("The number of slices in a pizza pie? ");
		int slicesPerPie = IO.readInt();

		System.out.print("The cost of a case of soda? ");
		double costCaseSoda = IO.readDouble();

		System.out.print("The number of cans in a case of soda? ");
		int cansPerCase = IO.readInt();

		int totalSlices = slicePerPerson*people;
		int neededPizzaPies = totalSlices/slicesPerPie;
		if(totalSlices%slicesPerPie != 0) {
			neededPizzaPies = neededPizzaPies + 1;
		}
		double pizzaCost = neededPizzaPies*costPizzaPie;

		int totalCans = cansPerPerson*people;
		int neededCases = totalCans/cansPerCase;
		if(totalCans%cansPerCase != 0){
			neededCases = neededCases + 1;
		}
		double sodaCost = neededCases*costCaseSoda;

		double totalCost = (pizzaCost + sodaCost);
		totalCost = (int) (totalCost*100);
		totalCost = totalCost/100;

		IO.outputDoubleAnswer(totalCost);
	}
}