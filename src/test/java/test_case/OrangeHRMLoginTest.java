package test_case;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLoginTest {


    @Test
    public void testLogin() {
    	
    	 WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
        // Open the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Locate and interact with elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter username
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");

        // Enter password
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        // Click the login button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginButton.click();

        // Add assertions if needed (optional)
        // Example: Verify successful login
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        assert dashboard.isDisplayed();
        driver.quit();
    }

   
    
}
