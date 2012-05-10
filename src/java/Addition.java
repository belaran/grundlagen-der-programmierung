/**
 * 
 * Probably one of the most powerfull piece of program I ever wrote... No, really ! 
 * 
 * @author Romain PELISSE
 *
 */
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if ( args.length < 2 ) {
			System.out.println("Invalid inputs - not enough arguments (2 required)");
			System.exit(1);
		}
		
		int leftOperand = transformInputInInteger(args[0]);
		int rightOperand = transformInputInInteger(args[1]);

		int result = (leftOperand + rightOperand);
		
		System.out.println("Result:" + result );
	}

	private static int transformInputInInteger(String string) {
		return Integer.valueOf(string);
	}

}
