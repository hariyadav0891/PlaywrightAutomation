package pages;

import com.microsoft.playwright.Page;

public class Homepage {

	private Page page;
	
	private final String timelink="//p[text()='Time at Work']";
	
	public Homepage(Page page) {
		this.page=page;
	}
	
	public void clickOnTimelink() {
		page.click(timelink);
	}
}
