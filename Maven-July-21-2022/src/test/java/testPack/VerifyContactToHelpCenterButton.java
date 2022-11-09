package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;
import pages.RoomsPage;

public class VerifyContactToHelpCenterButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromeusha\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// To verify Return To Messenger.com
		driver.get("https://www.facebook.com/");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.openMessengerPage();
		
		
		MessengerPage messengerPage=new MessengerPage(driver);
		messengerPage.clickOnRoomsTab();
		
		RoomsPage roomPage=new RoomsPage(driver);
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

}

