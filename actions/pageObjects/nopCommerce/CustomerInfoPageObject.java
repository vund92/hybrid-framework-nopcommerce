package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.CustomerInforPageUI;
import pageUIs.nopCommerce.HomePageUI;

public class CustomerInfoPageObject extends BasePage {
	
	private WebDriver driver; 
	
	public CustomerInfoPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isCustomerInfoPageDisplayed() {
		waitForAllElementVisible(driver, CustomerInforPageUI.CUSTOMER_INFOR_HEADER);
		return isElementDisplayed(driver, CustomerInforPageUI.CUSTOMER_INFOR_HEADER);
	}

//	public AddressPageObject openAddressPage() {
//		waitForElementClickable(driver, CustomerInforPageUI.ADDRESS_LINK);
//		clickToElement(driver, CustomerInforPageUI.ADDRESS_LINK);
//		return PageGeneratorManager.getAddressPage(driver);
//	}
	
	

}
