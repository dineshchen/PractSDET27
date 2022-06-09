package wednesdayDriveDistributedParallel;

import org.testng.annotations.Test;

public class EnableTest {
@Test
	public void createTest() {
		System.out.println("created");
	}
@Test(enabled = false)	
	public void executeTest() {
		System.out.println("executed");
	}
@Test(invocationCount = 0)	
	public void closeTest() {
		System.out.println("closed");
	}
	
}
