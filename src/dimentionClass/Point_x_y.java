package dimentionClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Point_x_y {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Point p1 = driver.manage().window().getPosition();
		System.out.println(p1);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Point p=new Point(300,300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		
		Dimension d= new Dimension(300,600);
		driver.manage().window().setSize(d);
		

	}

}
