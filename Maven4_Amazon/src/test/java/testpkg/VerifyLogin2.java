package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.ListOutpopUp;
import pages.HomePage;

public class VerifyLogin2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		HomePage homepage=new HomePage(driver);
		
		homepage.clickOnAllTab();
		Thread.sleep(2000);
		homepage.ClickOnComputerTab();
		Thread.sleep(2000);
		homepage.ClickOnLaptpAcceser();
		Thread.sleep(2000);
		homepage.clickonBatteries();
		Thread.sleep(2000);
		homepage.clickbatteries1();
		Thread.sleep(2000);
		homepage.clickonSellOnbutton();
		Thread.sleep(2000);
		//homepage.clickonProcessedButton();
		
//		ListOutpopUp listOutpopUp=new ListOutpopUp(driver);
//		
//		listOutpopUp.clickonList1();
//		Thread.sleep(2000);
//		listOutpopUp.createList();
//		

	}

}
