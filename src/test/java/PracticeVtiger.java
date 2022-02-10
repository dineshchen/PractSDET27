import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeVtiger  {
	
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	Random ran = new Random();
	 int rand=  ran.nextInt(1000);
		driver.get("http:\\localhost:8888\\");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("Arun_"+rand);
		driver.findElement(By.xpath("//select[@name=\"industry\"]")).click();
		WebElement elem=driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		Select s =new Select(elem);
		s.selectByIndex(3);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		
		String text=  driver.findElement(By.xpath("//span[@class=\"small\"]/..")).getText();
		System.out.println(text);
	//Thread.sleep(4000)	;
		//driver.close();
	}

	
	
}

