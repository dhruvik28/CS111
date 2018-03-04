public class PigLatin{
	public static String translate(String original){
		if(original.startsWith("a") || original.startsWith("e") || original.startsWith("i") ||
			original.startsWith("o") || original.startsWith("u")){
			return original + "way";
		} else{
			return original.substring(1, original.length()) + original.charAt(0) + "ay";
		}
	}

	public static void main(String[] args){
		String original = new String();
		original = IO.readString();
		IO.outputStringAnswer(translate(original));
	}
}