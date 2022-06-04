package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{

	private WebDriver driver;
//	private  Actions a;
	@FindBy(xpath="//div[text()='Top Offers']")
	private WebElement topoffer;
	
	public void clicktopoffer()
	{
		 
		topoffer.click();
	}
	
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		a = new Actions(driver);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
