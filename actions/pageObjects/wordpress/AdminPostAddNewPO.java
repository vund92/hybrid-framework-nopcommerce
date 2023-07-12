package pageObjects.wordpress;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.wordpress.AdminPostAddNewPageUI;

public class AdminPostAddNewPO extends BasePage {

	WebDriver driver;

	public AdminPostAddNewPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Create_Post - Enter to post title")
	public void enterToAddNewPostTitle(String postTitleValue) {
		waitForElementVisible(driver, AdminPostAddNewPageUI.TITLE_TEXTBOX);
		sendkeyToElement(driver, AdminPostAddNewPageUI.TITLE_TEXTBOX, postTitleValue);
	}

	@Step("Create_Post - Enter to body")
	public void enterToAddNewPostBody(String postBodyValue) {
		waitForElementClickable(driver, AdminPostAddNewPageUI.BODY_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.BODY_BUTTON);
		
		waitForElementVisible(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		sendkeyToElement(driver, AdminPostAddNewPageUI.BODY_TEXTBOX, postBodyValue);
	}
	
	@Step("Create_Post - Enter to edit body")
	public void enterToEditPostBody(String postBodyValue) {
		waitForElementClickable(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		clickToElement(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		
		waitForElementVisible(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		clearValueInElementByDeleteKey(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		sleepInSecond(5);
		sendkeyToElement(driver, AdminPostAddNewPageUI.BODY_TEXTBOX, postBodyValue);
	}
	
	@Step("Create_Post - Click to publish or update button")
	public void clickToPublishOrUpdateButton() {
		waitForElementClickable(driver, AdminPostAddNewPageUI.PUBLISH_OR_UPDATE_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.PUBLISH_OR_UPDATE_BUTTON);
	}

	@Step("Create_Post - Click to 'Publish' button")
	public void clickToPublishButton() {
		waitForElementClickable(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON_BEFORE_CLICK);
		clickToElement(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON_BEFORE_CLICK);
		waitForElementClickable(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON_AFTER_CLICK);
		clickToElement(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON_AFTER_CLICK);
	}

	@Step("Create_Post - Verify 'Post published' message is displayed")
	public boolean isPostPublishMessageDisplayed(String postPublishedMessage) {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PUBLISHED_OR_UPDATE_MESSAGE, postPublishedMessage);
		return isElementDisplayed(driver, AdminPostAddNewPageUI.PUBLISHED_OR_UPDATE_MESSAGE, postPublishedMessage);
	}

	@Step("Search_Post - Open 'Search Post' page")
	public AdminPostSearchPO openSearchPostPageUrl(String searchPostUrl) {
		openPageUrl(driver, searchPostUrl);
		return PageGeneratorManager.getAdminPostSearchPage(driver);
	}
}
