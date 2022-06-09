package wednesdayDrive;

import org.testng.annotations.Test;

public class DependsOnMethodTest {
@Test
	public void establishconnectionTest() {
		System.out.println("Established");
	}
@Test	(dependsOnMethods="establishconnectionTest")
	public void executeTest() {
		System.out.println("Executed");
	}
@Test	(dependsOnMethods = "establishconnectionTest")
	public void closeconnectionTest() {
		System.out.println("Closed");
	}
}
