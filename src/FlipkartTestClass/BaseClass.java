package FlipkartTestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Flipkart.LoginPagePOMClass;

  



 

public class BaseClass 
{
    WebDriver  driver;
   @BeforeMethod
   
   public void setup()
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
       driver=new ChromeDriver();
       System.out.println(" open browser");
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       System.out.println("openurl");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   
       LoginPagePOMClass   lp = new LoginPagePOMClass(driver); 
       lp.entermobile();
       System.out.println("enter mobile no ");
       lp.enterpassword();
       System.out.println("enter password");
       lp.clickloginbutton();
       System.out.println("click login button");
   }
	
//	 @AfterMethod
//	
//	public void method()
//	{
//		driver.quit();
//	    System.out.println("end of program");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

