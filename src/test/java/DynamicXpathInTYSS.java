import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathInTYSS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testyantra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/ancestor::ul[@class='nav navbar-nav']/descendant::a[text()='Digital Offering']")).click();
	}
}
