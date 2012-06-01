  
  public class ExceptionInJava {
	public static void functionsWithThrow() 
		throws IllegalArgumentException { 
		// explicitly 
		throw new IllegalArgumentException("Error...");
	}
	
	public static void functionsWithSilentThrow() { 
		//...
		throw new IllegalArgumentException("Error...");
	}
	
	public static void catchingException() {
		
		try {
			// code that may throw exception
			ExceptionInJava.functionsWithThrow();
		} catch ( IllegalArgumentException e ) {
			e.printStackTrace();
		}
		ExceptionInJava.functionsWithSilentThrow();		
	}
  }


  
  