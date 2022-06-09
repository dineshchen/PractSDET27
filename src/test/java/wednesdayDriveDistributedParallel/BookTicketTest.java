package wednesdayDriveDistributedParallel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicketTest {
@Test(dataProvider="dataProvider_bookTicketTest")
	public void bookTicketTest(String src,String dest) {
		System.out.println(src+","+dest);
	}
@DataProvider
	public Object[][] dataProvider_bookTicketTest(){
		Object[][]objarr=new Object[2][2];
		
		objarr[0][0]="Bangalore";
		objarr[0][1]="Mysore";
		
		objarr[1][0]="Whitefield";
		objarr[1][1]="Majestic";
		
		return objarr;
	}
}
