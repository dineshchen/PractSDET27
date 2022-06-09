package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions act=new Actions(driver);
		
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
		
		act.dragAndDrop(source, target).perform();
		driver.switchTo().defaultContent();


	}
}
