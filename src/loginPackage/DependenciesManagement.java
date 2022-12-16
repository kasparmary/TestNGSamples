package loginPackage;

import org.testng.annotations.Test;

public class DependenciesManagement {
	@Test(priority=1, timeOut=1000)
	public void oneTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test One");
	}

	@Test(dependsOnMethods="oneTest", alwaysRun=true)
	public void twoTest() {
		System.out.println("Test Two");
	}
	@Test(dependsOnMethods="twoTest", alwaysRun=true)
	public void threeTest() {
		System.out.println("Test three");
	}
	@Test(dependsOnMethods="threeTest")
	public void fourTest() {
		System.out.println("Test four");
	}
}
