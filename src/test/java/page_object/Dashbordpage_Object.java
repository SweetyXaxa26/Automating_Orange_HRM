package page_object;

import common.Selenium_action;
import locator.Dashbordpage_locator;

public class Dashbordpage_Object extends Dashbordpage_locator {
	
	Selenium_action sa = new Selenium_action();
	
	public String  verifyExecute()
	{
		
		String getValue = sa.verify();
		System.out.println(getValue);
		return getValue ;
	}
	
	
	

}
