package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.Setup;

public class Screnshot_Utilities extends Setup {

	public static void captureScrenshot(WebDriver driver) throws IOException 
	{
		//get project path 
		String projPath =System.getProperty("user.dir");
		
		//define Screenshot Folder path
		
		String ScrenshotFolderpath = projPath +"\\report\\Screnshort";
		
		//System.out.println(ScrenshotFolderpath );
		
		TakesScreenshot ts =(TakesScreenshot)driver ;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		File ds= new File(ScrenshotFolderpath +"\\Screen-snap.jpge");
		FileUtils.copyFile(fs,ds);
	}
}
