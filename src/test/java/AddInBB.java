import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddInBB {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[qa='searchBar']")).sendKeys("vegetables");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//div[@qa='product_name']"));

		for (int i = 0; i < products.size(); i++)

		{

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (products.contains(itemsNeededList))

			{
                Thread.sleep(2000);
				driver.findElements(By.cssSelector("button[qa='add']")).get(i).click();

			}

		}

	}

}