@FunctionalInterface
public interface Computation<T> {
    T compute(T);
}



public class Multiplier implements Computation<Double> {

	private double a;
	
	public Multiplier(double x) {
		a = x;
	}

	@Override
	double compute(double x) {
		return a*x;
	}
}

public class Compute {
	public static void main(String[] args) {}
	public static void plot(double xmin, double xmax, Computation<Double> f) {}
	public static void apply(double[] array, Computation<Double> f) {}
}
