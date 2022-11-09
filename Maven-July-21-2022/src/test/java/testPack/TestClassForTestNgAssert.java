package testPack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassForTestNgAssert {
	private WebDriver driver;

	
	@Test
	public void verifyRetureenMessengerButton()    //Its a proper Execution parts
	{
		System.out.println("test1");
		
	//	roomPage.returnToMessenger();
		// Actual Result
		String url = "https://www.messenger.com/";
		String title = "Messenger";
		
		//AssertMethods
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(url, "https://www.messenger./","URL Not Found");
		System.out.println("Hello");
		soft.assertEquals(title,"Messeng");
		soft.assertAll();

	

}
}
