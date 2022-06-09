import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Redbusjig {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String ExpCode = "Use Code RBTRAVEL10";
		String ExpText = "What is the Offer";

// 1.Open www.redbus.in in chrome	
		driver.get("https://www.redbus.in/");
// 2. Verify Use Code RBTRAVEL10 in homepage
		String code = driver.findElement(By.xpath("//span[contains(text(),'Use Code RBTRAVEL10')]")).getText();
		Assert.assertEquals(code, ExpCode);
// 3. Click and verify Use Code RBTRAVEL10 and verify the offers terms page is displayed
		driver.findElement(By.xpath("//li[@data-link=\"https://www.redbus.in/info/OfferTerms#RBTRAVEL10\"]")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String ActText = driver.findElement(By.xpath("//div[@class='headingWrap']")).getText();
		Assert.assertEquals(ActText, ExpText);
// 4. close the child tab and search for travel from Mumbai to Bangalore for nextday and click on search bus
		driver.close();
		driver.switchTo().window(parentId);
		WebElement src = driver.findElement(By.xpath("//input[@id='src']"));
		src.sendKeys("Mumbai");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(src.findElement(
				By.xpath("//*[@class='autoFill homeSearch']/li[@class='sub-city' and text()= 'Thane West, Mumbai']")))
				.click().build().perform();

		WebElement dst = driver.findElement(By.xpath("//input[@id='dest']"));
		dst.sendKeys("Bangalore");
		Thread.sleep(3000);
		act.moveToElement(dst.findElement(
				By.xpath("//*[@class='autoFill homeSearch']/li[@class='sub-city' and text()= 'Madiwala, Bangalore']")))
				.click().build().perform();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();

		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, 1);
		Date tomorrow = cal.getTime();
		driver.findElement(
				By.xpath("//table/tbody/tr/td[@class='current day']/following-sibling::td[@class='wd day'][1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
// 5. Count and print no.of records displayed on search	
		Thread.sleep(2000);
		String searchResult = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(searchResult);

//6. Verify live tracking for "Sharma Transports AC Sleeper(2+1) 19:00" is available and view status
		Thread.sleep(2000);
		String seatsAvail = driver
				.findElement(By.xpath("//li[@id='11664066']/descendant::div[@class='seat-left m-top-30']")).getText();
		String s = "seatsAvail";
		int i = Integer.parseInt(s);
		if (i >= 1) {
			System.out.println(i);
		} else {
			System.out.println("Seats Not Available");
		}
//7.Validate the bus,location and time and rating detais on navigation are same as displayed on grid page

	}
}
