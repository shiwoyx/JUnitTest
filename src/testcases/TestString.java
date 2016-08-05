package testcases;

import org.junit.Assert;

import org.junit.Test;

public class TestString {
	@Test
	public void testToString() {
		String testStr = "Hello";
		Assert.assertSame("Strings are the same", "Hello", testStr.toString());
	}
}
