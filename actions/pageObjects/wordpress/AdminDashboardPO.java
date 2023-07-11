package pageObjects.wordpress;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.wordpress.AdminDashboardPageUI;

public class AdminDashboardPO extends BasePage{
	
	WebDriver driver;
	
	public AdminDashboardPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Create_Post - Click to 'Posts' menu link")
	public AdminPostSearchPO clickToPostMenuLink() {
		waitForElementVisible(driver, AdminDashboardPageUI.POST_MENU_LINK);
		clickToElement(driver, AdminDashboardPageUI.POST_MENU_LINK);
		return PageGeneratorManager.getAdminPostSearchPage(driver);
	}

}
