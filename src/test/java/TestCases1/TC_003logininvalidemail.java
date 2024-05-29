package TestCases1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects1.HomePage1;
import PageObjects1.LoginPage;
import TestBase.BaseClass1;

public class TC_003logininvalidemail extends BaseClass1 {
	@Test
	public void CreateAccount() throws InterruptedException {
			HomePage1 hp=new HomePage1(driver);
			LoginPage lp=new LoginPage(driver);
			
			hp.click_login();
			logger.info("*****Clicked on login*****");
			Thread.sleep(3000);
			lp.click_login();
			logger.info("*****Continue with email-id*****");
			Thread.sleep(3000);
			lp.set_emailid(RB.getString("invalidEmail"));
			logger.info("*****Enter the Email-id*****");
		
			lp.click_continue();
			logger.info("*****click on continue button*****");
			

			 String exp="Enter valid Email-ID";
				
			   String act=driver.findElement(By.xpath("//p[text()='Enter valid Email-ID']")).getText();
			   
				if(act.equals(exp))
				{
					System.out.println("Test is passed :Actual Result is " +act);
					}
				else
				{
					System.out.println("Test is failed :Actual Result is "+act);


	}
}
}

