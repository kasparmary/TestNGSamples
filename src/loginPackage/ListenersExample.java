package loginPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {

	public void onTestStart(ITestResult result) {
	    System.out.println("Test case is going to execute");
	  }


	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test case success");
	  }

	public void onTestFailure(ITestResult result) {
	    System.out.println("Test case failure");
	  }

	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test case skipped");
	  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    System.out.println("Test case failed wtih pass percentage");
	  }

	public void onTestFailedWithTimeout(ITestResult result) {
	    System.out.println("Test case failure with time out");
	  }

	public void onStart(ITestContext context) {
	    System.out.println("Test case before start");
	  }

	public void onFinish(ITestContext context) {
	    System.out.println("Test case finished");
	  }
}
