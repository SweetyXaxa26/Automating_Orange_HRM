package page_object;

import common.Selenium_action;
import locator.Loginpage_locator;

public class Loginpage_Object extends Loginpage_locator
{
	    
	  public   String value_Text_User ="Admin";
	  public   String value_Text_pass ="admin123" ;
	  
	  public   String value_TextUserInvalid ="Admin";
	  public   String value_TextpassInvalid ="ad@890" ;
	  
	  Selenium_action sa = new Selenium_action();
	  public void executeLogin()
	  {
		  sa.enterUsername( username_loc, value_Text_User);
		  sa.enterPassword(password_loc, value_Text_pass);
		  sa.clicklogin(login_btn_loc);
	  }
	
		
	  public void executeLoginInvalidCredencial()
	  {
		  sa.enterUsername( username_loc, value_TextUserInvalid);
		  sa.enterPassword(password_loc, value_TextpassInvalid );
		  sa.clicklogin(login_btn_loc);
		  String text = sa.refrshlogin(invalidMsg_loc);
		  System.out.println("Message : "+ text );
	  }
	
	  public String  verifyLogoutFunctionality()
	  {

			String url = sa.getCurrentUrl();
			System.out.println("Curent Url : "+ url );  
			return url ;
			
	  }

}
