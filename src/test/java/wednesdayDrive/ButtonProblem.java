package wednesdayDrive;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonProblem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Gopinath\\Desktop\\button.html");
		
		 List<WebElement> btn = driver.findElements(By.xpath("//button"));
		 int num=7;
		btn.get(num-1).click();
	}
}
