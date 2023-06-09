package testcase;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseConfig;
import pages.HomePage;
import pages.MobilePage;

public class TestClass extends BaseConfig {
	HomePage homeObj;
	MobilePage mobileObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException, InterruptedException {
		driver = setup(Port);
		homeObj = new HomePage(driver);
		mobileObj = new MobilePage(driver);
	}
	
	@Test
	public void testCase1() throws InterruptedException{
		homeObj.navigateToMobiles();
		mobileObj.checkBoxes();
		mobileObj.verifyFilters();
		mobileObj.unCheckBoxes();
	}
}
