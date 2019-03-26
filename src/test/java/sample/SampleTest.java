package sample;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by sjshin on 2019-03-25.
 */

public class SampleTest {
	private SoftAssert softAssert;

	@BeforeClass
	public void beforeClass() {
//		softAssertions = new SoftAssertions();
		softAssert = new SoftAssert();
		System.out.println("===>>> beforeClass");
	}

	@AfterClass
	public void afterClass() {
		// one-time cleanup code
		System.out.println("===>>> AfterClass ");
//		softAssertions.assertAll();
		softAssert.assertAll();
	}

	@Test()
	public void test1() {
		System.out.println("===>>> This is Test 1 : ");
		Assert.assertFalse(2<1);
		System.out.println("Assertion Failed in Test 1");
		Assert.assertTrue(1<0);
		System.out.println("Assertion Failed in Test 2");
		Assert.assertEquals("softAssertmple", "Sample");
		System.out.println("Assertion Passed in Test 3");

	}

	@Test()
	public void test3() {
		System.out.println("===>>> This is Test 3 : ");
		SoftAssert sa= new SoftAssert();
		softAssert.assertTrue(2<1);
		System.out.println("Assertion Failed1");
		softAssert.assertFalse(1<2);
		System.out.println("Assertion Failed2");
		softAssert.assertEquals("Sample", "Failed");
		System.out.println("Assertion Failed3");


	}

	@Test
	@Parameters(value = "number")
	public void paramterIntTest(int number) {
		System.out.println("===>>> Paramterized Number is : " + number);
	}

	@Test
	@Parameters(value = "number")
	public void paramterIntTest2(String number) {
		System.out.println("===>>> Paramterized Number is : " + number);
	}
}