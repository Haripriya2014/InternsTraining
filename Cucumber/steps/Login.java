package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	//public ChromeDriver driver;

	/*
		 @Given("Open the chrome browser")
		  public void openBrowser() {
			 
			
			  
		 }*/
			 
		/* @Given("Load the application url  {string}") 
			  public void loadApplication(String url) { 
			 
			  driver.get(url);
			  
			  }*/
			 
		 @And("Enter the username as {string}") 
              public void enterUserName(String username) { 
        	 
        	  driver.switchTo().frame(0);
     		 driver.findElementById("user_name").sendKeys(username);
     		
         }
			  
		 @And("Enter the password as {string}") 
			  public void enterPassword(String password) { 
			 
			 driver.findElementById("user_password").sendKeys(password);
			 
		 }
			  
		 @When("Click on Login button") 
		      public void clickLoginButton()
		 {
			 
			 driver.findElementById("sysverb_login").click();
			 
		 }
			  
		 @Then("Homepage should be displayed")
		     public void verifyHomePage()
		 {
			  System.out.println("HomePage is displayed");
			  
		 }
		
		 @Given("Enter Incidents in filter")
		 public void enterInc()
		 {
			 driver.findElementById("filter").sendKeys("incident"); 
		 }
		 @When("Click Incidents")
		 public void clickInc()
		 {
			 driver.findElementByXPath("//div[text()='Incidents']").click();
		 }
         @When("Click Create New")
         public void createNew()
         {
        	driver.switchTo().frame("gsft_main");
     		driver.findElementById("sysverb_new").click();
         }
         @Then("Get and check the incident numbers")
         public void getInc()
         {
        	String incidentNumber = driver.findElementById("incident.number").getAttribute("value");
     		System.out.println(incidentNumber); 
         	driver.findElementById("incident.short_description").sendKeys("New Incident"); 
            driver.findElementByXPath("(//button[text( )='Submit'])[2]").click();
            driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(incidentNumber,Keys.ENTER);
			String number = driver.findElementByXPath("//a[@class='linked formlink']").getText(); 
     		System.out.println(number);
            if (number.equals(incidentNumber))
     		System.out.println("New Incident is created successfully"); 
            else
     	    System.out.println("New Incident is not created"); 
         }
	}








