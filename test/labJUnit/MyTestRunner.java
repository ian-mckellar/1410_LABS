package labJUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyClassTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.printf("number of tests run: %d%n", result.getRunCount());
		System.out.printf("number of tests passed: %d%n", result.getRunCount() - result.getFailureCount());
		System.out.printf("number of tests that failed: %d", result.getFailureCount());
	
	}
}
