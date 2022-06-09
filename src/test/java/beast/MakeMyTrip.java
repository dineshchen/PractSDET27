package beast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
	
	driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("maa");
	driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();

	driver.findElement(By.xpath("//input[@type='text' and @placeholder='To']")).sendKeys("bom");
	driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	driver.findElement(By.xpath("//div[@aria-label=\"Sun Mar 27 2022\"]")).click();
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	
}
}
