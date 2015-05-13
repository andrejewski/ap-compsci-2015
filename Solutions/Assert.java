
/*
	Testing Utility

	Testing is not a component of the exam,
	but it should be.
*/
public class Assert {

	public static void ok(String var, boolean test) throws AssertionError {
		if(!test) {
			throw new AssertionError(var + " not true");
		}
	}

	public static void equal(int a, int b) {
		if(a != b) {
			throw new AssertionError(a + " != " + b);
		}
	}

	public static void equal(int[] a, int[] b) {
		boolean equal = a.length == b.length;
		if(equal) {
			for(int i = 0; i < a.length; i++) {
				if(a[0] != b[0]) equal = false;
			}
		}
		
		if(!equal) {
			throw new AssertionError(a + " != " + b);
		}
	}

	public static void equal(String a, String b) {
		if(!a.equals(b)) {
			throw new AssertionError(a + " != " + b);
		}
	}

}