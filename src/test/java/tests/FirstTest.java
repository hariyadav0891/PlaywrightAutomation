package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class FirstTest extends BaseTest {

	@Test
	public void verifyTitle() {
		page.navigate("https://www.google.com/ncr");

		// option handle cookies option
		if (page.isVisible("button:has-text('Accept all')")) {
			page.click("button:has-text('Accept all')");
		}
		System.out.println("Page Title is :"+page.title());
	}

}
