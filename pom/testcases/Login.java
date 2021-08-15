package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class Login extends ProjectSpecificMethods {
	
	@Test
	public void runLogin() {
		
		LoginPage lp = new LoginPage();
		lp.enterUserName(prop.getProperty("username"))
		  .enterPassword(prop.getProperty("password"))
		  .clickLoginButton()
		  .clickAppLaunch()
		  .clickViewAll()
		  .searchUserProvision()
		  .clickUserProvision()
		  .clicksalesForce()
		  .clickCreateNewView()
		  .enterName()
		  .enterUniqName()
		  .clickUserProv()
		  .selectName()
		  .getListSize()
		  .selectCreatedDate()
		  .getListSel()
		  .getListAvail()
		  .selectOption()
		  .clickAllUsers()
		  .clickSave()
		  .getTitle();
		
	}

}
