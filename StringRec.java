public class StringRec{

	public static String decompress(String compressedText){
	
		if(compressedText == null){
			return "";
		}
		if(compressedText.length() <= 1){
			return compressedText;
		}
		else if(compressedText.charAt(0) == '0' && compressedText.length() > 2){
			return decompress(compressedText.substring(2));
		}
		else if(compressedText.charAt(0) == '0' && compressedText.length() == 2){
			return "";
		}else{
			if(Character.isLetter(compressedText.charAt(0))){
				return compressedText.substring(0,1) + decompress(compressedText.substring(1));	
			}
			if(Character.isDigit(compressedText.charAt(0))){
				return compressedText.charAt(1) + decompress((compressedText.charAt(0) - '1') + compressedText.substring(1));
			}
			return "";
		}
	}

	public static void main(String[] args){
		String s = "q9w5e2rt5y4qw2Er3T";
		String result = decompress(s);
		System.out.println(result);
	}
}