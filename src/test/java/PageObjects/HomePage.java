package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	 @FindBy (xpath="//a[text()='Register']")
	 WebElement link_reg;
	
	 public void click_registration() {
		 link_reg.click();
	 }

}
