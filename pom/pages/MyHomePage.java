package pages;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage getTitle() {
		System.out.println(driver.getTitle());
		return this;
	}
	
     
}

	