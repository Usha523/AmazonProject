package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

public class TestNgAssertMethods {
	private WebDriver driver;      // call Global variable
	private	LoginPage loginpage;
	private	MessengerPage messengerPage;
	private	RoomsPage roomPage;
	private SoftAssert soft;
	@BeforeClass
	public void openRoomPagetab()       
	{
		System.out.println("Beforeclass");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();        //Local Variable
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.out.println("beforemethod");
		driver.get("https://www.facebook.com/");
		loginpage = new LoginPage(driver);
		loginpage.openMessengerPage();
		Thread.sleep(2000);
		messengerPage = new MessengerPage(driver);
		messengerPage.clickOnRoomsTab();
		Thread.sleep(2000);
		roomPage = new RoomsPage(driver);
		Thread.sleep(2000);
		soft=new SoftAssert();
		
	}
	
	@Test
	public void verifyRetureenMessengerButton()    //Its a proper Execution parts
	{
		System.out.println("test1");
		
		roomPage.returnToMessenger();
		// Actual Result
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		//AssertMethods
		
		soft.assertEquals(url, "https://www.messenger.com/");
		soft.assertEquals(title, "Messenger");
		soft.assertAll();
		
//		Assert.assertEquals(url, "https://www.messenger.com/");
//		boolean result=url.equals("https://www.messenger.com/")  &&title.equals("Messenger");
//		Assert.assertTrue(result);
//		System.out.println(result);
		
		
		
//		if (url.equals("https://www.messenger.com/") && title.equals("Messenger"))
//		{
//			System.out.println("Pass");
//		} 
//		else
//		{
//			System.out.println("fail");
//
//		}
	}
				
	@Test
	public void verifyContactHelpCenter()
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
		
		
		
		
//		//AssertEqualMethod
//		
//		Assert.assertEquals(url,"https://www.messenger.","URL of message Not Found" );
//		//Assert.assertNotEquals(url, "https://www.messenger.com/help");
//		boolean result=url.equals("https://www.messenger.com/help")  &&title.equals("Messenger Help Centre");
//		//Assert.assertFalse(result);`	
//		System.out.println(result);
		
		
		
		
		//		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help CentreMessenger Help Centre"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("fail");
//
//		}
		
	}
					
	@AfterMethod
	public void logout()
	{
		System.out.println("LOgout");
	}
	@AfterClass
	public void closed()
	{
		System.out.println("closed");
		driver.close();
	}
		
	}



