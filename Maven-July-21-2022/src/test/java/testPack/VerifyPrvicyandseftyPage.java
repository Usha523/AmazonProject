package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessengerPage;
import pages.PravericyAndSeftyPage;
import pages.RoomsPage;

public class VerifyPrvicyandseftyPage {

private WebDriver driver;
private LoginPage loginpage;
private MessengerPage messengerPage;
private PravericyAndSeftyPage pravericyAndSeftyPage;
private SoftAssert soft;
	
@BeforeClass
public void openpravicyTab()       
{
	System.out.println("Beforeclass");
	System.setProperty("webdriver.chrome.driver", "D:\\chromeusha\\chromedriver.exe");
	driver = new ChromeDriver();       	 //Local Variable
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
	messengerPage.clickOnpravicytab();
	Thread.sleep(2000);
	pravericyAndSeftyPage = new PravericyAndSeftyPage(driver);
	Thread.sleep(2000);
	soft=new SoftAssert();
	
}

@Test(priority=1)
public void verifykidesbutton() throws InterruptedException    //Its a proper Execution parts
{
	System.out.println("test1");
	
	pravericyAndSeftyPage.clickmessengerkides();
	// Actual Result
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	
	//AssertMethods
	
	soft.assertEquals(url, "https://messengerkids.com");
	soft.assertEquals(title,"Messenger Kids | The messaging app for kids");
	soft.assertAll();
	
//	Assert.assertEquals(url, "https://www.messenger.com/");
//	boolean result=url.equals("https://www.messenger.com/")  &&title.equals("Messenger");
//	Assert.assertTrue(result);
//	System.out.println(result);
	
	
	
//	if (url.equals("https://www.messenger.com/") && title.equals("Messenger"))
//	{
//		System.out.println("Pass");
//	} 
//	else
//	{
//		System.out.println("fail");
//
//	}
}
			
@Test(priority=2)
public void verifyContactHelpCenter() throws InterruptedException
{
	System.out.println("test2");
	pravericyAndSeftyPage.clickfacebookseftycenter();

	//if else cha jagi aplyla assertion vaprav lagte
	//Actual Result
	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	
	
	soft.assertEquals(url, "https://www.facebook.com/safety/");
	soft.assertEquals(title, "Safety Center");
	soft.assertAll();
	
	
	
	
//	//AssertEqualMethod
//	
//	Assert.assertEquals(url,"https://www.messenger.","URL of message Not Found" );
//	//Assert.assertNotEquals(url, "https://www.messenger.com/help");
//	boolean result=url.equals("https://www.messenger.com/help")  &&title.equals("Messenger Help Centre");
//	//Assert.assertFalse(result);`	
//	System.out.println(result);
	
	
	
	
	//		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help CentreMessenger Help Centre"))
//	{
//		System.out.println("Pass");
//	}
//	else
//	{
//		System.out.println("fail");
//
//	}
	
}//
				
//@AfterMethod
//public void logout()
//{
//	System.out.println("LOgout");
//}
//@AfterClass
//public void closed()
//{
//	System.out.println("closed");
////	driver.close();
//}
}