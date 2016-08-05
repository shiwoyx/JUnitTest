package testcases;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TemporaryFolder;

import suite.CategoryClass;

public class TemporaryFolderRule {
	@Rule
	public TemporaryFolder tempfolder = new TemporaryFolder();
	

	@Test
	@Category(CategoryClass.class)
	public void test() {
		try {
			File tempFile = tempfolder.newFolder();
			System.out.println(tempFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			tempfolder.delete();
			System.out.println("tempFile Delete");
		}
	}
}
