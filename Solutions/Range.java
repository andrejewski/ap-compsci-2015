
public class Range implements NumberGroup {
	private int min;
	private int max;

	public Range(int low, int high) {
		min = low;
		max = high;
	}

	public boolean contains(int number) {
		return min <= number && number <= max;
	}
}
