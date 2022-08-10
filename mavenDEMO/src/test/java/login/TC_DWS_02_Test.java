package login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilites.Baseclass;
import genericUtilites.UtilityClass;
import objectRepository.LoginPage;

@Test
public class TC_DWS_02_Test extends Baseclass {
	public void Validate_whether_user_can_login_through_invalid_credentials() throws IOException {
		LoginPage Login = new LoginPage(driver);
		String ExpectedTitle = "Demo Web Shop1";
		UtilityClass utility = new UtilityClass();
		Login.getLogin().click();
		Reporter.log("Clicked on Login button", true);

		Login.getRegmailid().sendKeys(utility.propertyFileReader("invalidusername1"));
		assertEquals(utility.propertyFileReader("invalidusername1"), Login.getRegmailid().getAttribute("value"),
				"Email Address is not proper");
		Reporter.log("Sucessfully entered email adress", true);

		Login.getRegpassword().sendKeys(utility.propertyFileReader("invalidpassword1"));
		assertEquals(utility.propertyFileReader("invalidpassword1"), Login.getRegpassword().getAttribute("value"),
				"Password is not proper");
		Reporter.log("Sucessfully entered password:, true");

		Login.getRegLogin().click();
		Reporter.log("Sucessfully logged in to application");
		assertNotEquals(ExpectedTitle, driver.getTitle(), "Test case failed");

	}
}
