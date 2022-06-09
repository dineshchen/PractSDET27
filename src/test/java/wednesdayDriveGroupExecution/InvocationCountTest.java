package wednesdayDriveGroupExecution;

import org.testng.annotations.Test;

@Test(invocationCount=3,groups = "smokeTest")
public class InvocationCountTest {

	@Test(groups = "smokeTest")
	public void createInvocationTest() {
		System.out.println("Executed");
	}
}
