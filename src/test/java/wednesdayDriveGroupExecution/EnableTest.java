package wednesdayDriveGroupExecution;

import org.testng.annotations.Test;

public class EnableTest {
@Test(groups = "smokeTest")
	public void createTest() {
		System.out.println("created");
	}
@Test(enabled = false,groups = "smokeTest")	
	public void executeTest() {
		System.out.println("executed");
	}
@Test(invocationCount = 0,groups = "smokeTest")	
	public void closeTest() {
		System.out.println("closed");
	}
	
}
