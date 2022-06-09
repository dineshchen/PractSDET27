package popups;

import java.util.concurrent.TimeUnit;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,20);
	driver.get("http://localhost:8888/");
	
	driver.manage().window().maximize();
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("root");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
	driver.findElement(By.id("1351")).click();
	driver.findElement(By.xpath("//input[@class=\"crmbutton small delete\"]")).click();
	
	Alert alt=driver.switchTo().alert();
	String s=alt.getText();
	System.out.println(s);
	
	
	alt.dismiss();
	driver.close();
	
	
}
}
