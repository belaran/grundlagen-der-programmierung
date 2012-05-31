/**
 *
 */

/**
 * @author Romain PELISSE - belaran@gmail.com
 *
 */
public class HowToUseIfStmt {

	/**
	 * Requirements:
	 *
	 * Implements the program below in order to the following
	 * specification:
	 *
	 * $ java HowToUseIfStmt <0-9> <10-99>
	 *
	 * example of use: $ java HowToUseIfStmt 0 4
	 *
	 * invalid example of use: $ java HowToUseIfStmt toto 1.5
	 *
	 * If one of the arguments is NOT an integer, the program
	 * must exit (System.exit(1))) and print "Invalid Arguments"
	 * (System.out.println("Invalid Arguments").
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// 1)
		// args.lenght returns the number of items in the
		// array 'args'. Use an if to check that there is
		// indeed 2 items in the array. If not exit the
		// program with System.exit(1);
        if ( args.length != 2 ) {
            System.out.println("This program requires 2 arguments");
            System.exit(1);
        }

		// 2) The following code returns the number of
		// character contains in the first item of the
		// array 'args'
        // args[0].length();
		// Using 'if' and this piece of code, check that
		// each items of the Array containing the expected
		// number of character
        if ( args[0].length() != 1 && args[1].length() != 1 ) {
            System.out.println("This program requires each argument to" +
                    "be no longer than one character");
            System.exit(2);
        }

        /// 3) (Bonus)
		// Implements a last check, by checking out that each
		// value can be indeed turn into a int.

	}

}
