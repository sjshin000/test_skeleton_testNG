package testng;

import org.testng.annotations.Test;

public class TestNGTest {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException(){
		int i = 1/0;
	}
	
	@Test(enabled=false)
	public void ignoreTest(){
		System.out.println("ignore test");
	}
	
	@Test(timeOut=1000)
	public void timeTest(){
		while(true);		
	}
	
	
}
