package google;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.TestBaseClass;
import com.Pages.GoogleHomePage;

public class GoogleTest1 extends TestBaseClass {

	GoogleHomePage googleHomePage;

	@BeforeClass
	public void beforeClass() {

		googleHomePage = getgoogleHomePage();
	}

	@Test
	public void t1() {

		googleHomePage.clickonserachbox();
		googleHomePage.customsendkeys();

	}

}
