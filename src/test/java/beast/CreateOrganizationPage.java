package beast;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrganizationPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		
		Random ran=new Random();
		int ranDomNum = ran.nextInt(100);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
        
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.name("accountname")).sendKeys("Deva"+ranDomNum);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		driver.close();
	}

}
