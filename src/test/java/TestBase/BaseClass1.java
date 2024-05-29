package TestBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;




public class BaseClass1 {
	public  static WebDriver driver;
	public ResourceBundle RB;
	public static Logger logger;
	@BeforeSuite
	public void setup() {
		RB=ResourceBundle.getBundle("config");//this will read data from config file
		logger=LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.get(RB.getString("baseURL"));
		logger.info("****Launched the Application*****");
		driver.manage().window().maximize();
		logger.info("****Maximized the browser*****");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.info("****Waiting for elements to load*****");
	}
	@AfterSuite
	public void close() {
		driver.quit();
		logger.info("****Closed browser*****");
	}
	
	public String captureScreen(String tname) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
		}
		return destination;
	}


}
