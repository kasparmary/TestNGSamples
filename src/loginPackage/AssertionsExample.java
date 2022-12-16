package loginPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	String name = "Joshua";
	Boolean test = true;
	
	@Test
	public void checkEqual() {
		/*if(name.equals("Josha")) {
			System.out.println("Name is equal");
		}*/
		//Assert.assertEquals(name, "josha");
		//Assert.assertNotEquals(name, "joshua");
		Assert.assertTrue(test);
	}
}
