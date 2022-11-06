package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath= "(//span[text()='All'])[2]")private WebElement allTab;
	@FindBy(xpath= "//div[@id='hmenu-content']//div[text()='Mobiles, Computers']")private WebElement mobileTab;
	@FindBy(xpath= "//div[@id='hmenu-content']//a[text()='All Mobile Phones']")private WebElement allmobileTab;
	
	//constructor->private->WebElement->Initialization
	
	public HomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act= new Actions(driver);
	}
	
	//Method ->Public ->uses/Actions
	public void allTabOpen() throws InterruptedException
	{
		allTab.click();
		Thread.sleep(2000);
	}
	public void clickOnMobTab() throws InterruptedException
	{
		act.moveToElement(mobileTab).click().build().perform();
		Thread.sleep(2000);
	}
	
	public void clickOnAllMobTab()
	{

		act.moveToElement(allmobileTab).click().build().perform();
		
	}
	

}
