package wednesdayDriveDistributedParallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class AnnotaionsInTestNGTest {
@BeforeSuite
	public void connectToDBTest() {
		System.out.println("Connection to DB Established");
	}
@BeforeClass
	public void launchTheBrowserTest() {
		System.out.println("Browser launched");
	}
@BeforeMethod
	public void loginToPageTest() {
		System.out.println("logged in successfully");
	}
@BeforeTest
	public void createAnnotTest() {
		System.out.println("Created");
	}
@Test
    public void executeAnnotTest() {
	    System.out.println("Executed");
    }
@AfterTest
    public void closeAnnotTest() {
	    System.out.println("closed");
}
@AfterMethod
	public void logoutToPageTest() {
		System.out.println("loggedout successfully");
	}
@AfterClass
	public void closeTheBrowserTest() {
		System.out.println("Browser closed");
	}
@AfterSuite
	public void disconnectToDBTest() {
		System.out.println("Disconnected from DB");
	}
}
