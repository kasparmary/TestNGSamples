package loginPackage;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeoutExample {

		//@Test(timeOut = 2000)
		public void testA() throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("Timeout sample");	
		}
		
		@Test(timeOut = 2000, expectedExceptions =ThreadTimeoutException.class )
		public void testB() throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("Timeout sample");	
		}
}
