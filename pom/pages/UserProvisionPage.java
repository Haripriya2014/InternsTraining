package pages;

import base.ProjectSpecificMethods;

public class UserProvisionPage extends ProjectSpecificMethods {

	
   public CreateNewPage clicksalesForce() {
	 driver.findElementByLinkText("Open in Salesforce Classic.").click();
	 return new CreateNewPage();

	}
	
}
