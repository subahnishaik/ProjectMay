package PageObjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy (xpath="//button[text()='CONTINUE WITH EMAIL-ID']")
	WebElement btn_emailid;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement txt_emailid;
	
	@FindBy(xpath="//div[@class='auto-complete-list']")
	WebElement click_autocomplete;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	WebElement btn_continue;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	WebElement btn_cnt;
	
	
	public void click_login() {
		btn_emailid.click();
	}
	
	public void set_emailid(String Email) {
		txt_emailid.sendKeys(Email);
	}
	
	public void click_autocomplete() {
		click_autocomplete.click();
		
	}
	
	public void click_continue() {
		btn_continue.click();
	}
	
	
	public void set_password(String pwd) {
		txt_password.sendKeys(pwd);
}
	
	public void click_con() {
		btn_cnt.click();
	}
	
}
