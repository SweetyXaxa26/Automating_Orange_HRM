package test_case;

import org.testng.annotations.Test;

import base.Setup;
import common.Selenium_action;
import locator.Dashbord_home_page_locator;
import locator.Login_page_locator;
import page_object.Login_page_Object;

public class HRM001 extends Setup
{
	
	Selenium_action sa = new Selenium_action();
	

	
	@Test 
	public void Script001() throws InterruptedException
	{
		
		sa.openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Login_page_locator log_Pag_locator = new Login_page_locator();
		Login_page_Object log_Pag_Obj = new Login_page_Object ();
		Dashbord_home_page_locator Dashbord_page_locator = new Dashbord_home_page_locator ();
		
		sa.enterUsername(log_Pag_locator.username_loc, log_Pag_Obj.value_Text_User );
		
		sa.enterPassword(log_Pag_locator.password_loc , log_Pag_Obj.value_Text_pass );
		
		sa.login_to_Account(log_Pag_locator.login_btn_loc);
		
		sa.Dashbord_log_in(Dashbord_page_locator.Admin);
		
		
		
		Thread.sleep(7000);
		
//		
		
	}

}
