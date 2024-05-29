package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import TestBase.BaseClass1;

public class TC_001_Registration extends BaseClass1{
	@Test
	public void CreateAccount() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		
		hp.click_registration();
		logger.info("*****Clicked on Registration*****");
		Thread.sleep(3000);
		rp.set_Firstname(RB.getString("firstname"));
		logger.info("*****Firstname entered*****");
		rp.set_lastname(RB.getString("lastname"));
		logger.info("*****Lastname Entered*****");
		rp.set_address(RB.getString("address"));
		logger.info("*****Address Entered*****");
		rp.set_city(RB.getString("city"));
		logger.info("*****City Entered*****");
		rp.set_state(RB.getString("state"));
		logger.info("*****State Entered*****");
		rp.set_zipcode(RB.getString("zipcode"));
		logger.info("*****Zipcode Entered*****");
		rp.set_phone(RB.getString("phone"));
		logger.info("*****Phonenumber Entered*****");
		rp.set_ssn(RB.getString("ssn"));
		logger.info("*****SSN Entered*****");
		rp.set_username(RB.getString("username"));
		logger.info("*****Username Entered*****");
		rp.set_password(RB.getString("password"));
		logger.info("*****Password Entered*****");
		rp.set_cnfpassword(RB.getString("confirmpassword"));
		logger.info("*****Confirm Password Entered*****");
		rp.click_regstration();
		logger.info("*****Account Created*****");
		Thread.sleep(5000);
	}


}
