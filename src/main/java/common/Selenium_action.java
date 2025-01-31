package common;

import java.time.Duration;
import org.openqa.selenium.By;
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
		driver.get(url);
	}
	
	public void enterUsername(By locator , String Text )
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 element.sendKeys(Text );
			
	}
	
	public void enterPassword(By locator , String Text)
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 element.sendKeys(Text );
	}
	
	public void clicklogin(By locator )
	{
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 Actions act = new Actions(driver);
		 act.moveToElement(element).click().perform();
		
	}
	
	public String  refrshlogin(By locator)
	{
		WebElement element = driver.findElement(locator);
		String text = element.getText();
		return text ;	
	}
	
	public String getCurrentUrl()
	{
		  String element  = driver.getCurrentUrl();
		  return element  ;
	}
	
	public void  clickLogOut(By locator1 , By locator2 )
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element1  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
		Actions act = new Actions(driver);
		act.moveToElement(element1).click().perform();	
		
		WebElement element2  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		act.moveToElement(element2).click().perform();	
	}
	
	public void clickForgotPasswowrd(By locator)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element  = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();	
	}
	
	
	

}
