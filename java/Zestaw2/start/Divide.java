package start;

public class Divide {
        public static void main(String[] args) throws DivideByZeroException {
		
		div(4,2);
                div(15,0);
        }

        public static double div(double a, double b) throws DivideByZeroException {

                double result = 0;

		if(b == 0) throw new DivideByZeroException(Double.toString(a), Double.toString(b));
        
	        result = a/b;

                return result;
        }
}

