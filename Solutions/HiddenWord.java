
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
		char[] hintChars = new char[word.length()];
		for(int i = 0; i < word.length(); i++) {
			char c = guess.charAt(i);
			char e = '*';
			for(int j = 0; j < word.length(); j++) {
				if(c == word.charAt(j)) {
					if(j == i) { e = c; }
					else { e = '+'; }
				}
			}
			hintChars[i] = e;
		}
		return new String(hintChars);
	}

}