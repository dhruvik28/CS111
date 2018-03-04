public class Integers{
	public static void main(String[] args){
		
		int x = IO.readInt();
		int y = IO.readInt();

		if(x%y == 0 || y%x == 0){
			System.out.println("div");
		} if(x%2 != 0 && y%2 != 0){
			System.out.println("odd");
		} if(x > y){
			System.out.println("xbigger");
		}else{
			
		}
	}
}