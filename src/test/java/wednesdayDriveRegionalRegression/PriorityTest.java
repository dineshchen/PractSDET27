package wednesdayDriveRegionalRegression;

import org.testng.annotations.Test;

@Test
public class PriorityTest {
@Test(priority=1,groups = "regionalRegression")
	public void closeDbTest() {
		System.out.println("Db closed");
	}
@Test(priority=0,groups = "regionalRegression")
	public void executeDBScript() {
		System.out.println("Script executed success");
	}
@Test(priority=-1,groups = "regionalRegression")
	public void establishDbTest() {
		System.out.println("Connection established successfully");
	}
}
