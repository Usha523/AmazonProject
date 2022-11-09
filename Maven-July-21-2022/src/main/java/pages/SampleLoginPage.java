package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleLoginPage {
	

	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createnewAccount;
	
	//Constructor initialization
	
	public SampleLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//Method Actions or webElemnt
	public void sendUserNme()
	{
		userName.sendKeys("ushakalpande@gmail.com");
	}
	public void sendPassword()
	{
		passWord.sendKeys("12345");
	}
	
	public void clickOncreateAccountButton()
	{
		createnewAccount.click();
	}


}
