package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
	
	//Variable WebElement
	
	@FindBy(xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy(xpath="//a[text()='Features']")
	private WebElement features;
	
	@FindBy(xpath="//a[text()='Desktop app']")
	private WebElement desktopApp;
	
	@FindBy(xpath="//a[text()='Privacy and safety']")
	private WebElement privacyandseftyTab;
	
	//Constructor-Initialization
	public MessengerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Method-Actions of WebElement
	public void clickOnRoomsTab()
	{
		rooms.click();
	}
	public void clickOnfeaturesTab()
	{
		features.click();
	}
	public void clickOndesktopAppTab()
	{
	desktopApp.click();
	}
	public void clickOnpravicytab()
	{
		
		privacyandseftyTab.click();
}
//OR====================================================================================================================================================================//	

	
	
}
