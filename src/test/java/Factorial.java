import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int res = sc.nextInt();
		System.out.println("Enter a number:");
		
		long fact=1;
		for(int i=1;i<=res;i++) {
			fact=fact*i;
		}*/
	/*	int fact=1;
		int res=3;
		for(int i=1;i<=res;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		*/
	  int a[]=new int[] {36,40,12,40,38,121};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		
			if(a[i]>max) {
				max=a[i];
			}	
		
		}System.out.println(+max);
	}
}
