package testcases;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAssert {
	@Test
	public void testEquals() {
		assertEquals("delta compare is equal", 10.3, 11.3, 1);
	}
	
}
