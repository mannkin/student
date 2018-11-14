package start;

public class Divide {
        public static void main(String[] args) throws DivideByZeroException{
                
                try {
                        System.out.println(div(4,2));
                        System.out.println(div(15,0));
                }
                catch(DivideByZeroException e) {
                        System.out.println(e);
                }

        }

        public static double div(double a, double b) throws DivideByZeroException {

                double result = 0;

		if(b == 0) throw new DivideByZeroException(Double.toString(a), Double.toString(b));
        
	        result = a/b;

                return result;
        }
}

