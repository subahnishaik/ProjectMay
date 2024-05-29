package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		@FindBy (xpath="//a[text()='Open New Account']")
		WebElement link_openaccount;
		
		@FindBy()
		WebElement drpdwn;
		
		public void click_openaccount() {
			link_openaccount.click();
		}
		
		
		public void select_drpdwn() {
			Select drp=new Select(drpdwn);
			drp.selectByIndex(0);
		}


}
