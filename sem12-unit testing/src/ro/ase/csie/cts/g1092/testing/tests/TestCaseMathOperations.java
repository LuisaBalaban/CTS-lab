package ro.ase.csie.cts.g1092.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1092.testing.models.MathOperations;

public class TestCaseMathOperations {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hello from the Testcase");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Bye from the test case");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Lets test something");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Clean up");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd()
	{
		int a=5;
		int b=5;
		int expectedResult=10;
		int result=MathOperations.add(a, b);
		assertEquals("testing adding 2 int values", expectedResult, result);
	}

}
