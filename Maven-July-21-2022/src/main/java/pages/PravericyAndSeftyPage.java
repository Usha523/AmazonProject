package pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PravericyAndSeftyPage {
	private WebDriver driver;
	private JavascriptExecutor js;
	private ArrayList<String>se;
	
	
	//Variable ==WebElement
		@FindBy(xpath="//h2[text()='Additional resources']")
		private WebElement scrolladditionalresouces;
	
		@FindBy(xpath="(//a[text()=' Messenger Kids '])[1]")
		private WebElement messengerkides;
		
		@FindBy(xpath=  "(//a[text()=' Facebook Safety Centre '])[3]")
		private WebElement facebookseftycenter;
		
		//Constructor===Initialization
		
		public PravericyAndSeftyPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			PageFactory.initElements(driver, this);
			this.driver=driver;
			js=(JavascriptExecutor)driver;

			se= new ArrayList<String>(driver.getWindowHandles());
			
		}
		
		// method==Actions
		
		public void clickmessengerkides() throws InterruptedException
		{
			js.executeScript("arguments[0].scrollIntoView(true)", scrolladditionalresouces);
			se= new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(se.get(1));
			Thread.sleep(2000);
			messengerkides.click();
			Thread.sleep(2000);
			driver.switchTo().window(se.get(0));
			Thread.sleep(2000);
		}
		
		

		public void clickfacebookseftycenter() throws InterruptedException {
			// TODO Auto-generated method stub
			js.executeScript("arguments[0].ScrollIntoView(true)", scrolladditionalresouces);
			se= new ArrayList<String>(driver.getWindowHandles());
			Thread.sleep(2000);
			driver.switchTo().window(se.get(2));
			facebookseftycenter.click();
			Thread.sleep(2000);
			driver.switchTo().window(se.get(0));
			
			
		}
	
	
	
		
		

}
