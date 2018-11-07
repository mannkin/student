public class Multiplier implements Computation<Double> {
	private static double a;
	
	public Multiplier(double a) {
		this.a = a;
	}

    @Override
	public Double compute(Double x) {
		return a*x;
	}

    public static Double computeStatic(Double x) {
		return a*x;
	}
}