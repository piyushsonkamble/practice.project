package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class MobilePage {
	WebDriver driver;
	Actions action;
	
	public MobilePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='SAMSUNG']")
	WebElement samsungCheckBox;
	
	@FindBy(xpath="//*[text()='realme']")
	WebElement realmeCheckBox;
	
	@FindBy(xpath="//*[text()='APPLE']")
	WebElement appleCheckBox;
	
	@FindBy(xpath="(//*[text()='APPLE'])[1]")
	WebElement appleInFilters;
	
	@FindBy(xpath="(//*[text()='realme'])[1]")
	WebElement realmeInFilters;
	
	@FindBy(xpath="(//*[text()='SAMSUNG'])[1]")
	WebElement samsungInFilters;
	
	public void checkBoxes() throws InterruptedException {
		
		appleCheckBox.click();
		Thread.sleep(2000);
		realmeCheckBox.click();
		Thread.sleep(2000);
		samsungCheckBox.click();
	}
	
	public void verifyFilters() {
		Assert.assertTrue(appleInFilters.isDisplayed());
		Assert.assertTrue(realmeInFilters.isDisplayed());
		Assert.assertTrue(samsungInFilters.isDisplayed());
	}
	
	public void unCheckBoxes() throws InterruptedException {
		appleInFilters.click();
		Thread.sleep(2000);
		realmeInFilters.click();
		Thread.sleep(2000);
		samsungInFilters.click();
	}
}
