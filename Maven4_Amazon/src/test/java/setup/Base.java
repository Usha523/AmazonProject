package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	//Browser RElated Code
	public static WebDriver openChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromeusha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static WebDriver openFirefoxBrowser() 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	
	
	

}
