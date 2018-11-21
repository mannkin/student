import org.junit.Assert;
import java.lang.Math;

public class TestComplex {

	void testToString() {
		Complex a = new Complex("-1.2+3.4i");
		String result = a.toString();
		Assert.assertEquals("-1.2+3.4i", result);
	}
	
	void testValueOf() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("-1.2+3.4i");
		Assert.assertTrue(a.re()==b.re());
		Assert.assertTrue(a.im()==b.im());
	}

	void testAdd() {
		Complex a = new Complex("1+3.4i");
		Complex b = new Complex("1+7.8i");
		a = a.add(b);
		String result = a.toString();
		assert result.equals("2.0+11.2i");
		// Assert.assertEquals("2.0+11.2i", result);
	}
	
	void testSub() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("5.6+7.8i");
		a = a.sub(b);
		String result = a.toString();
		Assert.assertEquals("-6.8-4.4i", result);
	}
	
	void testMul() {
		Complex a = new Complex("2+3i");
		Complex b = Complex.valueOf("3+4i");
		a = a.mul(b);
		String result = a.toString();
		Assert.assertEquals("-6.0+17.0i", result);
	}
	
	void testDiv() {
		Complex a = new Complex("-2+4i");
		Complex b = Complex.valueOf("2+4i");
		a = a.div(b);
		String result = a.toString();
		Assert.assertEquals("0.6", result); // 0.6+0.8i jest 0.6
	}

	void testStaticAdd() {
		Complex a = new Complex("1+3.4i");
		Complex b = new Complex("1+7.8i");
		Complex c = Complex.add(a, b);
		String result = c.toString();
		Assert.assertEquals("2.0+11.2i", result);
	}
	
	void testStaticSub() {
		Complex a = new Complex("-1.2+3.4i");
		Complex b = Complex.valueOf("5.6+7.8i");
		Complex c = Complex.sub(a, b);
		String result = c.toString();
		Assert.assertEquals("-6.8-4.4i", result);
	}
	
	void testStaticMul() {
		Complex a = new Complex("2+3i");
		Complex b = Complex.valueOf("3+4i");
		Complex c = Complex.mul(a, b);
		String result = c.toString();
		Assert.assertEquals("-6.0+17.0i", result);
	}
	
	void testStaticDiv() {
		Complex a = new Complex("2+4i");
		Complex b = Complex.valueOf("2+4i");
		Complex c = Complex.div(a, b);
		String result = c.toString();
		Assert.assertEquals("0.6", result); //0.6+0.8i jest 0.6
	}
}