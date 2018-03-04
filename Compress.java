public class Compress{

	public static String compress(String original){

		int count = 0;
		String result = "";

		for(int i = 0; i < original.length(); i++){
			if(i == original.length() - 1){
				if(count == 0){
					result += original.charAt(i);
					break;
				}else{
					result = result + (count + 1) + original.charAt(i);
					break;
				}
			}
			if(original.charAt(i) == original.charAt(i + 1)){
				count++;
			} else if(count == 0){
				result += original.charAt(i);
			} else{
				result = result + (count + 1) + original.charAt(i);
				count = 0;
			}
		}
		return result;
	}

	public static void main(String[] args){
		String compressed = compress(IO.readString());
		IO.outputStringAnswer(compressed);
	}
}