package testcases;

import static org.junit.Assert.assertSame;

import java.util.concurrent.Callable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExternalResource;

import suite.CategoryClass;

public class ExternalResourceRule {
	@Rule
	public ExternalResource er = new ExternalResource() {
		@Override
		public void before() {
			System.out.println("DB connected");
		}
		
		@Override
		public void after() {
			System.out.println("DB disconnected");
		}
	};
}
