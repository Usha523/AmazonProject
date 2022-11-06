package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectsMobiles {

	private WebDriver driver;
	private Actions act;
	private JavascriptExecutor js;
	private ArrayList<String>temp;

	@FindBy(xpath = "(//img[@class='s-image'])[1]")private WebElement mobile1;
	@FindBy(xpath = "(//img[@class='s-image'])[4]")private WebElement mobile2;
	@FindBy(xpath = "(//img[@class='s-image'])[7]")private WebElement mobile3;
	@FindBy(xpath = "(//i[@role='img'])[1]")private WebElement scrollForMobile2;             
	@FindBy(xpath = "(//i[@role='img'])[2]")private WebElement scrollForMobile3;
	
	
	
	@FindBy(xpath = "(//a[@id='mbbPopoverLink'])[3]")private WebElement scrolladcart;
	@FindBy(xpath = "//input[@id='buy-now-button']")private WebElement bynowMobile1;
	@FindBy(xpath = "//input[@id='add-to-cart-button']")private WebElement adtoCartMobile2;
	@FindBy(xpath = "//h1[@class='a-size-base-plus a-text-bold']")private WebElement scrollMobile3;
	@FindBy(xpath = "(//a[@id='mbbPopoverLink'])[3]")private WebElement seeproductDetailsMobile3;

	// constructor->private->WebElement->Initialization
	public SelectsMobiles (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act= new Actions(driver);
		js=(JavascriptExecutor)driver;
		temp=new ArrayList<String>(driver.getWindowHandles());
	}

	// Method ->Public ->uses/Actions
	public void mobile1click() throws InterruptedException {
		mobile1.click();
		temp=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);	
		driver.switchTo().window(temp.get(1));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", scrolladcart);
		bynowMobile1.click();
		driver.switchTo().window(temp.get(0));
		
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollForMobile2);
		Thread.sleep(2000);
	}
	public void mobile2click() throws InterruptedException {
		mobile2.click();
		temp=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(temp.get(2));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", scrolladcart);
		adtoCartMobile2.click();
		driver.switchTo().window(temp.get(0));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollForMobile3);
		Thread.sleep(2000);
	}

	public void mobile3click() throws InterruptedException {
		
		mobile3.click();
		temp=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(temp.get(3));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", scrollMobile3);
		seeproductDetailsMobile3.click();
		driver.switchTo().window(temp.get(0));

		
	}

	
}
