public class Compute {
	public static void main(String[] args) {
		double y = 3;
		Multiplier mul = new Multiplier(3);
		double array[] = new double[20];
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}

		plot(3, 10, mul);
		plot(3, 10, new Computation<Double>() {
			@Override
			public Double compute(Double a) {
				return a*y;
			}
		});
		Computation<Double> comp = x->x*y;
		plot(3, 10, comp);
		plot(3, 10, mul::compute);
		plot(3, 10, Multiplier::computeStatic);

		apply(array, mul);

		for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
	}

	public static void plot(double xmin, double xmax, Computation<Double> f) {
		final int n = 20;
		double c = Math.abs(xmax-xmin)/(n-1);

		for(int i = 0; i < n; i++) {
			System.out.println((i+1)+"  "+xmin+"  "+f.compute(xmin));
			xmin += c;
		}
	}

	public static void apply(double[] array, Computation<Double> f) {
		for(int i = 0; i < array.length; i++) {
			array[i] = f.compute(array[i]);
		}
	}
}
