/**
 * 
 */

/**
 * @author rpelisse
 *
 */
public class LenghtyProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int[] firstArray = { 1, 2, 3, 4 ,5};
		int[] secondArray = { 10, 20, 30, 40 ,50};
		
		for ( int position = 0 ; position < firstArray.length ; position++ ) {
			System.out.println(firstArray[position]);
		}
		System.out.println("");
		
		for ( int position = 0 ; position < secondArray.length ; position++ ) {
			System.out.println(secondArray[position]);
		}
		System.out.println("");

		for ( int position = 0 ; position < firstArray.length ; position++ ) {
			System.out.println(firstArray[position] + secondArray[position]);
		}
		System.out.println("");
		// Use a function to make the code above less redundant.
		
	}

}
