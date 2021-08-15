package testng.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentTC004 extends BaseClass {

	@Test
	public void resolveIncident() throws InterruptedException {
		
		//Click Incidents
		driver.findElementById("filter").sendKeys("incident");		
		driver.findElementByXPath("//div[text()='Incidents']").click();
		//Click New
		driver.switchTo().frame("gsft_main");
		driver.findElementById("sysverb_new").click();
		//Get incident number
		String incidentNumber = driver.findElementById("incident.number").getAttribute("value");
		System.out.println(incidentNumber);
		//Fill the details
		driver.findElementById("incident.short_description").sendKeys("New Incident");
		driver.findElementByXPath("(//button[text( )='Submit'])[2]").click();
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(incidentNumber,Keys.ENTER);
		Thread.sleep(2000); 
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		WebElement stateElement = driver.findElementById("incident.state");
		Select dd1 = new Select(stateElement);
		dd1.selectByVisibleText("Resolved");
		driver.findElementById("activity-stream-textarea").sendKeys("Ticket is Resolved");
		Thread.sleep(2000);
		driver.findElementById("sysverb_update_bottom").click();
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		String stateElement1 = driver.findElementById("incident.state").getText();
		
		if(stateElement1.contains("Resolved")) {
			 System.out.println("Incident is Resolved");
			 }
			 else {
			 System.out.println("Incident is not Resolved");
			 }
			 

	}

}
