package testcases;

import static org.junit.Assert.assertSame;

import java.util.concurrent.Callable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ErrorCollector;

import suite.CategoryClass;

public class ErrorCollectorRule {
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	@Category(CategoryClass.class)
	@Test
	public void test1() {
		assertSame(null, null);
	}
	
	@Test
	public void test2() {
		try {
			throw new Throwable("throw error");
		} catch (Throwable e) {
			ec.addError(e);
		}
		
		Callable<?> callback = new Callable<Object>() {

			@Override
			public Object call() {
				System.out.println("catch error");
				return null;
			}
			
		};
		ec.checkSucceeds(callback);
	}
}
