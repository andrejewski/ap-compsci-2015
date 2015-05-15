
public class HiddenWord {

	private String word;

	public HiddenWord(String w) {
		word = w;
	}

	/*
		Preconditions:
		- word.length == guess.length
		- guess == guess.toUpperCase()
	*/
	public String getHint(String guess) {
		String hintStr = "";
		for(int i = 0; i < word.length(); i++) {
			if (guess.charAt(i) == word.charAt(i))
				hintStr += guess.charAt(i);
			else if (word.indexOf(guess.charAt(i)) != -1)
				hintStr += '+';
			else
				hintStr += '*';

		}
		return hintStr;
	}

}