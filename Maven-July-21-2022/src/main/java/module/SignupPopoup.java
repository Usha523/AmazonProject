package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPopoup {
	
	//Variable WebElement
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobNomaiId;
	

	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement newPassword;
	
	@FindBy(xpath="//input[@id='day']")
	private WebElement day;
	

	@FindBy(xpath="//input[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement year;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signupButton;
	
	//Constructor Intalization
	
	public SignupPopoup (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//methods -actions on WebElement
	
	public void sendFirstName()
	{
		firstName.sendKeys("usha");
	}
	public void sendLastName()
	{
		lastName.sendKeys("kalpande");
	}
	public void sendMobNumber()
	{
		mobNomaiId.sendKeys("7721853019");
	}
	
	public void sendNewPassword()
	{
		newPassword.sendKeys("usha@");
	}
	public void senddayNo()
	{
		day.sendKeys("Feb");
	}
	public void sendMonthNo()
	{
		month.sendKeys("12");
	}
	public void sendYear()
	{
		year.sendKeys("2022");
		
	}
	public void clickOnSignPupButton()
	{
		signupButton.click();
		
	}
	
	
	//OR===============================================
	
//	public void SignUpopupApplication()
//	{
//		firstName.sendKeys("usha");
//		lastName.sendKeys("kalpande");
//		mobNomaiId.sendKeys("7721853019");
//		newPassword.sendKeys("usha@");
//		day.sendKeys("Feb");
//		month.sendKeys("12");
//		year.sendKeys("2022");
//	}
	
	
}
