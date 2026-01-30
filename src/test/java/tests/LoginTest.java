package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitUntilState;

import base.BaseTest;
import pages.Homepage;
import pages.LoginPage;

public class LoginTest  extends BaseTest{
	
	
	@Test
	public void loginOrangeHRM() {
		LoginPage LoginPage=new pages.LoginPage(page);
		Homepage homepage= new Homepage(page);
		//LoginPage.navigation();
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", new Page.NavigateOptions()
			    .setWaitUntil(WaitUntilState.LOAD));
		
		LoginPage.addUserName("Admin");
		LoginPage.addPassword("admin123");
		LoginPage.clickLogin();
		
		homepage.clickOnTimelink();
	}
	//@Test
	public void loginOrangeHRM2() {
		test.skip("Test Skipped");
		throw new SkipException("Skipping this test");
	}
	//@Test
	public void loginOrangeHRM3() {
		
		LoginPage LoginPage=new pages.LoginPage(page);
		Homepage homepage= new Homepage(page);
		//LoginPage.navigation();
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", new Page.NavigateOptions()
			    .setWaitUntil(WaitUntilState.LOAD));
		
		LoginPage.addUserName("Admin");
		LoginPage.addPassword("admin123");
		LoginPage.clickLogin();
		
		homepage.clickOnTimelink();
	}
}
