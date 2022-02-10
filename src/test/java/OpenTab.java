import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTab {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("//div[@id=\"divUsername\"]")).sendKeys("admin");
		driver.findElement(By.id("//div[@id=\"divPassword\"]")).sendKeys("admin123");
		driver.findElement(By.id("//div[@id=\"divLoginButton\"]/*")).click();
	}

}
