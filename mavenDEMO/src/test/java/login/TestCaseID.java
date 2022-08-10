package login;

import org.testng.annotations.Test;

import genericUtilites.Baseclass;
import objectRepository.LoginPage;

public class TestCaseID extends Baseclass {
	@Test
	public void testCaseDescription() {
		LoginPage loginElements=new LoginPage(driver);
		loginElements.getLogin().click();
		loginElements.getRegmailid().sendKeys("vishwanathmv124@gmail.com");
		loginElements.getRegpassword().sendKeys("1234546");
		loginElements.getRegLogin().click();
	}
}
