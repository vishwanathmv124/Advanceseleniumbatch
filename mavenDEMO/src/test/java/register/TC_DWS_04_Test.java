package register;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilites.Baseclass;
import genericUtilites.UtilityClass;
import objectRepository.RegisterPage;

public class TC_DWS_04_Test extends Baseclass {
	@Test
	public void Validate_Register_valid_credentials() throws IOException {
		RegisterPage Register = new RegisterPage(driver);
		String ExpectedTitle = "Demo Web Shop. Register";
		UtilityClass utility = new UtilityClass();
		Register.getRegisterLink().click();
		
		Reporter.log("Clicked on Register button", true);
		Register.getGender().click();
		Reporter.log("Clicked on Radio button", true);

		Register.getFirstName().sendKeys(utility.propertyFileReader("FirstName"));
		assertEquals(utility.propertyFileReader("FirstName"), Register.getFirstName().getAttribute("value"),
				"Firstname is not proper");
		Reporter.log("Succesfully entered firstName", true);
		
		Register.getLastName().sendKeys(utility.propertyFileReader("LastName"));
		assertEquals(utility.propertyFileReader("LastName"), Register.getLastName().getAttribute("value"),
				"Last name is not proper");
		Reporter.log("Succesfully entered lastName", true);
		
		Register.getEmail().sendKeys(utility.propertyFileReader("Email"));
		assertEquals(utility.propertyFileReader("Email"), Register.getEmail().getAttribute("value"),
				"Email is not proper");
		Reporter.log("Succesfully entered Email", true);
		
		Register.getPassword().sendKeys(utility.propertyFileReader("Password"));
		assertEquals(utility.propertyFileReader("Password"), Register.getPassword().getAttribute("value"),
				"Password is not proper");
		Reporter.log("Succesfully entered Password", true);
		
		Register.getConfirmPassword().sendKeys(utility.propertyFileReader("ConfirmPassword"));
		assertEquals(utility.propertyFileReader("ConfirmPassword"), Register.getConfirmPassword().getAttribute("value"),
				"ConfirmPassword is not proper");
		Reporter.log("Succesfully entered ConfirmPassword", true);
		
		
		Register.getRegisterButton().click();
		Reporter.log("Succesfully Logged in to the application", true);
		assertEquals(ExpectedTitle, driver.getTitle(), "Test case Passed");
		
		


	}

}
