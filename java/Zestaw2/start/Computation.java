@FunctionalInterface
public interface Computation<T> {
    T compute(T);
}

public class Multiplier implements Computation<Double> {
	private double a;
	
	public Multiplier(double a) {
		this.a = x;
	}

	double compute(double x) {
		return a*x;
	}

	double static computeStatic(double x) {
		return a*x;
	}
}

public class Compute {
	public static void main(String[] args) {
		Multiplier mul = new Multiplier(2);

		plot(3, 10, mul);
		plot(3, 10, new Computation<Double>() {
			@Override
			public double compute(double x) {
				return a*x;
			}
		});
		Computation<Double> comp = x->x*a;
		plot(3, 10, comp);
		plot(3, 10, Multiplier::compute);
		plot(3, 10, Multiplier::computeStatic);
	}

	public static void plot(double xmin, double xmax, Computation<Double> f) {
		final int n = 20;
		int counter = Math.abs(xmax-xmin);

		for(int i = xmin; i <= xmax; i++) {
			System.out.println(i+"  "+counter+"  "+f.compute(i));
		}
	}

	public static void apply(double[] array, Computation<Double> f) {
		for(int i = 0; i < array.length; i++) {
			array[i] = f.compute(array[i]);
		}
	}
}
