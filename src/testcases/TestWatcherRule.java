package testcases;

import org.junit.AssumptionViolatedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import static org.junit.Assert.assertEquals;

public class TestWatcherRule {
	@Rule
	public TestWatcher watcher = new TestWatcher() {

		@Override
		protected void succeeded(Description description) {
			super.succeeded(description);
			System.out.println("succeeded");
		}

		@Override
		protected void failed(Throwable e, Description description) {
			super.failed(e, description);
			System.out.println("failed");
		}

		@Override
		protected void skipped(AssumptionViolatedException e,
				Description description) {
			super.skipped(e, description);
			System.out.println("skipped");
		}

		@Override
		protected void starting(Description description) {
			super.starting(description);
			System.out.println("starting");
		}

		@Override
		protected void finished(Description description) {
			super.finished(description);
			System.out.println("finished");
		}
		
	};
	
	@Test 
	public void test() {
		assertEquals("123","123");
	}
	
}
