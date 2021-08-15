package testng.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentTC002 extends BaseClass {

	@Test 
	public void updateIncident() throws InterruptedException {

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
        //Update Urgency and State
		WebElement urgencyElement = driver.findElementById("incident.urgency");
		Select dd = new Select(urgencyElement);
		dd.selectByVisibleText("1 - High");
		WebElement stateElement = driver.findElementById("incident.state");
		Select dd1 = new Select(stateElement);
		dd1.selectByVisibleText("In Progress");
		driver.findElementById("sysverb_update_bottom").click();
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		String urgencyElement1 = driver.findElementById("incident.urgency").getText();
		String stateElement1 = driver.findElementById("incident.state").getText();
		//Check if Urgency and State is updated 
		 if (urgencyElement1.contains("High")) {
		 System.out.println("Incident Urgency is updated as High");
		 }
		 else {
		 System.out.println("Incident Urgency is not updated as High"); 
		 }
		 if(stateElement1.contains("In Progress")) {
		 System.out.println("Incident State is updated as In Progress");
		 }
		 else {
		 System.out.println("Incident State is not updated");
		 }
		 
	}
	
	
	 
		
		
	}

