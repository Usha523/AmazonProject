package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

	public class VerifyRoomPageTestNG {
		private WebDriver driver;      // call Global variable
		private	LoginPage loginpage;
		private	MessengerPage messengerPage;
		private	RoomsPage roomPage;
//only hint browser execution  repreated steps
	@BeforeClass
	public void openRoomPagetab()       
	{
		System.out.println("Beforeclass");
		System.setProperty("webdriver.chrome.driver", "D:\\chromeusha\\chromedriver.exe");
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
		
	}
	
	@Test
	public void verifyRetureenMessengerButton()    //Its a proper Execution parts
	{
		System.out.println("test1");
		
		roomPage.returnToMessenger();
		// Actual Result
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		if (url.equals("https://www.messenger.com/") && title.equals("Messenger"))
		{
			System.out.println("Pass");
		} 
		else
		{
			System.out.println("fail");

		}
	}
				
	@Test
	public void verifyContactHelpCenter()
	{
		System.out.println("test2");
		roomPage.goBackToHelpCenter();

		
		//Actual Result
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");

		}
		
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
	
	