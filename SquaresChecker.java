/**
 * SquaresChecker.java
 * 
 * This class contains a method that checks if the input is a perfect square.
 * 
 * @author Noah Wells
 *
 */
public class SquaresChecker {
	/**
	 * The method isSquared takes in an int, and calculates the square root of x. If
	 * x is not 0, then the square root is multiplied by itself to return true if
	 * square*square = x.
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isSquared(int x) {
		// Find the square root of x.
		int square = (int) Math.sqrt(x);
		// Check if the square * square is x.
		if (square * square == x) {
			// Filter out x = 0.
			if (square == 0) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

}
