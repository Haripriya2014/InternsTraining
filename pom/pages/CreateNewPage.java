package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import base.ProjectSpecificMethods;

public class CreateNewPage extends ProjectSpecificMethods {
	
	public FillDetailsPage clickCreateNewView()  {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandle = new ArrayList<String>(windowHandles);
		String secondHandle = listHandle.get(1);
		driver.switchTo().window(secondHandle);
		driver.findElementByLinkText("Create New View").click();

       return new FillDetailsPage();
	}
	

}
