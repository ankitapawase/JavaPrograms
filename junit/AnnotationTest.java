package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationTest {

	@Test
	public void test1() {
		System.out.println("Test case 1 : Inside test case");
	}
	@Test
	public void test2() {
		System.out.println("Test case 2 : Inside test case");
	}
	@Before
	public void before() {
		System.out.println("Inside befor");
	}
	@After
	public void after() {
		System.out.println("Inside After");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
