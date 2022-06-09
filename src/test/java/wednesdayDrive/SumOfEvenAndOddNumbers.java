package wednesdayDrive;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int odd=0;
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even=even+a[i];
			}else {
				odd=odd+a[i];
			}
			
		}
		System.out.println("Sum of even numbers:"+even);
		System.out.println("Sum of odd numbers:"+odd);
	}
}
