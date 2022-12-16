package loginPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters("DynamicValue")
	public void printName(String DynamicValue) {
		System.out.println("Dynamic Value is " + DynamicValue);
	}
}
