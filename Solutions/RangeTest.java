
public class RangeTest {
	public static void main(String[] args) {

		NumberGroup range = new Range(-3, 2);

		Assert.ok("-3", range.contains(-3));
		Assert.ok("-2", range.contains(-2));
		Assert.ok("-1", range.contains(-1));
		Assert.ok("0", range.contains(0));
		Assert.ok("1", range.contains(1));
		Assert.ok("2", range.contains(2));

		Assert.ok("-4", !range.contains(-4));
		Assert.ok("3", !range.contains(3));

	}
}