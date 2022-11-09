package testPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;
import setup.Base;
import utils.Utility;

public class VerifyHomePage extends Base {
	private WebDriver driver;      // call Global variable
	private	LoginPage loginpage;
	private	MessengerPage messengerPage;
	private	RoomsPage roomPage;
	private SoftAssert soft;
	private int testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
	{
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
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
	public void CreatePomBojects() throws EncryptedDocumentException, IOException
	{
		
		System.out.println("before classs");

		//driver.get("https://www.facebook.com/");
		
		loginpage = new LoginPage(driver);
		
		String data=Utility.getDataFromExcelSheet("Sheet3", 7, 0);
		loginpage.sendUserNme(data);
		
		data=Utility.getDataFromExcelSheet("Sheet3", 7, 1);
		loginpage.sendPassword(data);
		
		messengerPage = new MessengerPage(driver);
		roomPage = new RoomsPage(driver);
		
	}
	@BeforeMethod
	public void openRoomPageLoginToUserAccount()
	{
//		System.out.println("before method");
		driver.get("https://www.facebook.com/");
//		
		loginpage.openMessengerPage();
		messengerPage.clickOnRoomsTab();
		soft=new SoftAssert();
	}
	
	@Test(priority=1)
	public void verifyReturnToMessengerButton()
	{
		testID=1212;
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
		testID=2343;
		System.out.println("test2");
		roomPage.goBackToHelpCenter();

		//if else cha jagi aplyla assertion vaprav lagte
		//Actual Result
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
	
		
		
		soft.assertEquals(url, "https://www.messenger.com/help");
		soft.assertEquals(title, "Messenger Help Centre");
		Assert.fail();
		soft.assertAll();
	}
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException
	{
		System.out.println("After Method");
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreen(testID, driver);
		}
		
	}
	@AfterClass
	public void clearObject()
	{
		loginpage = null;
		messengerPage =null;
		roomPage = null;
	}
	@AfterTest
	public void closeBrowser()
	{
		
		driver.close();	
		driver=null;
		//To remove delete all object without referance 
		System.gc();     //grabage collector
	}
	


}
