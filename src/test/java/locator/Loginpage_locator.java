package locator;

import org.openqa.selenium.By;

import base.Setup;

public class Loginpage_locator {

	
	
	public By username_loc =By.name("username");
	public By password_loc =By.name("password");
	public  By login_btn_loc = By.xpath("//div/button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button' and @type='submit']");

	public By invalidMsg_loc = By.xpath("//p[text()='Invalid credentials']");
	
	public By forgotpass= By.xpath("");
	
}
