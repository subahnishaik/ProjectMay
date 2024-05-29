package PageObjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends BasePage {
	public HomePage1(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath="//p[text()='Login Now']")
	 WebElement link_login;
	
	 public void click_login() {
		 link_login.click();
	 }
}
