package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertionMethod {

	@Test
	public void test() {
		int a=10;
		int b=20;
		String str1=new String("Welcome");
		String str2=new String("Welcome");
		String str3="Welcome";
		String str4="Welcome";
		String str5=null;
//		assertNotSame(str1, str2);
//		assertSame(str3, str4);
//		assertTrue(a==b);
//		assertFalse(a==b);
		assertNull(str5);
//		String a1[]= {"one","Two","Three"};
//		String a2[]= {"one","Two","Three"};
//		assertArrayEquals(a1, a2);
	}

}
