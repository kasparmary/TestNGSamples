package loginPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHeirachyExample {
  @Test
  public void test() {
	  System.out.println("I am test");
  }
  @Test
  public void test2() {
	  System.out.println("I am test2");
  }@Test
  public void test3() {
	  System.out.println("I am test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am after Suite");
  }

}
