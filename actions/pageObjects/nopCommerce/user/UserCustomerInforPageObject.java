package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.UserCustomerInforPageUI;
import pageUIs.nopCommerce.user.UserHomePageUI;

public class UserCustomerInforPageObject extends BasePage {
	
	private WebDriver driver; 
	
	public UserCustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isCustomerInfoPageDisplayed() {
		waitForAllElementVisible(driver, UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
		return isElementDisplayed(driver, UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
	}

//	public AddressPageObject openAddressPage() {
//		waitForElementClickable(driver, CustomerInforPageUI.ADDRESS_LINK);
//		clickToElement(driver, CustomerInforPageUI.ADDRESS_LINK);
//		return PageGeneratorManager.getAddressPage(driver);
//	}
	
	

}