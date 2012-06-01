/**
 * @author Romain Pelisse - belaran@gmail.com
 *
 */
public class TiedlyCoupledBusinessCode {

	/**
	 * A small program to calculate sum of taxes based 
	 * on the following 3 provided arguments:
	 * <ol>
	 *   <li>revenue</li>
	 *   <li>taxe classes</li>
	 *   <li>number of children</li>
	 * </ol> 
	 * 
	 * <em>Obviously, this is a example program. Sadly, in
	 * "real life" no tax declaration would be so easy :( 
	 * ...</em>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		final int NOT_ENOUGH_ARGS = 2;
		final int REVENUE_BELOW_ZERO = 3;
		final int INVALID_TAX_CLASS = 4;
		final int INVALID_CHILDREN = 4;
		
		// Arguments validation, part 1
		if (args.length != 3 ) {
			System.out.println("This program requires 3 arguments:");
			System.out.println("- revenue");
			System.out.println("- tax classes (1 to 6)");
			System.out.println("- number of children (0 to 5)");
			System.exit(NOT_ENOUGH_ARGS);
		}
					
		// Arguments conversion to proper variables values
		long revenue = Integer.valueOf(args[0]);
		short taxClass = Short.valueOf(args[1]);
		short nbChildren = Short.valueOf(args[2]);
		
		// Arguments validation, part 2
		if ( revenue < 0 ) {
			System.out.println("Revenu cannot be a negative value.");
			System.exit(REVENUE_BELOW_ZERO);
		}
		
		if ( taxClass < 0 || taxClass > 6 ) {
			System.out.println("Invalid tax class/" + taxClass);
			System.exit(INVALID_TAX_CLASS);
		}
		
		if ( nbChildren < 0 || nbChildren > 5 ) {
			System.out.println("Invalid number of children:" + nbChildren);
			System.exit(INVALID_CHILDREN);
		}
		
		// ok, now, we can actually do something somewhat useful ! Yeppi !		
float taxPart = taxPercentForTaxClas(taxClass) * 
			revenue;
		
		if ( nbChildren > 0 ) {
			taxPart = taxPart / nbChildren;
		}
		
		System.out.println("Tax to pay:"+ taxPart);
	}
	
	public static float taxPercentForTaxClas(int taxClass) {
		final float[] taxPercent = { 0f, 0.4f, 0.3f, 0.2f, 0.15f, 
				0.1f, 0.05f };

		return taxPercent[taxClass];
	}

	
	
	
	
	
	
	













}
