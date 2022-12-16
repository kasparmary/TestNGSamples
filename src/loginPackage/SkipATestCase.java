package loginPackage;

import org.testng.annotations.Test;

public class SkipATestCase {
	@Test(priority=1)
	public void oneTest() {
		System.out.println("Test One");
	}
	
	@Test(priority=2, enabled=false)
	public void twoTest() {
		System.out.println("Test Two");
	}
	@Test(priority=3)
	public void threeTest() {
		System.out.println("Test three");
	}
	@Test(priority=4)
	public void fourTest() {
		System.out.println("Test four");
	}
}
