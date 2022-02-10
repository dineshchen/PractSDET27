package practice;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mysql.cj.jdbc.Driver;

public class CreatePurchaseOrderwithItemAndAddProduct {

	public static void main(String[] args) throws Throwable {
		
         System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver\\chromedriver.exe");
         
         WebDriver driver=new ChromeDriver();
         
         driver.get("http://localhost:8888/");
         
         Random ran=new Random();
         int randomNum = ran.nextInt(2000);
         
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.findElement(By.name("user_name")).sendKeys("admin");
         driver.findElement(By.name("user_password")).sendKeys("root");
         driver.findElement(By.id("submitButton")).click();
         driver.findElement(By.xpath("//a[text()=\"More\"]")).click();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//a[@href=\"index.php?module=Vendors&action=index\"]")).click();
         driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"vendorname\"]")).sendKeys("karthi pg_"+randomNum);
         driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
         driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]")).click();
         driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
         driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("Key"+randomNum);
         driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
         driver.findElement(By.xpath("//a[text()=\"More\"]")).click();
         driver.findElement(By.name("Purchase Order")).click();
         
         driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
         driver.findElement(By.xpath("//input[@onfocus=\"this.className='detailedViewTextBoxOn'\"]")).sendKeys("hello"+randomNum);
         driver.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
         
         String mainId=driver.getWindowHandle();
         Set<String>allId=driver.getWindowHandles();
         
         for(String id:allId) {
        	 driver.switchTo().window(id);
         }
         String data = driver.findElement(By.xpath("//div[@style=\"overflow:auto;height:348px;\"]")).getText();
         System.out.println(data);
         
        driver.findElement(By.xpath("//a[@href=\"javascript:window.close();\"]")).click();
       driver.findElement(By.xpath("//textarea[@name=\"bill_street\"]")).sendKeys("Bangalore"+randomNum);
        driver.findElement(By.xpath("//textarea[@name=\"ship_street\"]")).sendKeys("Mysore"+randomNum);
        driver.findElement(By.xpath("//img[@id=\"searchIcon1\"]")).click();
//        driver.findElement(By.xpath("//img[@id=\"searchIcon1\"]")).click();

        // driver.close();

	}

}
