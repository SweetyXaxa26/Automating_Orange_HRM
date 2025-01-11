package locator;

import org.openqa.selenium.By;

import base.Setup;

public class Login_page_locator {

	//locator for the login page
	
//	public By username_loc = By.xpath("//div/input[@class='oxd-input oxd-input--active' and @name='username']");
//	public By password_loc = By.xpath("//div/input[@class='oxd-input oxd-input--active' and @name='password']");
//public  By login_btn_loc = By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button");

	
	public By username_loc =By.name("username");
	public By password_loc =By.name("password");
	public  By login_btn_loc = By.xpath("//div/button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button' and @type='submit']");

		
	
}
