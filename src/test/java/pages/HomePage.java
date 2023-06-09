package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	Actions action;
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement popUpCloseButton;
	
	@FindBy(xpath="(//*[text()='Mobiles'])[1]")
	WebElement mobilesLink;
	
	public void navigateToMobiles() {
		if(popUpCloseButton.isDisplayed()) {
			popUpCloseButton.click();
		}
		mobilesLink.click();
	}
}
