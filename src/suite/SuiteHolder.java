package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testcases.ExternalResourceRule;
import testcases.TemporaryFolderRule;
import testcases.TestAssert;
import testcases.TestString;

@RunWith(Categories.class)
@IncludeCategory(CategoryClass.class)
//@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestAssert.class,
	TestString.class,
	TemporaryFolderRule.class,
	ExternalResourceRule.class
})
public class SuiteHolder {

}
