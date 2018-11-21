import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		// Result result = JUnitCore.runClasses(TestComplex.class);
		// for (Failure failure : result.getFailures()) {
		//   System.out.println(failure.toString());
		// }

		TestComplex test = new TestComplex();
    test.testToString();
    test.testValueOf();
    test.testAdd();
    test.testSub();
    test.testMul();
    test.testDiv();
    test.testStaticAdd();
    test.testStaticSub();
    test.testStaticMul();
    test.testStaticDiv();
	}
}