package Testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runners.*;
import org.junit.runner.*;


import org.junit.Test;

@RunWith(Parameterized.class)
public class CalculatorTest {
	private Integer input;
	private Boolean expectedResult;
	Calculator c;
	
	public  CalculatorTest(Integer num,Boolean expectedResult) {
		this.expectedResult=expectedResult;
		input=num;
	}
	@Before
	public void initialize() {
		c=new Calculator();
	}

	@Test
	public void testFact() {
		//Calculator c =new Calculator();
		//assertEquals(120,c.fact(5));
		assertEquals(expectedResult,c.prime(7));
	}
	@Parameterized.Parameters
	public static Collection pNums() 
	{
		return Arrays.asList(new Object[][]
		{
			{2,true},
			{6,true},
			{19,true},
			{22,false},
			{23,true},
		});
	}
	

}
