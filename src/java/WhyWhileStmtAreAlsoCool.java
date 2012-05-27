/**
 *
 */

/**
 * @author rpelisse
 *
 */
public class WhyWhileStmtAreAlsoCool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 1,2,3,-5,8,9,4,5 };

		for ( int position = 0; position < array.length ; position++ ) {
			System.out.println(array[position]);
		}
		// Modify the program above to display each item BUT stops at the
		// first negative value. Note your program must also stop at the
		// end of the array, even if it does not encounter a negative value
		// (Simply replace -5 by 5 to test this.
        int position = 0;
        while ( array[position] > 0 ) {
            System.out.println(array[position++]);
        }
	}

}
