package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SumsungMob2 {
	
	private WebDriver driver;
	private WebDriverWait wait;
//	private Actions act;
	private JavascriptExecutor js;
	private ArrayList<String> add;
	
	@FindBy(xpath= "//span[text()='Samsung']")private WebElement samsungChecxBox;
	@FindBy(xpath= "//span[text()='Price']")private WebElement priceList;   //scroll
	@FindBy(xpath= "//span[text()='₹10,000 - ₹20,000']")private WebElement highpriceList;
	//constructor->private->WebElement->Initialization
	public SumsungMob2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		//act= new Actions(driver);
		js=(JavascriptExecutor)driver;
		add=new ArrayList<String>(driver.getWindowHandles());
		
	}
	//Method ->Public ->uses/Actions
	public void clickOnSamsungCheckBox() throws InterruptedException
	{
//		Thread.sleep(5000);
//		add=new ArrayList<String>(driver.getWindowHandles());
//		samsungChecxBox.click();
		Thread.sleep(2000);
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(samsungChecxBox));
		samsungChecxBox.click();
	}
	public void goToPriceList() throws InterruptedException
	{		
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView(true)", priceList);
	}
	public void selectHighPrice() throws InterruptedException
	{
		Thread.sleep(2000);
		highpriceList.click();
	}
	


}
