/**
 * ParityChecker.java
 * 
 * This class contains a main method with test values, and a method isEven,
 * which takes an input int, and then returns a boolean which is true, if the
 * input int is even.
 * 
 * @author Noah Wells
 *
 */
public class ParityChecker {

	public static void main(String[] args) {
//		System.out.println("This is a test of method isEven, with x = 4, expect true, get " + isEven(4));
//
//		System.out.println("This is a test of method isSquared of class SquaresChecker, with x = 9, expect true, get "
//				+ SquaresChecker.isSquared(9));
	}

	/**
	 * This method takes in an int x. If x divided by 2 has a 0 remained, then the
	 * method returns true. If x ==0, then the method returns false. If x divided by
	 * 2 does have a remainder, then the method returns false.
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isEven(int x) {
		// Check if x has a remainder when divided by 2
		if (x % 2 == 0) {
			// If it is, then check if it is 0. If x is 0, then
			// return false.
			if (x == 0) {
				return false;
			}
			return true;
		} else
			return false;

	}

}
