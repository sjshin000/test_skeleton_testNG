package sample;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test
	public void test1(){
		System.out.println("This is Test 11");
	}
	
	@Test(dependsOnMethods={"test1"})
	public void test2(){
		System.out.println("This is Test 2");
	}
}
