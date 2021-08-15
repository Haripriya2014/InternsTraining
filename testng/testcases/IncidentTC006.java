package testng.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentTC006 extends BaseClass {
	@Test
	 public void newIncident()  {
		//Click Incidents
		driver.findElementById("filter").sendKeys("incident");		
		driver.findElementByXPath("//div[text()='Incidents']").click();
		//Click New
		driver.switchTo().frame("gsft_main");
		driver.findElementById("sysverb_new").click();
		driver.findElementByXPath("(//button[text( )='Submit'])[2]").click();
		String error = driver.findElementByXPath("//span[@class='outputmsg_text']").getText();
		System.out.println(error);

	}

}
