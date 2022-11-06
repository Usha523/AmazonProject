package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//variable->private->WebElement ->deceleration
	WebDriver driver;
	
	@FindBy(xpath= "//a[@id='nav-hamburger-menu']")  private WebElement allmenu;
	@FindBy(xpath= "//div[text()='Computers']")      private WebElement computer;
	@FindBy(xpath= "//a[text()='Laptop Accessories']")private WebElement laptpAccesser;
	//@FindBy(xpath= "//a[text()='Laptop Accessories']")private WebElement checkBox;
	@FindBy(xpath= "//span[text()='Batteries']")private WebElement batteries;
	@FindBy(xpath= "(//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')])[3]")private WebElement clickbatteries;
	@FindBy(xpath= "(//a[text()='Sell on Amazon'])[1]")private WebElement sellOn;
//	@FindBy(xpath= "//input[@id='add-to-cart-button']")private WebElement addtoCart;
//	@FindBy(xpath= "//input[@name='proceedToRetailCheckout']")private WebElement processed;
	
	
	//constructor->private->WebElement->Initialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Method ->Public ->uses/Actions
	public void clickOnAllTab()
	{
		allmenu.click();
	}
	public void ClickOnComputerTab()
	{
		computer.click();
	}
	
	public void ClickOnLaptpAcceser()
	{
		laptpAccesser.click();
	}
	public void clickonBatteries()
	{
		batteries.click();
	}
	public void clickbatteries1()
	{
		clickbatteries.click();
	}
	public void clickonSellOnbutton()
	{
		sellOn.click();
	}
//	public void clickonProcessedButton()
//	{
//		processed.click();
//	}
	
}