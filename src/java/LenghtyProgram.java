/**
 * 
 */

/**
 * @author rpelisse
 *
 */
public class LenghtyProgram {

	public static void printArray(int[] array) {
		for ( int position = 0 ; position < array.length ; 
						position++ ) {
			System.out.println(array[position]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {		
		int[] firstArray = { 1, 2, 3, 4 ,5};
		int[] secondArray = { 10, 20, 30, 40 ,50};
		
		LenghtyProgram.printArray(firstArray);
		LenghtyProgram.printArray(secondArray);
		
		for ( int position = 0 ; position < firstArray.length ; position++ ) {
			System.out.println(firstArray[position] + secondArray[position]);
		}
		System.out.println("");
		// Use a function to make the code above less redundant.
		
	}

}
