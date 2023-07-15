package testNG;

import org.testng.annotations.Test;

import commons.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ParallelClass_03 extends BaseTest{
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
	}

	@Test
	public void TC_01_New_Product() {
	}
	
	@Test
	public void TC_02_Edit_Product() {
	}
	
	@Test
	public void TC_01_View_Product() {
	}
	
	@Test
	public void TC_01_Search_Product() {
	}
	
	@Test
	public void TC_01_Delete_Product() {
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}

}
