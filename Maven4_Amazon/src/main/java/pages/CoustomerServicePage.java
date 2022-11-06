package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoustomerServicePage {
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath= "//a[text()='Customer Service']']")private WebElement customerservice;
	
	
	//constructor->private->WebElement->Initialization
	
	public CoustomerServicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
//		this.driver=driver;
//		act= new Actions(driver);
	}
	
	//Method ->Public ->uses/Actions
	public void clickoncustermerService() throws InterruptedException
	{
		Thread.sleep(3000);
		customerservice.click();
		
	}
//	public void clickOnMobTab() throws InterruptedException
//	{
//		act.moveToElement(mobileTab).click().build().perform();
//		Thread.sleep(2000);
//	}
//	
//	public void clickOnAllMobTab()
//	{
//
//		act.moveToElement(allmobileTab).click().build().perform();
//		
//	}
//	
//

}
