package testNG;

import org.testng.annotations.Test;

import commons.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ParallelClass_02 extends BaseTest{
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
	}

	@Test
	public void TC_01_New_User() {
	}
	
	@Test
	public void TC_02_Edit_User() {
	}
	
	@Test
	public void TC_01_View_User() {
	}
	
	@Test
	public void TC_01_Search_User() {
	}
	
	@Test
	public void TC_01_Delete_User() {
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}

}
