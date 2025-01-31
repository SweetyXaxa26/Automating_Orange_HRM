package testCasesExecution;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import base.Setup;
import common.Selenium_action;
import page_object.Dashbordpage_Object;
import page_object.Loginpage_Object;

public class TC004 extends Setup {
	
	Selenium_action sa = new Selenium_action();
	Loginpage_Object lpo  = new Loginpage_Object();
	Dashbordpage_Object dpo = new Dashbordpage_Object(); 
	
	@Test
	public void verifyLoginwithInvalidCredentials() throws InterruptedException
	{
		sa.openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lpo.executeLogin();
		
		
		
	}

}
