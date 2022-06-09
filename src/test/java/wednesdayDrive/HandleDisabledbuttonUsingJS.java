package wednesdayDrive;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledbuttonUsingJS {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Gopinath\\Desktop\\disabled.html");
		
		driver.findElement(By.id("button"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('button').value='dinesh'");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		
	}
}
