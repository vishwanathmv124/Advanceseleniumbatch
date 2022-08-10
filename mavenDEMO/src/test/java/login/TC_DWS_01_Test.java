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
public class TC_DWS_01_Test extends Baseclass {
	public void Validate_whether_user_can_login_through_valid_credentials() throws IOException {
	LoginPage Login=new LoginPage(driver);
	String ExpectedTitle="Demo Web Shop";
	UtilityClass utility=new UtilityClass();
	Login.getLogin().click();
	Reporter.log("Clicked on Login button",true);
	
	assertEquals(false, true);//used for screen shot intentionally failed
	
	Login.getRegmailid().sendKeys(utility.propertyFileReader("username"));
	assertEquals(utility.propertyFileReader("username"),Login.getRegmailid().getAttribute("value"), "Email Adderss is not proper");
	Reporter.log("Succesfully entered email adderss",true);
	
	Login.getRegpassword().sendKeys(utility.propertyFileReader("password"));
	assertEquals(utility.propertyFileReader("password"), Login.getRegpassword().getAttribute("value"), "password is not proper");
	Reporter.log("Succesfully entered email adderss",true);
	
	Login.getRegLogin().click();
	Reporter.log("Succesfully Logged in to the application",true);
	assertEquals(ExpectedTitle, driver.getTitle(),"Test case failed");
}
}
