package wednesdayDrive;

import org.testng.annotations.Test;

@Test
public class PriorityTest {
@Test(priority=1)
	public void closeDbTest() {
		System.out.println("Db closed");
	}
@Test(priority=0)
	public void executeDBScript() {
		System.out.println("Script executed success");
	}
@Test(priority=-1)
	public void establishDbTest() {
		System.out.println("Connection established successfully");
	}
}
