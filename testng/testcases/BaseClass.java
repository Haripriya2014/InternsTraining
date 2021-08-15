package testng.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 public ChromeDriver driver;
	 @Parameters({"url","user_name","user_password"})
	 @BeforeMethod
	  public void preCondition(String url,String usName,String usPass) {
		  
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Login
			driver.switchTo().frame(0);
			driver.findElementById("user_name").sendKeys(usName);
			driver.findElementById("user_password").sendKeys(usPass);
			driver.findElementById("sysverb_login").click();
		

	}
	 @AfterMethod
	  public void postondition() {
	  driver.close();
}
	  
}