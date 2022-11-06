package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.HomePage1;
import pages.LoginPage;
import pages.SearchMobileinSearchBar;
import pages.SelectsMobiles;
import pages.SumsungMob2;
import setup.Base;

public class ByNowAllMob extends Base{
	private WebDriver driver;
	private HomePage1 homepage1;
	private SumsungMob2 sumsungMob2;
	private SelectsMobiles selectsMobiles;
	private LoginPage loginPage;
	private SearchMobileinSearchBar searchMobileinSearchBar;
	@Parameters("browser")
	@BeforeTest
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void pomClassObject()
	{
		System.out.println("before class");
		loginPage=new LoginPage(driver);
		homepage1 = new HomePage1(driver);
		sumsungMob2 = new SumsungMob2(driver);
		selectsMobiles = new SelectsMobiles(driver);
		searchMobileinSearchBar=new SearchMobileinSearchBar(driver);
		
	}
	
	@BeforeMethod
	public void hintUrl()
	{
		System.out.println("before method");
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		loginPage=new LoginPage(driver);
		loginPage.moveaccountList();
		loginPage.clickOnSignButton1();
		loginPage.sendUserName();
		loginPage.clickOnContinueButton();
		loginPage.sendPassword();
		loginPage.clickOnSignButton2();
		homepage1=new HomePage1(driver);
	}
	@Test(priority=0)
	public void select3mobandBy() throws InterruptedException
	{
		homepage1.allTabOpen();
		homepage1.clickOnMobTab();
		homepage1.clickOnAllMobTab();
		Thread.sleep(3000);
		sumsungMob2.clickOnSamsungCheckBox();
		sumsungMob2.selectHighPrice();
		Thread.sleep(2000);
		selectsMobiles.mobile1click();
		Thread.sleep(2000);
		selectsMobiles.mobile2click();
		Thread.sleep(2000);
		selectsMobiles.mobile3click();
	}
//	@Test(priority=1)
//	public void searchMobile() throws InterruptedException
//	{
//		searchMobileinSearchBar=new SearchMobileinSearchBar(driver);
//		Thread.sleep(2000);
//		searchMobileinSearchBar.clickonSearchAndMobile();
//		Thread.sleep(2000);
//		searchMobileinSearchBar.clickonSearchTab();
//		
//	}
	@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("AfterMethod");
		System.out.println("Logout");
	}
	@AfterClass
	public void clearObject()
	{
		homepage1=null;
		sumsungMob2=null;
		selectsMobiles=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		//to delete all object without reference
		System.gc();    //Garbage collector
	}
	
}
