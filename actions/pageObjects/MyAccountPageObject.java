package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class MyAccountPageObject extends BasePage {
	
	private WebDriver driver; 
	
	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
		System.out.println("Driver at Class MyAccountPageObject = " + driver.toString());
	}

	public void clickToNewsletterCheckbox() {
		// TODO Auto-generated method stub
		
	}

}
