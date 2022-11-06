package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMobileinSearchBar {
	private WebDriver driver;
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")private WebElement mobileonsearch;
	@FindBy(xpath= "//input[@id='nav-search-submit-button']")private WebElement cliconsearchbutton;
	//@FindBy(xpath= "//div[@id='hmenu-content']//a[text()='All Mobile Phones']")private WebElement allmobileTab;
	
	//constructor->private->WebElement->Initialization
	
	public SearchMobileinSearchBar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Method ->Public ->uses/Actions
	public void clickonSearchAndMobile() throws InterruptedException
	{
		mobileonsearch.sendKeys("Mobile");
		Thread.sleep(2000);
	}
	public void clickonSearchTab() throws InterruptedException
	{
		cliconsearchbutton.click();
		Thread.sleep(2000);
	}
	
	

}
