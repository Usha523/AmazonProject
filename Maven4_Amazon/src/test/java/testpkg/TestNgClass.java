package testpkg;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage1;
import pages.SelectsMobiles;
import pages.SumsungMob2;

public class TestNgClass  {
	private WebDriver driver;
	private HomePage1 homepage1;
	private SumsungMob2 sumsungMob2;
	private SelectsMobiles selectsMobiles;
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Lanuch browser");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("HintUrl");
		homepage1=new HomePage1(driver);
		sumsungMob2=new SumsungMob2(driver);
		selectsMobiles=new SelectsMobiles(driver);
		
	}
//	@BeforeMethod
//	public void beforemethod() throws InterruptedException
//	{
//		System.out.println("HintUrl");
//		homepage1=new HomePage1(driver);
//		sumsungMob2=new SumsungMob2(driver);
//		selectsMobiles=new SelectsMobiles(driver);
//		
////		HomePage1 homepage1=new HomePage1(driver);
////		homepage1.allTabOpen();
////		Thread.sleep(2000);
////		homepage1.clickOnMobTab();
////		Thread.sleep(2000);
////		homepage1.clickOnAllMobTab();
////		Thread.sleep(2000);
////		
////		SumsungMob2 sumsungMob2=new SumsungMob2(driver);
////		sumsungMob2.clickOnSamsungCheckBox();
////		Thread.sleep(2000);
////		sumsungMob2.goToPriceList();
////		Thread.sleep(2000);
////		sumsungMob2.selectHighPrice();
////		Thread.sleep(2000);
////		SelectsMobiles selectsMobiles=new SelectsMobiles(driver);	
//	}
	@Test
	public void test1() throws InterruptedException
	{
		homepage1.allTabOpen();
		homepage1.clickOnAllMobTab();
		homepage1.clickOnAllMobTab();
		
	}
	@Test
	public void test2() throws InterruptedException
	{
		sumsungMob2.clickOnSamsungCheckBox();
		sumsungMob2.selectHighPrice();
	}
	@Test
	public void test3() throws InterruptedException
	{
		selectsMobiles.mobile1click();
		selectsMobiles.mobile2click();
		selectsMobiles.mobile3click();
		
	}

}
