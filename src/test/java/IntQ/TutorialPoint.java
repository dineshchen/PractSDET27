package IntQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPoint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search-strings']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//button[@id='btnSearch']")).click();
		
		
		
	}

}
