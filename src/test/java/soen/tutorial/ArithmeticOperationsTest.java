package soen.tutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArithmeticOperationsTest {


	@Test
	public void testAdd()
	{

		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.addOrSub(2, 6);
		Integer expected = 8;
// 		assertEquals(expected, actual);
		fail("must fail");

	}

}
