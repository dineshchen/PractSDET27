import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartInBB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.bigbasket.com/big-indian-grocery-sale/?utm_source=google&gclid=EAIaIQobChMIm_jP0dyB9wIVMZFmAh1rnAc8EAAYASAAEgLzGvD_BwE&utm_campaign=Brand-BLR&utm_medium=cpc");
		String[] itemsneeded = { "Beans", "Tomato", "Cucumber" };
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys("vegetables");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='items']"));
		for (int i = 0; i < lst.size(); i++) {
			String name = lst.get(i).getText();
			
//convert array to arraylist
			 List itemslist = Arrays.asList(itemsneeded);
			if (itemslist.contains(name)) {
				driver.findElements(By.xpath("//button[@qa='add']")).get(i).click();
			}
		}
	}
}
