package testng.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncidentTC001 extends BaseClass {

	@Test
	public void createIncident() throws InterruptedException {
		
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
				//Get incident number
				String number = driver.findElementByXPath("//a[@class='linked formlink']").getText(); 
				System.out.println(number);
				//check both the incident numbers
				if (number.equals(incidentNumber))
				System.out.println("New Incident is created successfully"); 
				else
			    System.out.println("New Incident is not created");

			
  }
 }


