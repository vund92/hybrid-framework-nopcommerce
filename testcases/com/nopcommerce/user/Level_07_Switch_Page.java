package com.nopcommerce.user;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import commons.BasePage;
import commons.BaseTest;
import pageObjects.nopCommerce.AddressPageObject;
import pageObjects.nopCommerce.CustomerInfoPageObject;
import pageObjects.nopCommerce.HomePageObject;
import pageObjects.nopCommerce.LoginPageObject;
import pageObjects.nopCommerce.MyProductReviewPageObject;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageObjects.nopCommerce.RegisterPageObject;
import pageObjects.nopCommerce.RewardPointPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_07_Switch_Page extends BaseTest{
 
	private WebDriver driver;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private CustomerInfoPageObject customerInforPage; 
	private AddressPageObject addressPage;
	private MyProductReviewPageObject myProductReviewPage;
	private RewardPointPageObject rewardPointPage;
	String firstName, lastName, emailAddress, password;

	@Parameters("browser")     
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getHomePage(driver);
		
		firstName = "Automation";
		lastName = "FC";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn";
		password = "123456";

	}
  
	@Test
	public void User_01_Register() {
		registerPage = homePage.clickToRegisterLink();
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);
		registerPage.clickToRegisterButton();
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

	}
	
	@Test
	public void User_02_Login() {
		loginPage = homePage.clickToLoginLink();
		
		loginPage.inputToEmailTextbox(emailAddress);
		loginPage.inputToPasswordTextbox(password);
		
		homePage = loginPage.clickToLoginButton();
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

	}
	
	@Test
	public void User_03_Customer_Infor() {
		customerInforPage = homePage.clickToMyAccountLink();
		Assert.assertTrue(customerInforPage.isCustomerInfoPageDisplayed());
		
	}
	
	@Test
	public void User_04_Switch_Page() {
		// Customer Infor -> Address
		addressPage = customerInforPage.openAddressPage(driver);
		// Address -> My Product Review
		myProductReviewPage = addressPage.openMyProductReviewPage(driver);
		// My Product Review -> Reward Point
		rewardPointPage = myProductReviewPage.openRewardPointPage(driver);
		// Reward Point -> Address
		addressPage = rewardPointPage.openAddressPage(driver);
		// Address -> Reward Point
		rewardPointPage = addressPage.openRewardPointPage(driver);
		// Reward Point -> My Product Review
		myProductReviewPage = rewardPointPage.openMyProductReviewPage(driver);
		//My Product Review -> Address
		addressPage = myProductReviewPage.openAddressPage(driver);
		
		customerInforPage = addressPage.openCustomerInforPage(driver);
		
		myProductReviewPage = customerInforPage.openMyProductReviewPage(driver);

	}
	
	@Test
	public void User_04_Switch_Role() {
		//Role User -> Role Admin
		
		//Role Admin -> Role User

	}

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  public int generateFakeNumber() {
	  Random rand = new Random();
	  return rand.nextInt(9999);
  }
}
