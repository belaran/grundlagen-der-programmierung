/**
 * @author Romain PELISSE - belaran@gmail.com
 *
 */
public class Arguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String answer = "";
		for ( String arg : args ) {
			answer += arg + " ";
		}
		System.out.println("What is the meaning of life ?");
		System.out.println(answer);
	}

}



