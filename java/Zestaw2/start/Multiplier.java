public class Multiplier implements Computation<Double> {
	private static double a;
	
	public Multiplier(double x) {
		a = x;
	}

    @Override
	public Double compute(Double x) {
		return a*x;
	}

    public static Double computeStatic(Double x) {
		return a*x;
	}
}