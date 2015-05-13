
public class DiverseArrayTest {
	public static void main(String[] args) {

		// Part A - int arraySum(int[])
		int[] emptyArr = {};
		Assert.equal(0, DiverseArray.arraySum(emptyArr));

		int[] givenArr = {1,3,2,7,3};
		Assert.equal(16, DiverseArray.arraySum(givenArr));

		// Part B - int[] rowSums(int[][])
		int[][] emptyMat = {};
		Assert.equal(emptyArr, DiverseArray.rowSums(emptyMat));

		int[][] givenMat = {
			{ 1, 3, 2, 7, 3},
			{10,10, 4, 6, 2},
			{ 5, 3, 5, 9, 6},
			{ 7, 6, 4, 2, 1}
		};
		int[] returnArr = {16, 32, 28, 20};
		Assert.equal(returnArr, DiverseArray.rowSums(givenMat));

		// Part C - boolean isDiverse(int[][])
		int[][] otherMat = {
			{ 1, 1, 5, 3, 4},
			{12, 7, 6, 1, 9},
			{ 8,11,10, 2, 5},
			{ 3, 2, 3, 0, 6}
		};
		Assert.ok("givenMat", DiverseArray.isDiverse(givenMat));
		Assert.ok("otherMat", !DiverseArray.isDiverse(otherMat));
	}
}