package login;

import org.testng.annotations.Test;

import genericUtilites.Baseclass;
import genericUtilites.ExcelUtility;
import objectRepository.LoginPage;

public class ReadingDatafromExcel_Test extends Baseclass {
	@Test(dataProvider = "test data", dataProviderClass =ExcelUtility.class )
public void readingData(String un, String pwd) {
	LoginPage login=new LoginPage(driver);
	login.getLogin().click();
	login.getRegmailid().sendKeys(un);
	login.getRegpassword().sendKeys(pwd);
	login.getRegLogin().click();
	}
}
