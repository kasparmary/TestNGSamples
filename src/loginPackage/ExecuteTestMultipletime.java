package loginPackage;

import org.testng.annotations.Test;

public class ExecuteTestMultipletime {
	
	@Test(invocationCount = 3)
	public void testA() {
		System.out.println("Hello Kaspar");
	}
}
