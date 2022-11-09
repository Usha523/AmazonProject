package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		//Variable WebElement
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createnewAccount;
	
	@FindBy(xpath="//a[text()='Messenger']")
	private WebElement messengers;
//	
	//Constructor initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//Method Actions or webElemnt
//	public void sendUserNme()
//	{
//		userName.sendKeys("ushakalpande@gmail.com");
//	}
//	public void sendPassword()
//	{
//		passWord.sendKeys("12345");
//	}
//	
//	public void clickOnLoginButton()
//	{
//		loginButton.click();
//	}
//	public void clickOncreateAccountButton()
//	{
//		createnewAccount.click();
//	}
//	
//	public void openMessengerPage()
//	{
//		messengers.click();
//	}
	
// Change s in utility all calsess========================================================================================================//
	
	public void sendUserNme(String name)
	{
		userName.sendKeys(name);
	}
	public void sendPassword(String password)
	{
		passWord.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	public void clickOncreateAccountButton()
	{
		createnewAccount.click();
	}
	
	public void openMessengerPage()
	{
		messengers.click();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//OR=============================================================================================== Group Of Actions
//	public void loginToapplication()
//	{
//		userName.sendKeys("ushakalpande@gmail.com");
//		passWord.sendKeys("12345");
//		loginButton.click();
//		messengers.click();
//	}
	
}

