
public class StrongNumber {
	public static void main(String[] args) {
		int num=144;
		int m=num;
		
		int sum=0;
		while(m>0) {
		int digit=m%10;
		
		int fact=1;
		while(digit>0) {
			fact=fact*digit;
			digit--;
		}
		m=m/10;
		sum=sum+fact;
		}if(num==sum) {
			System.out.println(num+" "+"Strong Number");	
		}else {
			System.out.println(num+" "+"Not a Strong Number");
		}
		
	}
	
}