package objectRepository;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement Login;
	
	@FindBy(id = "Email")
	private WebElement Regmailid;
	
	@FindBy(id = "Password")
	private WebElement Regpassword;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement RegLogin;
	
	public WebElement getLogin() {
		return Login;
	}
	
	public WebElement getRegmailid() {
		return Regmailid;
	}
	
	public WebElement getRegpassword() {
		return Regpassword;
	}
	
	public WebElement getRegLogin() {
		return RegLogin;
	}
			
}