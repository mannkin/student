package start;

import java.lang.Exception;

public class DivideByZeroException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public String m;

	public DivideByZeroException(String a, String b) {

		m = "Divide by zero exception " + a + " divided by " + b;	
	}

	@Override
	public String getMessage() {

		return m;
	}
}
