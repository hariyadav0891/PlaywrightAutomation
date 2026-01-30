package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	private Page page;
	
	
	private final String userNameTextBox="//input[@placeholder='Username']";
	private final String passwordTextBox="//input[@placeholder='Password']";
	private final String loginButton="//button[@type='submit']";
	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	public void navigation() {
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void addUserName(String userName) {
		page.fill(userNameTextBox, userName);
	}
	public void addPassword(String password) {
		page.fill(passwordTextBox, password);
	}
	public void clickLogin() {
		page.click(loginButton);
	}
}
