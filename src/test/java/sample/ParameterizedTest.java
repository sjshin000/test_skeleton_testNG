package sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * Created by sjshin on 2019-03-25.
 */

public class ParameterizedTest {

	@Test
	@Parameters(value="number")
	public void paramterIntTest(int number){
		System.out.println("Paramterized Number is : " + number);
	}

	@Test
	@Parameters(value="number")
	public void paramterIntTest2(String number){
		System.out.println("Paramterized Number is : " + number);
	}
}