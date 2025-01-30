package testCasesExecution;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.Setup;
import common.Selenium_action;
import page_object.Dashbordpage_Object;
import page_object.Loginpage_Object;

public class TC001 extends Setup {
	
	Selenium_action sa = new Selenium_action();
	Loginpage_Object lpo  = new Loginpage_Object();
	Dashbordpage_Object dpo = new Dashbordpage_Object();
	@Test
	public void verifySucessfullLogin() throws InterruptedException
	{
		sa.openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lpo.executeLogin();
		
		String actualValue = dpo.verifyExecute();
		String expectedValue ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		assertEquals(actualValue, expectedValue);
		
		
	
	}

}
