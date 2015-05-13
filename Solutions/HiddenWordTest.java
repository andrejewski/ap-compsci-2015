
public class HiddenWordTest {
	public static void main(String[] args) {

		HiddenWord puzzle = new HiddenWord("HARPS");
		
		Assert.equal("+A+++", puzzle.getHint("AAAAA"));
		Assert.equal("H****", puzzle.getHint("HELLO"));
		Assert.equal("H*++*", puzzle.getHint("HEART"));
		Assert.equal("HAR*S", puzzle.getHint("HARMS"));
		Assert.equal("HARPS", puzzle.getHint("HARPS"));

	}
}