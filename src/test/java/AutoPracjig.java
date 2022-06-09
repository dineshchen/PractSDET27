import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoPracjig {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Dinesh\\Selenium\\browserserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		String ExpectedText="Showing 1 - 1 of 1 item";
		String ExpectedPopup="Product successfully added to your shopping cart";
		String ExpectedElement="Continue shopping";
		String ExpectedValue="Proceed to checkout";
// 1. Navigate to URL		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
// 2. Verify site logo		
		boolean Element = driver.findElement(By.xpath("//img[@class='logo img-responsive']")).isDisplayed();
		if(Element==true) {
			System.out.println("Element is visible");
		}else {
			System.out.println("Element is not visible");
		}
		
// 3. Verify women dress-T shirt tab enabled to user.
		//Women tab
		boolean Women = driver.findElement(By.xpath("//a[text()='Women']")).isEnabled();
		if(Women==true) {
			System.out.println("Women tab is enabled");
		}else {
			System.out.println("Women tab is not enabled");
		}
		//Dresses tab
		 boolean Dresses = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[text()='Dresses']")).isEnabled();
		 if(Dresses==true) {
			 System.out.println("Dresses tab is enabled");
		 }else {
			 System.out.println("Dresses tab is not enabled");
		 }
		 //Tshirt tab
		 boolean Tshirt = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[text()='T-shirts']")).isEnabled();
		 if(Tshirt==true) {
			 System.out.println("Tshirt tab is enabled");
		 }else {
			 System.out.println("Tshirt tab is not enabled");
		 }
//4. Click on Tshirt tab
		 WebElement TShirt = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[text()='T-shirts']"));
		 TShirt.click();
		 
//5. Verify header page of T-Shirt
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.xpath("//div[@class='product-count']")).getText());
		 assertEquals("Showing 1 - 1 of 1 item",ExpectedText);
		 
//6. Do mouse hover on image available of the product and click add to cart
		 Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/1-home_default.jpg\"]"))).perform();
		 act.click(driver.findElement(By.xpath("//a[@title='Add to cart']"))).perform();
//7. Verify popup message as Product successfully added to your shopping cart
		 
		 driver.findElement(By.xpath("//h2[contains(.,'Product successfully added to your shopping cart')]"));
		 assertEquals("Product successfully added to your shopping cart", ExpectedPopup);
		 
//8.Verify continue shopping/proceed to checkout ,buttons visible and clickable
		 WebElement ContinueShopping = driver.findElement(By.xpath("//span[contains(.,'Continue shopping')]"));
		 boolean shopping = ContinueShopping.isEnabled();
		 assertEquals("Continue shopping", ExpectedElement);
		 
		 WebElement Checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		 boolean checkout = Checkout.isEnabled();
		 assertEquals("Proceed to checkout", ExpectedValue);
		 
//9. Click proceed to checkout
		// driver.switchTo().frame("Proceed to checkout");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
//10.Verify page header
		 String headText = driver.findElement(By.xpath("//h1[contains(text(),'Shopping-cart summary')]")).getText();
         System.out.println(headText);
        
//11. close the browser
         Thread.sleep(2000);
		 driver.close();
		 
		 
	}

}
