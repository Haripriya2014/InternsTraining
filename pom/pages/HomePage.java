package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage clickAppLaunch() {
		driver.findElementByClassName("slds-icon-waffle").click();
       return this;
	}
	
	public HomePage clickViewAll() {
		driver.findElementByXPath("//button[text( )='View All']").click();
        return this;
	}
	
	public HomePage searchUserProvision() {
	    driver.findElementByXPath("//input[@class='slds-input']").sendKeys("User Provisioning Requests");
	    return this;
	}
	
	public UserProvisionPage clickUserProvision() {
		driver.findElementByXPath("//p[@class='slds-truncate']//mark[1]").click();
        return new UserProvisionPage();
	}
}



