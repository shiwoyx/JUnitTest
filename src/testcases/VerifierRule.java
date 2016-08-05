package testcases;

import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

public class VerifierRule {
	@Rule
	public Verifier verf = new Verifier(){
		@Override
		protected void verify() throws Throwable {
			if(!code.startsWith("1")){
				throw new IllegalArgumentException("Need start with 0");
			}
		}
	};
	
	String code = "123";
	
	@Test
	public void test3() {
		assertThat(testResult(ExternalResourceRule.class), isSuccessful());
	}
}
