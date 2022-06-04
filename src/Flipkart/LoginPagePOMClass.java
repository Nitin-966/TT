package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
   private WebDriver driver;
   
   @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobile;
   public void entermobile()
   {
	   mobile.sendKeys("9028760700"); 
   }
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	public void enterpassword()
	{
		password.sendKeys("225533");
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbutton;
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	
	 public LoginPagePOMClass(WebDriver driver)
	
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	
	
	
	
	
	
}
