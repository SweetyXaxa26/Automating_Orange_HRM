package locator;

import org.openqa.selenium.By;

public class Dashbordpage_locator {
	
	public By Admin = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']");

	public By Dropdown = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	public By logout = By.xpath("//a[text()='Logout']");
}
