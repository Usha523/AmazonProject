package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class verifyLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		
		LoginPage lomepage=new LoginPage(driver);
		lomepage.moveaccountList();
		Thread.sleep(2000);
		lomepage.clickOnSignButton1();
		Thread.sleep(2000);
		lomepage.sendUserName();
		Thread.sleep(2000);
		lomepage.clickOnContinueButton();
		Thread.sleep(2000);
		lomepage.sendPassword();
		Thread.sleep(2000);
		lomepage.clickOnSignButton2();
		Thread.sleep(2000);
		

	}

}
