package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage1;
import pages.SelectsMobiles;
import pages.SumsungMob2;

public class DemoAmazoan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromeusha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		HomePage1 homepage1=new HomePage1(driver);
		homepage1.allTabOpen();
		Thread.sleep(2000);
		homepage1.clickOnMobTab();
		Thread.sleep(2000);
		homepage1.clickOnAllMobTab();
		Thread.sleep(2000);
		
		SumsungMob2 sumsungMob2=new SumsungMob2(driver);
		sumsungMob2.clickOnSamsungCheckBox();
		Thread.sleep(2000);
		sumsungMob2.goToPriceList();
		Thread.sleep(2000);
		sumsungMob2.selectHighPrice();
		Thread.sleep(2000);
		 
		SelectsMobiles selectsMobiles=new SelectsMobiles(driver);
		selectsMobiles.mobile1click();
		Thread.sleep(2000);
//		selectsMobiles.scrollMob2();
//		Thread.sleep(2000);
//		selectsMobiles.scrollMob3();
//		Thread.sleep(2000);
		selectsMobiles.mobile2click();
		Thread.sleep(2000);
		selectsMobiles.mobile3click();
		
		
		
		
		

		
		
		
		
		
		

		
		
		
		

	}

}
