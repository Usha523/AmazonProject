package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CoustomerServicePage;
import pages.HomePage1;
import pages.SelectsMobiles;
import pages.SumsungMob2;

public class TestNgClassAmzonSuccessFullyLogin {
	private WebDriver driver;
	private HomePage1 homepage1;
	private SumsungMob2 sumsungMob2;
	private SelectsMobiles selectsMobiles;
	CoustomerServicePage coustomerServicePage;
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Lanuch browser");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void  beforemethod()
	{
		driver.get("https://www.amazon.in/ref=nav_logo");
		homepage1 = new HomePage1(driver);
		//driver.getWindowHandles();
		//sumsungMob2 = new SumsungMob2(driver);
		//selectsMobiles = new SelectsMobiles(driver);
	}
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		homepage1.allTabOpen();
		homepage1.clickOnMobTab();
		homepage1.clickOnAllMobTab();
		Thread.sleep(3000);
		sumsungMob2 = new SumsungMob2(driver);
		sumsungMob2.clickOnSamsungCheckBox();
		sumsungMob2.selectHighPrice();
		Thread.sleep(2000);
		selectsMobiles = new SelectsMobiles(driver);
		selectsMobiles.mobile1click();
		selectsMobiles.mobile2click();
		selectsMobiles.mobile3click();
	}
	@Test(priority=2)
	public void test2() throws InterruptedException
	{
		 coustomerServicePage=new pages.CoustomerServicePage(driver);
		 coustomerServicePage.clickoncustermerService();
		 
	}
//	@Test(priority=3)
//	public void test3() throws InterruptedException
//	{
	
//		selectsMobiles.mobile1click();
//		selectsMobiles.mobile2click();
//		selectsMobiles.mobile3click();
//
//	}

}
