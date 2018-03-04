public class WordCount{

	public static int countLetters(String original){
		int count = 0;

		for(int i = 0; i < original.length(); i++){
			if(Character.isLetter(original.charAt(i))){
				count++;
			}
		}
		return count;
	}

	public static int countWords(String original, int minLength){
		String words[] = original.split(" ");
		int count = 0;
		
		if(minLength <= 0){
			return -1;
		}

		for(int i = 0; i < words.length; i++){
			if(countLetters(words[i]) >= minLength){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		int words = countWords(IO.readString(), IO.readInt());
		IO.outputIntAnswer(words);
	}
}