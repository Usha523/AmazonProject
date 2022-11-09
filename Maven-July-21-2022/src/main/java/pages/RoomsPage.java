package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {
	
	//Variable ==WebElement
	@FindBy(xpath=   "//a[text()=' Return to messenger.com ']")
	private WebElement returnButton;
	
	@FindBy(xpath=  "//a[text()=' Visit our help center ']")
	private WebElement contactToHelpCenter;
	
	//Constructor===Initialization
	
	public RoomsPage (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	// method==Actions
	
	public void returnToMessenger()
	{
		returnButton.click();
	}
	
	public void goBackToHelpCenter()
	{
		contactToHelpCenter.click();
	}
	

	
	
	

}
	
