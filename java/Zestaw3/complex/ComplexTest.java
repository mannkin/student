import org.junit.Assert;

public class ComplexTest {

	void testToString() {
		Complex a = new Complex("-1.2+3.4i");
		String result = a.toString();
		Assert.assertEquals("-1.2+3.4i", result);
	}
	
	void testValueOf() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("-1.2+3.4i");
		Assert.assertThat(a, samePropertyAs(b));	
	}

	void testAdd() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("5.6-7.8i");
		a = Complex.add(a, b);
		String result = a.toString();
		Assert.assertEquals("19.80+28.40i", result);
	}
	
	void testSub() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("5.6-7.8i");
		a = Complex.sub(a, b);
		String result = a.toString();
		Assert.assertEquals("-6.8+11.2i", result);
	}
	
	void testMul() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("5.6-7.8i");
		a = Complex.mul(a, b);
		String result = a.toString();
		Assert.assertEquals("4.4-4.4i", result);
	}
	
	void testDiv() {
		Complex a = new Complex("-2+4i");
		Complex b = Complex.valueOf("2-4i");
		a = Complex.div(a, b);
		String result = a.toString();
		Assert.assertEquals("-1-1i", result);
	}

}