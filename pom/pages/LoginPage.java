package pages;

import org.testng.annotations.DataProvider;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUserName(String uName) {

		driver.findElementById("username").sendKeys(uName);
        return this;
	}
	
	 public LoginPage enterPassword(String pWord) {
		 
		 driver.findElementById("password").sendKeys(pWord);
		 return this;
		}
	
	 public HomePage clickLoginButton() {
		 
		 driver.findElementById("Login").click();
		return new HomePage();

	}
	 
	
	 
}


