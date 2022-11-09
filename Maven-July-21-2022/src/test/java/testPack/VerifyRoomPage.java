package testPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;
import setup.Base;
import utils.Utility;

public class VerifyRoomPage  extends Base{
	private WebDriver driver;      // call Global variable
	private	LoginPage loginpage;
	private	MessengerPage messengerPage;
	private	RoomsPage roomPage;
	private SoftAssert soft;
	private int testID;

	@BeforeTest
	@Parameters("browser")
	
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=openChromeBrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			driver=openFirefoxBrowser();
		}
		if(browserName.equals("Edge"))
		{
			driver=OpenEdgeBrowser();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
			
	}
	@BeforeClass
	public void CreatePomBojects()
	{
		//driver.get("https://www.facebook.com/");
		loginpage = new LoginPage(driver);
		messengerPage = new MessengerPage(driver);
		roomPage = new RoomsPage(driver);
	}  
	@BeforeMethod
	public void openRoomPage()
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
		loginpage.openMessengerPage();
		messengerPage.clickOnRoomsTab();
		soft=new SoftAssert();
	}
	
	@Test(priority=1)
	public void verifyReturnToMessengerButton()
	{
		testID=2345;
		System.out.println("test1");
		roomPage.returnToMessenger();
		// Actual Result
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		//AssertMethods
		
		soft.assertEquals(url, "https://www.messenger.com/");
		soft.assertEquals(title, "Messenger");
		soft.assertAll();
		
	}
	@Test(priority=2)
	public void verifyContactToHelpCenterButton()
	{
		System.out.println("test2");
		roomPage.goBackToHelpCenter();

		//if else cha jagi aplyla assertion vaprav lagte
		//Actual Result
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		
		soft.assertEquals(url, "https://www.messenger.com/help");
		soft.assertEquals(title, "Messenger Help Centre");
		soft.assertAll();
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void clearObject()
	{
		loginpage = null;
		messengerPage =null;
		roomPage = null;
	}
//	@AfterTest
//	public void closeBrowser()
//	{
//		driver.close();	
//		driver=null;
//		//To remove delete all object without referance 
//		System.gc();     //grabage collector
//	}
	

	
	
}
