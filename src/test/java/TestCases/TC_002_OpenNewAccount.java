package TestCases;

import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.DashboardPage;
import TestBase.BaseClass1;

public class TC_002_OpenNewAccount extends BaseClass1 {
  
	
	@Test
	public void NewAccount() throws InterruptedException {
	
		Thread.sleep(5000);
		DashboardPage dp=new DashboardPage(BasePage.driver);
		dp.click_openaccount();
		
		logger.info("***Clicked on New Account***");
		Thread.sleep(5000);

		
		
		
	}

}

