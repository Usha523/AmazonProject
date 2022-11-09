package testPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import module.SignupPopoup;
import pages.LoginPage;
import pages.SampleLoginPage;

public class TestNgClassExecuted {
	private WebDriver driver;
	SampleLoginPage sampleLoginPage;
	SignupPopoup signupPopoup;
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Beforeclass");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();        //Local Variable
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void loginSignup()
	{
		//driver.get("https://www.facebook.com/");
		
		sampleLoginPage=new SampleLoginPage(driver);
		signupPopoup=new SignupPopoup(driver);
	}
	@Test(priority=0)
	public void verifycreatenewaccountTab() throws InterruptedException
	{
		sampleLoginPage=new SampleLoginPage(driver);
		sampleLoginPage.sendUserNme();
		sampleLoginPage.sendPassword();
		sampleLoginPage.clickOncreateAccountButton();
		Thread.sleep(2000);
	}
	@Test
	public void verifySignupPopUp() throws InterruptedException
	{
		signupPopoup.sendFirstName();
		Thread.sleep(2000);
		signupPopoup.sendLastName();
		Thread.sleep(2000);
		signupPopoup.sendNewPassword();
		Thread.sleep(2000);
		signupPopoup.clickOnSignPupButton();
		
	}
	
	
	
	
	
	

}
