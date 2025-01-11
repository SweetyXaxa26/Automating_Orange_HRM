package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Setup;

public class Selenium_action extends Setup
{
	
	static WebDriverWait wait = null;
	
	
	public void openURL(String url)
	{
		System.out.println(" Open Website ");
		driver.get(url);
	}
	
	public void enterUsername (By locator , String Text )
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 element.sendKeys(Text );
		 
		 System.out.println("------------------Enter Username------------------ ");
		
	}
	
	public void enterPassword (By locator , String Text)
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		element.sendKeys(Text );
		 
		 
		 System.out.println("-------------------Enter password-----------------  ");
		 String value = element.getText();
		 System.out.println("enter the text enter in password : "+ value );
	}
	
	public void login_to_Account (By locator )
	{
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(element).click().perform();
		 
		 
		 System.out.println("------------------login to account ------------------ ");
		 
	}
	
	public void Dashbord_log_in (By locator )
	{
		
	     System.out.println("--------------------Dashbord home page appear ----------- ");
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 System.out.println("------------------dashbord to admin  ------------------- ");
		 Actions act = new Actions(driver);
		 act.moveToElement(element).click().perform();
		 
		
		 
	}
	
	

}
