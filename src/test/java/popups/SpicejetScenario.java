package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpicejetScenario {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.spicejet.com/");

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-Notifications");

driver.findElement(By.xpath("//div[text()='one way']")).click();
driver.findElement(By.xpath("//div[text()='From']")).click();
driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
driver.findElement(By.xpath("//div[text()='Delhi']")).click();
driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/parent::div/descendant::div[@class='css-1dbjc4n']/descendant::div[text()='23']")).click();

	}
}
