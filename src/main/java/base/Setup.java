package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utilities.Screnshot_Utilities;

public class Setup implements ITestListener{
	
	 public static WebDriver driver =null;
	 
	@BeforeSuite
		public void bs()
		{
	    	System.out.println("----------------------BeforeSuite");
			
		}
		
	    @BeforeTest
		public void bt()
		{
	    	System.out.println("-----------------------BeforeTest");
		}
		
	    @BeforeClass
		public void bc()
		{
	    	System.out.println("-------------------------BeforeClass");
		}
		
	    @BeforeMethod
		public void bm()
		{   
	    	System.out.println("--------------------------BeforeMethod");
	    	
	    	driver = new ChromeDriver();
	    	 
	 		//Implicit wait 
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();
			
	    	
	       
			
		}
		
	    @AfterMethod
		public void am()
		{
	    	driver.close();
	    	System.out.println("----------------------------AfterMethod");
		}
		
	    @AfterClass
		public void ac()
		{
	    	System.out.println("------------------------------AfterClass");
		}
		
	    @AfterTest
		public void at()
		{
	    	System.out.println("-------------------------------AfterTest");
		}
	    
	    @AfterSuite
		public void as()
		{
	    	System.out.println("-------------------------------AfterSuite");
		}

	    //-------------------implemented method-------------------------------
	    
	    
	    @Override
		public void onTestStart(ITestResult result) {
			
	    	System.out.println("---------------------------------------------------> onTestStart");
	    	
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("---------------------------------------------------> onTestSuccess");	
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("---------------------------------------------------> onTestFailure");	
	
			System.out.println("[----Taking Screnshort-----------------------] ");
			try {
				Screnshot_Utilities.captureScrenshot(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("---------------------------------------------------> onTestSkipped");
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("---------------------------------------------------> onTestFailedButWithinSuccessPercentage");	
			
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			System.out.println("---------------------------------------------------> onTestFailedWithTimeout");	
			
		}

		@Override
		public void onStart(ITestContext context) {
			System.out.println("---------------------------------------------------> onStart");	
			
		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("---------------------------------------------------> onFinish");	
			
		}

}
