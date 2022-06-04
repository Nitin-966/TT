
package FlipkartTestClass;

import org.testng.annotations.Test;

public class TC01VerifiyValidUserNameAndPassword extends BaseClass
{

	@Test 
	
	public void loginfunctionality()
	{
		String Expectedurl = "https://www.flipkart.com/";
		String Actualurl = driver.getCurrentUrl();
	
	    if(Expectedurl.equals(Actualurl))
	    {
	    	System.out.println("test case pass");
	    }
	    else
	    {
	    	System.out.println("test case fail");
	    }
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
