package sceenshots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class B_UtilClass {
	
	public static void takeSS(WebDriver driver, String filename) throws IOException, InterruptedException
	{
		
		String path = "H:\\seleniumScreenShots\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path+filename+".png");
		FileHandler.copy(src, des);
		Thread.sleep(2000);
		System.out.println("screenshot taken sucessfully");
	}
	
}
