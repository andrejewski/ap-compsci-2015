
/*
	Question 1
*/
public class DiverseArray {

	/*
		Part A:
		Returns the sum of the entries in the one-dimensional array.
	*/
	public static int arraySum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/*
		Part B:
		Returns a one-dimensional array in which the entry at index k is the sum of
		the entries of row k of the two-dimensional array arr2D.
	*/ 
	public static int[] rowSums(int[][] arr2D) {
		int[] sums = new int[arr2D.length];
		for(int i = 0; i < arr2D.length; i++) {
			sums[i] = arraySum(arr2D[i]);
		}
		return sums;
	}

	/*
		Part C:
		Returns true if all rows in arr2D have different row sums;
		false otherwise.
	*/
	public static boolean isDiverse(int[][] arr2D) {
		int[] sums = rowSums(arr2D);
		for(int i = 0; i < sums.length - 1; i++) {
			for(int j = i + 1; j < sums.length; j++) {
				if(sums[i] == sums[j]) return false;
			}
		}
		return true;
	}
}
