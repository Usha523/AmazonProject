package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	private Actions act;
	
	//Variable->private WebElement declaration
	
	@FindBy(xpath= "//a[@id='nav-link-accountList']") private WebElement accountandList;
	@FindBy(xpath= "(//span[text()='Sign in'])[1]") private WebElement signButton;
	@FindBy(xpath= "//input[@id='ap_email']") private WebElement username;
	@FindBy(xpath= "//input[@id='continue']") private WebElement continueButton;
	@FindBy(xpath= "//input[@id='ap_password']") private WebElement password;
	@FindBy(xpath= "//input[@id='signInSubmit']") private WebElement signInButton;
	@FindBy(xpath= "//div[text()='Mobiles']") private WebElement mobile;
	
	
	//Constructor->public WebElement Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
	//Method->public Actions
	
	public void moveaccountList()
	{
		act.moveToElement(accountandList).build().perform();
	}
	public void clickOnSignButton1()
	{
		act.moveToElement(signButton).click().build().perform();
	}
	
	
	public void sendUserName()
	{
		username.sendKeys("9307816091");
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
	public void sendPassword()
	{
		password.sendKeys("Usha@12345");
	}
	

	public void clickOnSignButton2() {
		// TODO Auto-generated method stub
		signInButton.click();
	}
	
	
	
	
}