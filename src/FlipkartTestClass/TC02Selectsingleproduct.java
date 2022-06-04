package FlipkartTestClass;

import org.testng.annotations.Test;

import Flipkart.HomePagePOMClass;

public class TC02Selectsingleproduct extends BaseClass
{

	
	@Test
	
	public void selectsingleproduct() throws InterruptedException
	{
		HomePagePOMClass home = new HomePagePOMClass(driver);
		home.clicktopoffer();
	    System.out.println("click");
	    Thread.sleep(3000);
	    
	    String s= driver.getTitle();
        System.out.println(s);
	 
	   String Expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actulatitle = driver.getTitle();
        
        if( Expectedtitle.equals(actulatitle))
	    {
	    	System.out.println("test case pass");
	    }
	    else
	    {
	    	System.out.println("test case fail");
	    }
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
